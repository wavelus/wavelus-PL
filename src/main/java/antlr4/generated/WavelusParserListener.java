// Generated from WavelusParser.g4 by ANTLR 4.7.1
package antlr4.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WavelusParser}.
 */
public interface WavelusParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WavelusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WavelusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WavelusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(WavelusParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(WavelusParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(WavelusParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(WavelusParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WavelusParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WavelusParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(WavelusParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(WavelusParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(WavelusParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(WavelusParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WavelusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WavelusParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(WavelusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(WavelusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(WavelusParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(WavelusParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(WavelusParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(WavelusParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(WavelusParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(WavelusParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(WavelusParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(WavelusParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(WavelusParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(WavelusParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(WavelusParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(WavelusParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(WavelusParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(WavelusParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(WavelusParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(WavelusParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(WavelusParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(WavelusParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WavelusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WavelusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#textExpression}.
	 * @param ctx the parse tree
	 */
	void enterTextExpression(WavelusParser.TextExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#textExpression}.
	 * @param ctx the parse tree
	 */
	void exitTextExpression(WavelusParser.TextExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#numberExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(WavelusParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#numberExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(WavelusParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(WavelusParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(WavelusParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#listElement}.
	 * @param ctx the parse tree
	 */
	void enterListElement(WavelusParser.ListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#listElement}.
	 * @param ctx the parse tree
	 */
	void exitListElement(WavelusParser.ListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavelusParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(WavelusParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavelusParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(WavelusParser.IndexContext ctx);
}