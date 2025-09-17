package antlr.parameters;

import antlr.Constructor;
import antlr.RuntimeErrorHandler;

import java.util.ArrayList;
import java.util.HashMap;

public class MyParamVisitor extends ParamGenBaseVisitor<Void> {
    private final ArrayList<Test> tests = new ArrayList<>();
    private final RuntimeErrorHandler errorHandler = new RuntimeErrorHandler();
    Test currentTest;
    Assert currentAssert;
    Param currentParam;
    Constructor constructor = null;
    ArrayList<Param> params = new ArrayList<>();
    ArrayList<String> values = new ArrayList<>();
    HashMap<String, String> mockClasses = new HashMap<>();

    @Override
    public Void visitConstructorSet(ParamGenParser.ConstructorSetContext ctx) {
        constructor = new Constructor();
        params = new ArrayList<>();

        return super.visitConstructorSet(ctx);
    }

    @Override
    public Void visitParamSet(ParamGenParser.ParamSetContext ctx) {
        if (ctx.getText().contains("TESTMETHOD"))
            errorHandler.throwError(ctx.getStart(), "missing test case name");
        if ((ctx.methodName.getText().equals("<missing ID>")))
            errorHandler.throwError(ctx.getStart(), "missing testing method name");
        if (ctx.getText().contains("<missing 'METHOD'>"))
            errorHandler.throwError(ctx.getStart(), "missing 'METHOD' command");

        currentTest = new Test(ctx.testName.getText(), ctx.methodName.getText());
        currentAssert = new Assert();
        params = new ArrayList<>();

        return super.visitParamSet(ctx);
    }

    @Override
    public Void visitMockSpec(ParamGenParser.MockSpecContext ctx) {
        if(ctx.ID().size() != 2 || ctx.getText().contains("TEST") || ctx.getText().contains("<missing ID>"))
            errorHandler.throwError(ctx.getStart(),"there should be 2 classes");

        mockClasses.put(ctx.ID(0).getText(), ctx.ID(1).getText());

        return super.visitMockSpec(ctx);
    }

    @Override
    public Void visitParamSpec(ParamGenParser.ParamSpecContext ctx) {
        if (ctx.getText().contains("PARAMVALUE"))
            errorHandler.throwError(ctx.getStart(), "missing parameter type and name");
        if (ctx.getText().contains("<missing ID>"))
            errorHandler.throwError(ctx.getStart(), "missing parameter type or name");

        currentParam = new Param(ctx.paramType.getText(), ctx.paramName.getText());

        return super.visitParamSpec(ctx);
    }

    @Override
    public Void visitParamInput(ParamGenParser.ParamInputContext ctx) {
        values = new ArrayList<>();

        if (ctx.getText().equals(ctx.getStart().getText()))
            errorHandler.throwError(ctx.getStart(), "missing value");

        switch (ctx.getStart().getText()) {
            case "VALUES":
                for (var literal : ctx.literal())
                    values.add(literal.getText());
                break;

            case "VALUE":
                values.add(ctx.literal(0).getText());
                break;

            default:
                errorHandler.throwError(ctx.getStart(),"missing value declaration");
        }

        currentParam.setValue(values);
        params.add(currentParam);

        if(ctx.parent.getParent().getText().contains("CONSTRUCTOR")) {
            constructor.setParams(params);
        }
        else if(!ctx.parent.getParent().getText().contains("EXPECT") && !ctx.parent.getParent().getText().contains("EXPECT_EXCEPTION")) {
            currentAssert.setParams(params);
            currentTest.addAssert(currentAssert);
            tests.add(currentTest);
        }

        return super.visitParamInput(ctx);
    }

    @Override
    public Void visitExpectation(ParamGenParser.ExpectationContext ctx) {
        if (ctx.getText().equals(ctx.getStart().getText()))
            errorHandler.throwError(ctx.getStart(), "missing expectation value");

        switch (ctx.getStart().getText()) {
            case "EXPECT":
                currentAssert.setExpect(ctx.literal().getText());
                break;

            case "EXPECT_EXCEPTION":
                if(ctx.ID().getText().equals("<missing ID>"))
                    errorHandler.throwError(ctx.getStart(), "missing expectation type");
                currentAssert.setExpection(ctx.ID().getText());
                if(ctx.STRING() != null)
                    currentAssert.setExpectMessage(ctx.STRING().getText());
                break;

            default:
                errorHandler.throwError(ctx.getStart(),"missing exception declaration");
        }

        currentAssert.setParams(params);
        currentTest.addAssert(currentAssert);
        tests.add(currentTest);

        return super.visitExpectation(ctx);
    }

    public ArrayList<Test> getAllTest() {
        return tests;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public HashMap<String, String> getMockClasses() {
        return mockClasses;
    }
}