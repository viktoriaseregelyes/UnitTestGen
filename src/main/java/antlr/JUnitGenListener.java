// Generated from C:/Users/User/Documents/GitHub/UnitTest/src/main/java/antlr/JUnitGen.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JUnitGenParser}.
 */
public interface JUnitGenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#testFile}.
	 * @param ctx the parse tree
	 */
	void enterTestFile(JUnitGenParser.TestFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#testFile}.
	 * @param ctx the parse tree
	 */
	void exitTestFile(JUnitGenParser.TestFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JUnitGenParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JUnitGenParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JUnitGenParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JUnitGenParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JUnitGenParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JUnitGenParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#classBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyElement(JUnitGenParser.ClassBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#classBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyElement(JUnitGenParser.ClassBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JUnitGenParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JUnitGenParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JUnitGenParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JUnitGenParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JUnitGenParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JUnitGenParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReturnDeclaration(JUnitGenParser.ReturnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReturnDeclaration(JUnitGenParser.ReturnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclaration(JUnitGenParser.ParamDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclaration(JUnitGenParser.ParamDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(JUnitGenParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(JUnitGenParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#exceptionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExceptionStmt(JUnitGenParser.ExceptionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#exceptionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExceptionStmt(JUnitGenParser.ExceptionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void enterControlFlow(JUnitGenParser.ControlFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#controlFlow}.
	 * @param ctx the parse tree
	 */
	void exitControlFlow(JUnitGenParser.ControlFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(JUnitGenParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(JUnitGenParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(JUnitGenParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(JUnitGenParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(JUnitGenParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(JUnitGenParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(JUnitGenParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(JUnitGenParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JUnitGenParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JUnitGenParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#exception}.
	 * @param ctx the parse tree
	 */
	void enterException(JUnitGenParser.ExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#exception}.
	 * @param ctx the parse tree
	 */
	void exitException(JUnitGenParser.ExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JUnitGenParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JUnitGenParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(JUnitGenParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(JUnitGenParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(JUnitGenParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(JUnitGenParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBasicType(JUnitGenParser.BasicTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBasicType(JUnitGenParser.BasicTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JUnitGenParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JUnitGenParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JUnitGenParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JUnitGenParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JUnitGenParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JUnitGenParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JUnitGenParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JUnitGenParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JUnitGenParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JUnitGenParser.OperatorContext ctx);
}