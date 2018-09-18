// Generated from /home/ggfl/Downloads/testeANTLR/src/gui.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link guiParser}.
 */
public interface guiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link guiParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(guiParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(guiParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(guiParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(guiParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(guiParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(guiParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(guiParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(guiParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(guiParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(guiParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(guiParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(guiParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(guiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(guiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(guiParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(guiParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(guiParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(guiParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link guiParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(guiParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link guiParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(guiParser.IntegerLiteralContext ctx);
}