package antlr;

import antlr.parameters.*;
import java.util.*;

public class MyJUnitTestVisitor extends JUnitGenBaseVisitor<Void> {
    private final TestFileWriter writer;
    private final TestInputManager inputManager;
    private final TestDataCollectorVisitor dataCollectorVisitor;

    /**
     * constructor for an input paramgen file
     * @param testCasesFileName
     */
    public MyJUnitTestVisitor(String testCasesFileName) {
        this.dataCollectorVisitor = new TestDataCollectorVisitor();
        this.inputManager = new TestInputManager(testCasesFileName, dataCollectorVisitor);
        this.writer = new TestFileWriter("C:\\Users\\User\\Documents\\GitHub\\UnitTestGenerator\\UnitTest\\TestClass.java");
        writer.clear();
    }

    /**
     * import needed libs
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitImportDeclaration(JUnitGenParser.ImportDeclarationContext ctx) {
        writer.writeLine("import " + ctx.importName.getText() + ";\n");
        return super.visitImportDeclaration(ctx);
    }

    /**
     * do basic setups
     * do mock lib import if needed
     * class template setup
     * beforeeach setup
     * @param ctx the parse tree
     * @return
     */
    @Override
    public Void visitClassDeclaration(JUnitGenParser.ClassDeclarationContext ctx) {
        basicImports();
        inputManager.loadParamAndInput();

        if(!dataCollectorVisitor.getMockTypes().isEmpty() || !dataCollectorVisitor.getMockFunctionParam().isEmpty() || !inputManager.getGlobalWhens().isEmpty() || inputManager.localWhenAppears())
            mockImports();

        classSetup();
        testSetupBeforeEach();

        return super.visitClassDeclaration(ctx);
    }

    @Override
    public Void visitMethodDeclaration(JUnitGenParser.MethodDeclarationContext ctx) {
        for (Test currentTest : inputManager.getInputTests())
            if (ctx.methodName.getText().equals(currentTest.getMethodName()))
                writeTestMethod(currentTest, ctx);

        if(dataCollectorVisitor.getLastMethod() != null && dataCollectorVisitor.getLastMethod().methodName.getText().equals(ctx.methodName.getText()))
            writer.writeLine("}");

        return super.visitMethodDeclaration(ctx);
    }

    private void writeTestMethod(Test currentTest, JUnitGenParser.MethodDeclarationContext ctx) {
        for(int repeat = 0; repeat < currentTest.getRepeatTime(); repeat++) {
            writer.writeLine("\t@Test\n" + "\tvoid " + currentTest.getTestName() + repeat + "() {\n");

            if (!currentTest.getWhens().isEmpty()) {
                for (WhenRule whens : currentTest.getWhens()) {
                    writer.writeLine("\t\twhen(" + whens.getCondition() + ")");
                    if (!whens.getReturnValue().equals("NaN"))
                        writer.writeLine(".thenReturn(" + whens.getReturnValue() + ")");
                    if (!whens.getThrowValue().equals("NaN"))
                        writer.writeLine(".thenThrow(" + whens.getThrowValue() + ")");

                    writer.writeLine(";\n");
                }
            }

            for (Assert currentAssert : currentTest.getAssertions())
                if(currentAssert.getParams() != null)
                    for (Param currentParam : currentAssert.getParams())
                        if ((currentAssert.getExpection() != null || currentAssert.getExpect() != null) && currentParam.getValue().size() > 1)
                            writer.writeLine("\t\t" + currentParam.getType() + " " + currentParam.getParamName() + " = " + currentParam.getValue() + ";\n");

            for (Assert currentAssert : currentTest.getAssertions()) {
                if (currentAssert.getExpect().size() == 1) writeBasicAssertion(currentTest, currentAssert, 0);
                if (currentAssert.getExpect().size() > 1) writeBasicAssertion(currentTest, currentAssert, repeat);
                else if (currentAssert.getExpection() != null) writeExceptionAssertion(currentTest, currentAssert);

                for (int i = 0; i < ctx.paramDeclaration().size(); i++) {
                    boolean found = false;

                    if(currentAssert.getParams() != null) {
                        for (Param currentParam : currentAssert.getParams()) {
                            if ((currentAssert.getExpection() != null || currentAssert.getExpect() != null) && ctx.paramDeclaration(i).paramName.getText().equals(currentParam.getParamName())) {
                                found = true;

                                if (currentParam.getValue().size() > 1)
                                    writer.writeLine(currentParam.getParamName());
                                else
                                    writer.writeLine(currentParam.getValue().getFirst());
                            }
                        }
                    }

                    if(currentAssert.getVariations() != null) {
                        for (Param currentVariation : currentAssert.getVariations()) {
                            if ((currentAssert.getExpection() != null || currentAssert.getExpect() != null) && ctx.paramDeclaration(i).paramName.getText().equals(currentVariation.getParamName())) {
                                found = true;

                                writer.writeLine(currentVariation.getValue().get(repeat));
                            }
                        }

                        if (!found)
                            writer.writeLine(ctx.paramDeclaration(i).paramName.getText());
                    }

                    if (i != ctx.paramDeclaration().size() - 1)
                        writer.writeLine(", ");
                }

                dataCollectorVisitor.visitExpressionsIn(ctx);

                boolean verify = handleMockVerification();

                if (currentAssert.getExpection() != null && currentAssert.getExpectMessage() != null)
                    writer.writeLine("));\n\t\tassertEquals(" + currentAssert.getExpectMessage() + ", exception.getMessage());\n\t}\n\n");
                else if (verify) writer.writeLine(");\n\t}\n\n");
                else writer.writeLine("));\n\t}\n\n");

                dataCollectorVisitor.clearMethodState();
            }
        }
    }

