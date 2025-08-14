package antlr;

import java.util.*;
import antlr.parameters.*;

public class TestDataCollectorVisitor extends JUnitGenBaseVisitor<Void> {
    private String className;

    private final List<Constructor> mockConstructors = new ArrayList<>();
    private final List<Param> mockTypes = new ArrayList<>();
    private final List<String> expressions = new ArrayList<>();
    private final List<Param> methodParams = new ArrayList<>(); // a methods input params and local params
    private final List<String> ifStatements = new ArrayList<>();

    private final Map<String, ArrayList<String>> mockMethodParams = new HashMap<>(); // mock methods parameters for verify()

    private JUnitGenParser.MethodDeclarationContext lastMethod;

    @Override
    public Void visitClassDeclaration(JUnitGenParser.ClassDeclarationContext ctx) {
        className = ctx.className.getText();
        lastMethod = setLastMethod(ctx);
        mockConstructorCreation(ctx);
        mockFieldCreation(ctx);
        return super.visitClassDeclaration(ctx);
    }

    public void visitExpressionsIn(JUnitGenParser.MethodDeclarationContext ctx) {
        ctx.accept(new JUnitGenBaseVisitor<Void>() {
            @Override
            public Void visitExpr(JUnitGenParser.ExprContext ctx) {
                if (ctx.getText().contains(".") && !ctx.getText().startsWith(".")) {
                    String noParams = ctx.getText().split("\\(")[0];

                    int secondDotIndex = noParams.indexOf('.', noParams.indexOf('.') + 1);
                    if (secondDotIndex != -1)
                        noParams = noParams.substring(0, secondDotIndex);

                    if(!expressions.contains(noParams))
                        expressions.add(noParams);
                }
                return super.visitExpr(ctx);
            }
        });
        ctx.accept(new JUnitGenBaseVisitor<Void>() {
            @Override
            public Void visitIfStmt(JUnitGenParser.IfStmtContext ctx) {
                String conditionExpr = ctx.expr().getText();
                ifStatements.add(conditionExpr);
                return super.visitIfStmt(ctx);
            }
        });
        ctx.accept(new JUnitGenBaseVisitor<Void>() {
            @Override
            public Void visitVarDecl(JUnitGenParser.VarDeclContext ctx) {
                if(methodParamExist(ctx.ID().getText()))
                    methodParams.add(new Param(ctx.type().getText(), ctx.ID().getText()));
                return super.visitVarDecl(ctx);
            }
        });
        ctx.accept(new JUnitGenBaseVisitor<Void>() {
            @Override
            public Void visitParamDeclaration(JUnitGenParser.ParamDeclarationContext ctx) {
                if(methodParamExist(ctx.ID().getText()))
                    methodParams.add(new Param(ctx.type().getText(), ctx.ID().getText()));
                return super.visitParamDeclaration(ctx);
            }
        });
        ctx.accept(new JUnitGenBaseVisitor<Void>() {
            @Override
            public Void visitMethodDecl(JUnitGenParser.MethodDeclContext ctx) {
                for(Param mock : mockTypes) {
                    for (String expr : expressions) {
                        if (ctx.getParent().getChild(0).getText().equals(expr) && expr.startsWith(mock.getParamName() + ".") && !ctx.param().isEmpty()) {
                            ArrayList<String> mockMethodParamsTemp = new ArrayList<>();
                            for(JUnitGenParser.ParamContext param : ctx.param())
                                mockMethodParamsTemp.add(param.type().ID().getText());
                            if(!mockMethodParams.containsKey(expr))
                                mockMethodParams.put(expr, mockMethodParamsTemp);
                        }
                    }
                }
                return super.visitMethodDecl(ctx);
            }
        });
    }

    public void clearMethodState() {
        expressions.clear();
        methodParams.clear();
        mockMethodParams.clear();
        ifStatements.clear();
    }

    private boolean methodParamExist(String paramName) {
        return methodParams.stream().noneMatch(p -> p.getParamName().equals(paramName));
    }

    private JUnitGenParser.MethodDeclarationContext setLastMethod(JUnitGenParser.ClassDeclarationContext ctx) {
        JUnitGenParser.MethodDeclarationContext last = null;
        for (JUnitGenParser.ClassBodyElementContext elementCtx : ctx.classBodyElement()) {
            if (elementCtx.methodDeclaration() != null) {
                last = elementCtx.methodDeclaration();
            }
        }
        return last;
    }

    /**
     * go through the input constructors parameters and save mock parameters
     * create constructors as well
     * @param ctx
     */
    private void mockConstructorCreation(JUnitGenParser.ClassDeclarationContext ctx) {
        for (JUnitGenParser.ClassBodyElementContext classElement : ctx.classBodyElement()) {
            if (classElement.constructorDeclaration() != null) {
                Constructor currentConstructor = new Constructor();
                for (JUnitGenParser.ParamDeclarationContext param : classElement.constructorDeclaration().paramDeclaration()) {
                    currentConstructor.setParam(new Param(param.paramType.getText(), param.paramName.getText()));
                    if(param.paramType.ID() != null) {
                        Param currentParam = new Param(param.paramType.ID().getText(), param.paramName.getText());
                        if (!containsParam(mockTypes, currentParam)) {
                            mockTypes.add(currentParam);
                            System.out.println("const: " + param.paramName.getText());
                        }
                    }
                }
                mockConstructors.add(currentConstructor);
            }
        }
    }

    /**
     * go through fields to get mocks
     * @param ctx
     */
    private void mockFieldCreation(JUnitGenParser.ClassDeclarationContext ctx) {
        for (JUnitGenParser.ClassBodyElementContext classElement : ctx.classBodyElement()) {
            if (classElement.field() != null && classElement.field().fieldType.ID() != null) {
                Param currentParam = new Param(classElement.field().fieldType.ID().getText(),
                        classElement.field().fieldName.getText());

                if (!containsParam(mockTypes, currentParam)) {
                    mockTypes.add(currentParam);
                    System.out.println("field: " + classElement.field().fieldName.getText());
                }
            }
        }
    }

    private boolean containsParam(List<Param> list, Param param) {
        for (Param p : list) {
            if (p.getType().equals(param.getType()) &&
                    p.getParamName().equals(param.getParamName())) {
                return true;
            }
        }
        return false;
    }

    public String getClassName() { return className; }
    public List<Constructor> getMockConstructors() { return mockConstructors; }
    public List<Param> getMockTypes() { return mockTypes; }
    public JUnitGenParser.MethodDeclarationContext getLastMethod() { return lastMethod; }
    public List<String> getExpressions() { return expressions; }
    public List<Param> getMethodParams() { return methodParams; }
    public List<String> getIfStatements() { return ifStatements; }
    public Map<String, ArrayList<String>> getMockMethodParams() { return mockMethodParams; }
}
