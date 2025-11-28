package antlr.parameters;

import antlr.Constructor;
import antlr.RuntimeErrorHandler;

import java.util.ArrayList;
import java.util.HashMap;

public class MyParamVisitor extends ParamGenBaseVisitor<Void> {
    private final ArrayList<Test> tests = new ArrayList<>();
    private final RuntimeErrorHandler errorHandler = new RuntimeErrorHandler();
    private Test currentTest;
    private Assert currentAssert;
    private Param currentParam;
    private Param currentVariation;
    private Constructor constructor = null;
    private ArrayList<Param> params = new ArrayList<>();
    private ArrayList<Param> variations = new ArrayList<>();
    private ArrayList<WhenRule> globalWhens = new ArrayList<>();
    private HashMap<String, String> mockClasses = new HashMap<>();
    private int repeatTime;

    @Override
    public Void visitConstructorSet(ParamGenParser.ConstructorSetContext ctx) {
        constructor = new Constructor();
        params = new ArrayList<>();

        return super.visitConstructorSet(ctx);
    }

    @Override
    public Void visitParamSet(ParamGenParser.ParamSetContext ctx) {
        if (ctx.getText().contains("TESTMETHOD")) errorHandler.throwError("missing test case name");
        if ((ctx.methodName.getText().equals("<missing ID>"))) errorHandler.throwError("missing testing method name");
        if (ctx.getText().contains("<missing 'METHOD'>")) errorHandler.throwError("missing 'METHOD' command");

        if(ctx.getText().contains("REPEAT")) {
            repeatTime = Integer.parseInt((ctx.repeatTimes.getText()));
            if ((ctx.repeatTimes.getText().equals("<missing INT>"))) errorHandler.throwError("missing repeatTime");
        }
        else repeatTime = 1;

        currentTest = new Test(ctx.testName.getText(), ctx.methodName.getText(), repeatTime);
        currentAssert = new Assert();
        params = new ArrayList<>();
        variations = new ArrayList<>();

        return super.visitParamSet(ctx);
    }

    @Override
    public Void visitVariationSpec(ParamGenParser.VariationSpecContext ctx) {
        if (ctx.getText().contains("<missing ID>")) errorHandler.throwError("missing variation type or name");

        currentVariation = new Param(ctx.varType.getText(), ctx.varName.getText());

        return super.visitVariationSpec(ctx);
    }

    @Override
    public Void visitVarFor(ParamGenParser.VarForContext ctx) {
        int start = Integer.parseInt(ctx.INT(0).getText());
        int end = Integer.parseInt(ctx.INT(1).getText());

        if((end - start + 1) != repeatTime)
            errorHandler.throwError("the defined loop is not as long as the repeatTime");

        ArrayList<String> varValue = new ArrayList<>();

        if (start <= end)
            for (int value = start; value <= end; value++) varValue.add(String.valueOf(value));
        else
            for (int value = start; value >= end; value--) varValue.add(String.valueOf(value));

        currentVariation.setValue(varValue);
        variations.add(currentVariation);

        if(!ctx.parent.getParent().getText().contains("EXPECT") && !ctx.parent.getParent().getText().contains("EXPECT_EXCEPTION") && !ctx.parent.getParent().getText().contains("PARAM")) {
            currentAssert.setVariations(variations);
            currentTest.addAssert(currentAssert);
            tests.add(currentTest);
        }

        return super.visitVarFor(ctx);
    }

    @Override
    public Void visitVarInput(ParamGenParser.VarInputContext ctx) {
        if (ctx.getText().equals(ctx.getStart().getText())) errorHandler.throwError("missing variation values");
        if (ctx.literal().size() != repeatTime) errorHandler.throwError("the defined array is not as long as the repeatTime");

        ArrayList<String> varValue = new ArrayList<>();

        for (var lit : ctx.literal())
            varValue.add(lit.getText());

        currentVariation.setValue(varValue);
        variations.add(currentVariation);

        if(!ctx.parent.getParent().getText().contains("EXPECT") && !ctx.parent.getParent().getText().contains("EXPECT_EXCEPTION") && !ctx.parent.getParent().getText().contains("PARAM")) {
            currentAssert.setVariations(variations);
            currentTest.addAssert(currentAssert);
            tests.add(currentTest);
        }

        return super.visitVarInput(ctx);
    }

    @Override
    public Void visitMockSpec(ParamGenParser.MockSpecContext ctx) {
        if(ctx.ID().size() != 2 || ctx.getText().contains("TEST") || ctx.getText().contains("<missing ID>"))
            errorHandler.throwError("there should be 2 classes");

        mockClasses.put(ctx.ID(0).getText(), ctx.ID(1).getText());

        return super.visitMockSpec(ctx);
    }

    @Override
    public Void visitWhenSet(ParamGenParser.WhenSetContext ctx) {
        for (var whenSpec : ctx.whenSpec()) {
            WhenRule tempWhen;
            if(whenSpec.returnVal == null)
                tempWhen = new WhenRule(whenSpec.conditionExpr().getText(), "NaN", whenSpec.throwVal().getText());
            else if (whenSpec.throwVal() == null)
                tempWhen = new WhenRule(whenSpec.conditionExpr().getText(), whenSpec.returnVal.getText(), "NaN");
            else
                tempWhen = new WhenRule(whenSpec.conditionExpr().getText(), whenSpec.returnVal.getText(), whenSpec.throwVal().getText());
            globalWhens.add(tempWhen);
        }
        return super.visitWhenSet(ctx);
    }

