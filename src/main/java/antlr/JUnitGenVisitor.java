// Generated from C:/Users/User/Documents/GitHub/UnitTestGenerator/UnitTest/src/main/java/antlr/JUnitGen.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JUnitGenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JUnitGenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#testFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestFile(JUnitGenParser.TestFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JUnitGenParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JUnitGenParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JUnitGenParser.ClassDeclarationContext ctx) ;
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#classBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyElement(JUnitGenParser.ClassBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(JUnitGenParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JUnitGenParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JUnitGenParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JUnitGenParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#returnDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDeclaration(JUnitGenParser.ReturnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#paramDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDeclaration(JUnitGenParser.ParamDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JUnitGenParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#exceptionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionStmt(JUnitGenParser.ExceptionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#controlFlow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlFlow(JUnitGenParser.ControlFlowContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(JUnitGenParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(JUnitGenParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(JUnitGenParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#forEachLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachLoop(JUnitGenParser.ForEachLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(JUnitGenParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(JUnitGenParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JUnitGenParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException(JUnitGenParser.ExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#exprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(JUnitGenParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JUnitGenParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(JUnitGenParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(JUnitGenParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(JUnitGenParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(JUnitGenParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JUnitGenParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JUnitGenParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JUnitGenParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JUnitGenParser.OperatorContext ctx);
}