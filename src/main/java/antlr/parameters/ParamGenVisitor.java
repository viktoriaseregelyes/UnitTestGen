// Generated from C:/Users/User/Documents/GitHub/UnitTest/src/main/java/antlr/parameters/ParamGen.g4 by ANTLR 4.13.2
package antlr.parameters;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParamGenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParamGenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#templateFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateFile(ParamGenParser.TemplateFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#constructorSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorSet(ParamGenParser.ConstructorSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#mockSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMockSet(ParamGenParser.MockSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#paramSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSet(ParamGenParser.ParamSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#mockSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMockSpec(ParamGenParser.MockSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#paramSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSpec(ParamGenParser.ParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#paramInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamInput(ParamGenParser.ParamInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#expectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpectation(ParamGenParser.ExpectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ParamGenParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamGenParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParamGenParser.LiteralContext ctx);
}