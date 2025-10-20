// Generated from C:/Users/User/Documents/GitHub/UnitTestGenerator/UnitTest/src/main/java/antlr/parameters/ParamGen.g4 by ANTLR 4.13.2
package antlr.parameters;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParamGenParser}.
 */
public interface ParamGenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#templateFile}.
	 * @param ctx the parse tree
	 */
	void enterTemplateFile(ParamGenParser.TemplateFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#templateFile}.
	 * @param ctx the parse tree
	 */
	void exitTemplateFile(ParamGenParser.TemplateFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#constructorSet}.
	 * @param ctx the parse tree
	 */
	void enterConstructorSet(ParamGenParser.ConstructorSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#constructorSet}.
	 * @param ctx the parse tree
	 */
	void exitConstructorSet(ParamGenParser.ConstructorSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#mockSet}.
	 * @param ctx the parse tree
	 */
	void enterMockSet(ParamGenParser.MockSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#mockSet}.
	 * @param ctx the parse tree
	 */
	void exitMockSet(ParamGenParser.MockSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#whenSet}.
	 * @param ctx the parse tree
	 */
	void enterWhenSet(ParamGenParser.WhenSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#whenSet}.
	 * @param ctx the parse tree
	 */
	void exitWhenSet(ParamGenParser.WhenSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#paramSet}.
	 * @param ctx the parse tree
	 */
	void enterParamSet(ParamGenParser.ParamSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#paramSet}.
	 * @param ctx the parse tree
	 */
	void exitParamSet(ParamGenParser.ParamSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#variationSpec}.
	 * @param ctx the parse tree
	 */
	void enterVariationSpec(ParamGenParser.VariationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#variationSpec}.
	 * @param ctx the parse tree
	 */
	void exitVariationSpec(ParamGenParser.VariationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#varFor}.
	 * @param ctx the parse tree
	 */
	void enterVarFor(ParamGenParser.VarForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#varFor}.
	 * @param ctx the parse tree
	 */
	void exitVarFor(ParamGenParser.VarForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#varInput}.
	 * @param ctx the parse tree
	 */
	void enterVarInput(ParamGenParser.VarInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#varInput}.
	 * @param ctx the parse tree
	 */
	void exitVarInput(ParamGenParser.VarInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#whenSpec}.
	 * @param ctx the parse tree
	 */
	void enterWhenSpec(ParamGenParser.WhenSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#whenSpec}.
	 * @param ctx the parse tree
	 */
	void exitWhenSpec(ParamGenParser.WhenSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#throwVal}.
	 * @param ctx the parse tree
	 */
	void enterThrowVal(ParamGenParser.ThrowValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#throwVal}.
	 * @param ctx the parse tree
	 */
	void exitThrowVal(ParamGenParser.ThrowValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#mockSpec}.
	 * @param ctx the parse tree
	 */
	void enterMockSpec(ParamGenParser.MockSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#mockSpec}.
	 * @param ctx the parse tree
	 */
	void exitMockSpec(ParamGenParser.MockSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpr(ParamGenParser.ConditionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpr(ParamGenParser.ConditionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#paramSpec}.
	 * @param ctx the parse tree
	 */
	void enterParamSpec(ParamGenParser.ParamSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#paramSpec}.
	 * @param ctx the parse tree
	 */
	void exitParamSpec(ParamGenParser.ParamSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#paramInput}.
	 * @param ctx the parse tree
	 */
	void enterParamInput(ParamGenParser.ParamInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#paramInput}.
	 * @param ctx the parse tree
	 */
	void exitParamInput(ParamGenParser.ParamInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#expectation}.
	 * @param ctx the parse tree
	 */
	void enterExpectation(ParamGenParser.ExpectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#expectation}.
	 * @param ctx the parse tree
	 */
	void exitExpectation(ParamGenParser.ExpectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#expectArray}.
	 * @param ctx the parse tree
	 */
	void enterExpectArray(ParamGenParser.ExpectArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#expectArray}.
	 * @param ctx the parse tree
	 */
	void exitExpectArray(ParamGenParser.ExpectArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#expectFor}.
	 * @param ctx the parse tree
	 */
	void enterExpectFor(ParamGenParser.ExpectForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#expectFor}.
	 * @param ctx the parse tree
	 */
	void exitExpectFor(ParamGenParser.ExpectForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#expectInput}.
	 * @param ctx the parse tree
	 */
	void enterExpectInput(ParamGenParser.ExpectInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#expectInput}.
	 * @param ctx the parse tree
	 */
	void exitExpectInput(ParamGenParser.ExpectInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParamGenParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParamGenParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamGenParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParamGenParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamGenParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParamGenParser.LiteralContext ctx);
}