    @Override
    public Void visitWhenSpec(ParamGenParser.WhenSpecContext ctx) {
        WhenRule tempWhen;
        if(ctx.returnVal == null)
            tempWhen = new WhenRule(ctx.conditionExpr().getText(), "NaN", ctx.throwVal().getText());
        else if (ctx.throwVal() == null)
            tempWhen = new WhenRule(ctx.conditionExpr().getText(), ctx.returnVal.getText(), "NaN");
        else
            tempWhen = new WhenRule(ctx.conditionExpr().getText(), ctx.returnVal.getText(), ctx.throwVal().getText());

        if (ctx.parent instanceof ParamGenParser.ParamSetContext)
            currentTest.addWhens(tempWhen);

        return super.visitWhenSpec(ctx);
    }

    @Override
    public Void visitParamSpec(ParamGenParser.ParamSpecContext ctx) {
        if (ctx.getText().contains("PARAMVALUE")) errorHandler.throwError("missing parameter type and name");
        if (ctx.getText().contains("<missing ID>")) errorHandler.throwError("missing parameter type or name");

        currentParam = new Param(ctx.paramType.getText(), ctx.paramName.getText());

        return super.visitParamSpec(ctx);
    }

    @Override
    public Void visitParamInput(ParamGenParser.ParamInputContext ctx) {
        ArrayList<String> values = new ArrayList<>();

        if (ctx.getText().equals(ctx.getStart().getText()))
            errorHandler.throwError("missing value");

        switch (ctx.getStart().getText()) {
            case "VALUES":
                for (var literal : ctx.literal())
                    values.add(literal.getText());
                break;

            case "VALUE":
                values.add(ctx.literal(0).getText());
                break;

            default:
                break;
        }

        currentParam.setValue(values);
        params.add(currentParam);

        if(ctx.parent.getParent().getText().contains("CONSTRUCTOR")) constructor.setParams(params);
        else if(!ctx.parent.getParent().getText().contains("EXPECT") && !ctx.parent.getParent().getText().contains("EXPECT_EXCEPTION") && !ctx.parent.getParent().getText().contains("VARIATION")) {
            currentAssert.setParams(params);
            currentTest.addAssert(currentAssert);
            tests.add(currentTest);
        }

        return super.visitParamInput(ctx);
    }

    @Override
    public Void visitExpectation(ParamGenParser.ExpectationContext ctx) {
        if (ctx.getText().equals(ctx.getStart().getText())) errorHandler.throwError("missing expectation value");

        switch (ctx.getStart().getText()) {
            case "EXPECT":
                if(!(ctx.getText().contains("[") || ctx.getText().contains("FOR"))) {
                    ArrayList<String> expect = new ArrayList<>();

                    expect.add(ctx.literal().getText());
                    currentAssert.setExpect(expect);
                }
                break;

            case "EXPECT_EXCEPTION":
                if(ctx.ID().getText().equals("<missing ID>"))
                    errorHandler.throwError("missing expectation type");
                currentAssert.setExpection(ctx.ID().getText());
                if(ctx.STRING() != null)
                    currentAssert.setExpectMessage(ctx.STRING().getText());
                break;

            default:
                errorHandler.throwError("missing exception declaration");
        }

        if(!params.isEmpty()) currentAssert.setParams(params);
        if(!variations.isEmpty()) currentAssert.setVariations(variations);
        currentTest.addAssert(currentAssert);
        tests.add(currentTest);

        return super.visitExpectation(ctx);
    }

    @Override
    public Void visitExpectFor(ParamGenParser.ExpectForContext ctx) {
        int start = Integer.parseInt(ctx.INT(0).getText());
        int end = Integer.parseInt(ctx.INT(1).getText());

        if((end - start + 1) != repeatTime)
            errorHandler.throwError("the defined loop is not as long as the repeatTime");

        ArrayList<String> expect = new ArrayList<>();

        if (start <= end)
            for (int value = start; value <= end; value++) expect.add(String.valueOf(value));
        else
            for (int value = start; value >= end; value--) expect.add(String.valueOf(value));

        currentAssert.setExpect(expect);

        return super.visitExpectFor(ctx);
    }

    @Override
    public Void visitExpectInput(ParamGenParser.ExpectInputContext ctx) {
        ArrayList<String> expect = new ArrayList<>();

        for(int repeat = 0; repeat < ctx.literal().size(); repeat++)
            expect.add(ctx.literal(repeat).getText());

        currentAssert.setExpect(expect);

        return super.visitExpectInput(ctx);
    }

    @Override
    public Void visitExpectArray(ParamGenParser.ExpectArrayContext ctx) {
        currentAssert.setExceptionType(ctx.expectType.getText());

        return super.visitExpectArray(ctx);
    }

    public ArrayList<Test> getAllTest() { return tests; }
    public Constructor getConstructor() { return constructor; }
    public HashMap<String, String> getMockClasses() { return mockClasses; }
    public ArrayList<WhenRule> getGlobalWhens() { return globalWhens; }
}