    private boolean handleMockVerification() {
        boolean verify = false;
        for(Param mock : dataCollectorVisitor.getMockTypes()) {
            for (String expr : dataCollectorVisitor.getExpressions()) {
                if (expr.startsWith(mock.getParamName() + ".")) {
                    if(verify) writer.writeLine(");\n");

                    writer.writeLine("\t\tverify(" + mock.getParamName() + ", times(1))." + expr.replace(mock.getParamName() + ".", ""));
                    verifyMethodParams(dataCollectorVisitor.getMockMethodParams().get(expr));
                    verify = true;
                }
            }
        }

        return verify;
    }

    private void verifyMethodParams(ArrayList<String> mockMethodParams) {
        if (mockMethodParams == null || mockMethodParams.isEmpty()) return;
        writer.writeLine("(");
        for (String param : mockMethodParams) {
            Optional<Param> found = dataCollectorVisitor.getMethodParams().stream().filter(p -> p.getParamName().equals(param)).findFirst();
            writer.writeLine(found.map(p -> "any(" + p.getType() + ".class)").orElse(param));
            if (!param.equals(mockMethodParams.getLast())) writer.writeLine(", ");
        }
    }

    private void basicImports() {
        writer.writeLine("import static org.junit.jupiter.api.Assertions.*;\n");
        writer.writeLine("import org.junit.jupiter.api.Test;\n");
        writer.writeLine("import org.junit.jupiter.api.BeforeEach;\n\n");
    }

    private void mockImports() {
        writer.writeLine("import static org.mockito.Mockito.*;\n\n");
    }

    private void writeBasicAssertion(Test currentTest, Assert currentAssert, int repeat) {
        switch(currentAssert.getExpect().get(repeat)) {
            case "true" -> writer.writeLine("\t\tassertTrue(");
            case "false" -> writer.writeLine("\t\tassertFalse(");
            case "null" -> writer.writeLine("\t\tassertNull(");
            case "notnull" -> writer.writeLine("\t\tassertNotNull(");
            default -> writer.writeLine("\t\tassertEquals(" + currentAssert.getExpect().get(repeat) + ", ");
        }
        writer.writeLine(writer.lowercaseFirstLetter(dataCollectorVisitor.getClassName()) + "." + currentTest.getMethodName() + "(");
    }

    private void writeExceptionAssertion(Test test, Assert assertion) {
        writer.writeLine("\t\tException exception = assertThrows(" + assertion.getExpection() + ".class, () -> "
                + writer.lowercaseFirstLetter(dataCollectorVisitor.getClassName()) + "." + test.getMethodName() + "(");
    }

    /**
     * create class template
     * create local parameters
     */
    private void classSetup() {
        writer.writeLine("class " + dataCollectorVisitor.getClassName() + "Test {\n");
        if(!dataCollectorVisitor.getMockTypes().isEmpty()) {
            for(Param mockType : dataCollectorVisitor.getMockTypes()) {
                if(inputManager.getInputMockClasses().containsKey(mockType.getType())) {
                    writer.writeLine("\t// Using custom mock for " + mockType.getType() + " class\n\tprivate "
                            + inputManager.getInputMockClasses().get(mockType.getType()) + " " + mockType.getParamName() + ";\n");
                }
                else writer.writeLine("\tprivate " + mockType.getType() + " " + mockType.getParamName() + ";\n");
            }
        }
        if(!dataCollectorVisitor.getMockFunctionParam().isEmpty()) {
            for(Param mockFunctionParam : dataCollectorVisitor.getMockFunctionParam()) {
                writer.writeLine("\tprivate " + mockFunctionParam.getType() + " " + mockFunctionParam.getParamName() + ";\n");
            }
        }
        writer.writeLine("\tprivate " + dataCollectorVisitor.getClassName() + " " + writer.lowercaseFirstLetter(dataCollectorVisitor.getClassName()) + ";\n\n");
    }

