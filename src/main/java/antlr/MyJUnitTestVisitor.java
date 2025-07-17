package antlr;

import antlr.parameters.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class MyJUnitTestVisitor extends JUnitGenBaseVisitor<Void> {
    String className;
    ArrayList<Constructor> constructor = new ArrayList<>();
    Constructor inputConstructor = new Constructor();
    MyParamVisitor paramVisitor = new MyParamVisitor();
    ArrayList<Test> tests = new ArrayList<>();
    JUnitGenParser.MethodDeclarationContext lastMethod = null;
    ArrayList<Param> mockTypes = new ArrayList<>(); // types which should be mocked
    ArrayList<String> exprs = new ArrayList<>(); // mock expressions
    ArrayList<Param> methodParams = new ArrayList<>(); // a methods input params and local params
    HashMap<String, ArrayList<String>> mockMethodParams = new HashMap<>(); // mock methods parameters for verify()
    HashMap<String, String> mockClasses = new HashMap<>(); // mock classes which has mock verion

    @Override
    public Void visitImportDeclaration(JUnitGenParser.ImportDeclarationContext ctx) {
        clearWriter();

        String importName = ctx.importName.getText();
        writeLine("import " + importName + ";\n");

        return super.visitImportDeclaration(ctx);
    }

    @Override
    public Void visitClassDeclaration(JUnitGenParser.ClassDeclarationContext ctx) {
        className = ctx.className.getText();
        basicImports();
        loadParamConfig();
        lastMethod = setLastMethod(ctx);
        mockClasses = paramVisitor.getMockClasses();
        mockConstructorCreation(ctx);
        inputConstructor = paramVisitor.getConstructor();

        mockFieldCreation(ctx);
        if(!mockTypes.isEmpty())
            mockImports();

        classSetup();
        testSetup();

        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Void visitMethodDeclaration(JUnitGenParser.MethodDeclarationContext ctx) {
        for (Test currentTest : tests) {
            if (ctx.methodName.getText().equals(currentTest.getMethodName())) {
                writeLine("\t@Test\n");
                writeLine("\tvoid " + currentTest.getTestName() + "() {\n");

                for (Assert currentAssert : currentTest.getAssertions()) {
                    if (currentAssert.getExpect() != null) {
                        assertSetup(currentTest, currentAssert);
                    }
                    else if (currentAssert.getExpection() != null)
                        writeLine("\t\tException exception = assertThrows(" + currentAssert.getExpection() + ".class, () -> " + lowercaseFirstLetter(className) + "." + currentTest.getMethodName() + "(");

                    for (Param currentParam : currentAssert.getParams()) {
                        if(currentAssert.getExpection() != null || currentAssert.getExpect() != null) {
                            writeLine(currentParam.getValue().getFirst());
                            if (currentAssert.getParams().size() > 1 && !currentAssert.getParams().getLast().equals(currentParam))
                                writeLine(", ");
                        }
                    }

                    visitExpressionsIn(ctx);

                    boolean verify = false;
                    // mocking
                    for(Param mock : mockTypes) {
                        for (String expr : exprs) {
                            if (expr.startsWith(mock.getParamName() + ".")) {
                                if(verify)
                                    writeLine("));\n");

                                writeLine("\t\tverify(" + mock.getParamName() + ", times(1))." + expr.replace(mock.getParamName() + ".", ""));
                                verifyMethodParams(mockMethodParams.get(expr));
                                verify = true;
                            }
                        }
                    }

                    if (currentAssert.getExpection() != null && currentAssert.getExpectMessage() != null)
                        writeLine("));\n\t\tassertEquals(" + currentAssert.getExpectMessage() + ", exception.getMessage());\n\t}\n\n");
                    else
                        writeLine("));\n\t}\n\n");

                    exprs.clear();
                    methodParams.clear();
                    mockMethodParams.clear();
                }
            }
        }

        if(lastMethod.equals(ctx))
            writeLine("}");

        return super.visitMethodDeclaration(ctx);
    }

    private void verifyMethodParams(ArrayList<String> mockMethodParams) {
        writeLine("(");
        for(String mockParam : mockMethodParams) {
            for(Param methodParam : methodParams) {
                if(mockParam.equals(methodParam.getParamName())) {
                    writeLine("any(" + methodParam.getType() + ".class)");
                    if(!mockParam.equals(mockMethodParams.getLast())) {
                        writeLine(", ");
                    }
                }
            }

            boolean exist = false;
            for(Param methodParam : methodParams) {
                if (methodParam.getParamName().equals(mockParam)) {
                    exist = true;
                }
            }
            if(!exist) {
                writeLine(mockParam);
                if(!mockParam.equals(mockMethodParams.getLast())) {
                    writeLine(", ");
                }
            }
        }
    }

    private void visitExpressionsIn(JUnitGenParser.MethodDeclarationContext ctx) {
        ctx.accept(new JUnitGenBaseVisitor<Void>() {
            @Override
            public Void visitType(JUnitGenParser.TypeContext ctx) {
                if (ctx.getText().contains(".") && !ctx.getText().startsWith(".")) {
                    exprs.add(ctx.getText());
                }
                return super.visitType(ctx);
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
                    for (String expr : exprs) {
                        if (ctx.getParent().getChild(0).getText().equals(expr) && expr.startsWith(mock.getParamName() + ".") && !ctx.param().isEmpty()) {
                            ArrayList<String> mockMethodParamsTemp = new ArrayList<>();
                            for(JUnitGenParser.ParamContext param : ctx.param()) {
                                mockMethodParamsTemp.add(param.type().ID().getText());
                            }
                            if(!mockMethodParams.containsKey(expr))
                                mockMethodParams.put(expr, mockMethodParamsTemp);
                        }
                    }
                }
                return super.visitMethodDecl(ctx);
            }
        });
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

    private boolean methodParamExist(String paramName) {
        for(Param methodParam : methodParams) {
            if(methodParam.getParamName().equals(paramName))
                return false;
        }
        return true;
    }

    private void basicImports() {
        writeLine("import static org.junit.jupiter.api.Assertions.*;\n");
        writeLine("import org.junit.jupiter.api.Test;\n");
        writeLine("import org.junit.jupiter.api.BeforeEach;\n\n");
    }

    private void mockImports() {
        writeLine("import static org.mockito.Mockito.*;\n\n");
    }

    private void assertSetup(Test currentTest, Assert currentAssert) {
        switch(currentAssert.getExpect()) {
            case "true":
                writeLine("\t\tassertTrue(" + lowercaseFirstLetter(className) + "." + currentTest.getMethodName() + "(");
                break;
            case "false":
                writeLine("\t\tassertFalse(" + lowercaseFirstLetter(className) + "." + currentTest.getMethodName() + "(");
                break;
            case "null":
                writeLine("\t\tassertNull(" + lowercaseFirstLetter(className) + "." + currentTest.getMethodName() + "(");
                break;
            case "notnull":
                writeLine("\t\tassertNotNull(" + lowercaseFirstLetter(className) + "." + currentTest.getMethodName() + "(");
                break;
            default:
                writeLine("\t\tassertEquals(" + currentAssert.getExpect() + ", " + lowercaseFirstLetter(className) + "." + currentTest.getMethodName() + "(");
                break;
        }
    }

    private void classSetup() {
        writeLine("class " + className + "Test {\n");
        if(!mockTypes.isEmpty()) {
            for(Param mockType : mockTypes) {
                if(mockClasses.containsKey(mockType.getType())) {
                    writeLine("\t// Using custom mock for " + mockType.getType() + " class\n");
                    writeLine("\tprivate " + mockClasses.get(mockType.getType()) + " " + mockType.getParamName() + ";\n");
                }
                else {
                    writeLine("\tprivate " + mockType.getType() + " " + mockType.getParamName() + ";\n");
                }
            }
        }
        writeLine("\tprivate " + className + " " + lowercaseFirstLetter(className) + ";\n");
        writeLine("\n");
    }

    private void testSetup() {
        writeLine("\t@BeforeEach\n");
        writeLine("\tvoid setUp() {\n");
        for(Param mockType : mockTypes) {
            if(mockClasses.containsKey(mockType.getType())) {
                writeLine("\t\t" + mockType.getParamName() + " = new " + mockClasses.get(mockType.getType()) + "();\n");
            }
            else {
                writeLine("\t\t" + mockType.getParamName() + " = mock(" + mockType.getType() + ".class);\n");
            }

        }

        writeLine("\t\t" + lowercaseFirstLetter(className) + " = new " + className + "(");
        if(!constructor.isEmpty() && inputConstructor != null) {
            for(Constructor currentConstructor : constructor) {
                for(Param param : currentConstructor.getParams()) {
                    for (Param paramConst : inputConstructor.getParams()) {
                        if (paramConst.getParamName().equals(param.getParamName()))
                            param.setValue(paramConst.getValue());
                    }
                }
            }
            useConstructor();
        }
        writeLine(");\n\t}\n\n");
    }

    private void loadParamConfig() {
        try {
            String input = Files.readString(Paths.get("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\src\\main\\java\\input\\generate\\ParamGen.cfg"));
            ParamGenLexer lexer = new ParamGenLexer(CharStreams.fromString(input));
            ParamGenParser parser = new ParamGenParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.templateFile();
            paramVisitor.visit(tree);
            tests = paramVisitor.getAllTest();
        }
        catch (IOException e) {
            throw new RuntimeException("Could not read parameter file", e);
        }
    }

    public void mockConstructorCreation(JUnitGenParser.ClassDeclarationContext ctx) {
        for(JUnitGenParser.ClassBodyElementContext classElement : ctx.classBodyElement()) {
            if(classElement.constructorDeclaration() != null) {
                Constructor currentConstructor = new Constructor();
                for(JUnitGenParser.ParamDeclarationContext param : classElement.constructorDeclaration().paramDeclaration()) {
                    currentConstructor.setParam(new Param(param.paramType.getText(), param.paramName.getText()));
                    if(param.paramType.ID() != null) {
                        Param currentParam = new Param(param.paramType.ID().getText(), param.paramName.getText());
                        for(Param mock : mockTypes) {
                            if(!mock.getParamName().equals(currentParam.getParamName()) && !mock.getType().equals(currentParam.getType()))
                                mockTypes.add(new Param(param.paramType.ID().getText(), param.paramName.getText()));
                        }
                    }
                }
                constructor.add(currentConstructor);
            }
        }
    }

    public void mockFieldCreation(JUnitGenParser.ClassDeclarationContext ctx) {
        for(JUnitGenParser.ClassBodyElementContext classElement : ctx.classBodyElement()) {
            if(classElement.field() != null) {
                if(classElement.field().fieldType.ID() != null) {
                    mockTypes.add(new Param(classElement.field().fieldType.ID().getText(), classElement.field().fieldName.getText()));
                }
            }
        }
    }

    private String lowercaseFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toLowerCase() + input.substring(1);
    }

    private void useConstructor() {
        Constructor bestConstructor = null;
        int maxSetValues = -1;

        for (Constructor currentConstructor : constructor) {
            int setValues = 0;
            boolean allNonMockParamsSet = true;

            for (Param param : currentConstructor.getParams()) {
                boolean isMockType = false;
                for (Param mock : mockTypes) {
                    if(mock.getType().equals(param.getType()))
                        isMockType = true;

                }

                if (!isMockType && param.getValue() == null)
                    allNonMockParamsSet = false;
                if (!isMockType && param.getValue() != null)
                    setValues++;
            }

            if (allNonMockParamsSet && setValues > maxSetValues) {
                maxSetValues = setValues;
                bestConstructor = currentConstructor;
            }
        }

        if (bestConstructor != null && !bestConstructor.getParams().isEmpty()) {
            for (int i = 0; i < bestConstructor.getParams().size(); i++) {
                Param param = bestConstructor.getParams().get(i);
                boolean isMockType = mockTypes.contains(param.getType());

                if (!isMockType) {
                    if (param.getValue() != null) {
                        writeLine(param.getValue().getFirst());
                    }
                    else {
                        writeLine(param.getParamName());
                    }
                }
                else {
                    writeLine(param.getParamName());
                }

                if (i < bestConstructor.getParams().size() - 1) {
                    writeLine(", ");
                }
            }
        }
    }

    private static void writeLine(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\TestClass.java", true))) {
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(line);
    }

    private void clearWriter() {
        try (BufferedWriter clearWriter = new BufferedWriter(new FileWriter("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\TestClass.java", false))) {
            clearWriter.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
