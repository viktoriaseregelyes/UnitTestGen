package antlr.parameters;

import antlr.Constructor;

import java.util.ArrayList;
import java.util.HashMap;

public class MyParamVisitor extends ParamGenBaseVisitor<Void> {
    private final ArrayList<Test> tests = new ArrayList<>();
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
        currentTest = new Test(ctx.testName.getText(), ctx.methodName.getText());
        currentAssert = new Assert();
        params = new ArrayList<>();

        return super.visitParamSet(ctx);
    }

    @Override
    public Void visitMockSpec(ParamGenParser.MockSpecContext ctx) {
        mockClasses.put(ctx.ID(0).getText(), ctx.ID(1).getText());

        return super.visitMockSpec(ctx);
    }

    @Override
    public Void visitParamSpec(ParamGenParser.ParamSpecContext ctx) {
        currentParam = new Param(ctx.paramType.getText(), ctx.paramName.getText());

        return super.visitParamSpec(ctx);
    }

    @Override
    public Void visitParamInput(ParamGenParser.ParamInputContext ctx) {
        values = new ArrayList<>();

        String keyword = ctx.getStart().getText();

        switch (keyword) {
            case "VALUES":
                for (var literal : ctx.literal()) {
                    values.add(literal.getText());
                }
                break;

            case "VALUE":
                values.add(ctx.literal(0).getText());
                break;

            default:
                System.err.println("Unknown param input type: " + keyword);
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
        String keyword = ctx.getStart().getText();

        switch (keyword) {
            case "EXPECT":
                currentAssert.setExpect(ctx.literal().getText());
                break;

            case "EXPECT_EXCEPTION":
                currentAssert.setExpection(ctx.ID().getText());
                if(ctx.STRING() != null)
                    currentAssert.setExpectMessage(ctx.STRING().getText());
                break;

            default:
                System.err.println("Unknown expectation type: " + keyword);
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