    /**
     * declare beforeach function
     */
    private void testSetupBeforeEach() {
        writer.writeLine("\t@BeforeEach\n");
        writer.writeLine("\tvoid setUp() {\n");

        for(Param mockType : dataCollectorVisitor.getMockTypes()) {
            if(inputManager.getInputMockClasses().containsKey(mockType.getType()))
                writer.writeLine("\t\tthis." + mockType.getParamName() + " = new " + inputManager.getInputMockClasses().get(mockType.getType()) + "();\n");
            else writer.writeLine("\t\tthis." + mockType.getParamName() + " = mock(" + mockType.getType() + ".class);\n");
        }

        for(Param mockFunctionParam : dataCollectorVisitor.getMockFunctionParam()) {
            if(inputManager.getInputMockClasses().containsKey(mockFunctionParam.getType()))
                writer.writeLine("\t\tthis." + mockFunctionParam.getParamName() + " = new " + inputManager.getInputMockClasses().get(mockFunctionParam.getType()) + "();\n");
            else writer.writeLine("\t\tthis." + mockFunctionParam.getParamName() + " = mock(" + mockFunctionParam.getType() + ".class);\n");
        }

        writer.writeLine("\t\tthis." + writer.lowercaseFirstLetter(dataCollectorVisitor.getClassName()) + " = new " + dataCollectorVisitor.getClassName() + "(");
        if(!dataCollectorVisitor.getMockConstructors().isEmpty() && inputManager.getInputConstructor() != null) {
            for(Constructor currentConstructor : dataCollectorVisitor.getMockConstructors()) {
                for(Param param : currentConstructor.getParams()) {
                    for (Param paramConst : inputManager.getInputConstructor().getParams()) {
                        if (paramConst.getParamName().equals(param.getParamName()))
                            param.setValue(paramConst.getValue());
                    }
                }
            }
            useConstructor();
        }

        writer.writeLine(");\n");

        if(!inputManager.getGlobalWhens().isEmpty())
            for (WhenRule whens : inputManager.getGlobalWhens()) {
                writer.writeLine("\t\twhen(" + whens.getCondition() + ")");
                if (!whens.getReturnValue().equals("NaN"))
                    writer.writeLine(".thenReturn(" + whens.getReturnValue() + ")");
                if (!whens.getThrowValue().equals("NaN"))
                    writer.writeLine(".thenThrow(" + whens.getThrowValue() + ")");

                writer.writeLine(";\n");
            }

        writer.writeLine("\t}\n\n");
    }

    /**
     * declare the best construstor
     */
    private void useConstructor() {
        Constructor bestConstructor = null;
        int maxSetValues = -1;

        for (Constructor currentConstructor : dataCollectorVisitor.getMockConstructors()) {
            int setValues = 0;
            boolean allNonMockParamsSet = true;

            for (Param param : currentConstructor.getParams()) {
                boolean isMockType = false;
                for (Param mock : dataCollectorVisitor.getMockTypes()) {
                    if(mock.getType().equals(param.getType()))
                        isMockType = true;
                }
                if (!isMockType && param.getValue() == null) allNonMockParamsSet = false;
                if (!isMockType && param.getValue() != null) setValues++;
            }

            if (allNonMockParamsSet && setValues > maxSetValues) {
                maxSetValues = setValues;
                bestConstructor = currentConstructor;
            }
        }

        if (bestConstructor != null && !bestConstructor.getParams().isEmpty()) {
            for (int i = 0; i < bestConstructor.getParams().size(); i++) {
                Param param = bestConstructor.getParams().get(i);
                boolean isMockType = dataCollectorVisitor.getMockTypes().contains(param.getType());

                if (!isMockType) {
                    if (param.getValue() != null) writer.writeLine(param.getValue().getFirst());
                    else writer.writeLine(param.getParamName());
                }
                else writer.writeLine(param.getParamName());
                if (i < bestConstructor.getParams().size() - 1) writer.writeLine(", ");
            }
        }
    }
}
