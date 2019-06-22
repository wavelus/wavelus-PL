package antlr4.generated;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class WavelusParserListenerImpl extends WavelusParserBaseListener{

    public StringBuilder finalCode = new StringBuilder();

    @Override
    public void enterMain(WavelusParser.MainContext ctx) {
        super.enterMain(ctx);
        finalCode.append("public static void main(String[] argv)\n");
    }

    @Override public void exitMain(WavelusParser.MainContext ctx) {
        super.exitMain(ctx);
    }

    @Override
    public void enterProgram(WavelusParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        finalCode.append("public class Main {\n");
    }

    @Override
    public void exitProgram(WavelusParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        finalCode.append("}\n");
    }

    @Override
    public void enterBlock(WavelusParser.BlockContext ctx) {
        super.enterBlock(ctx);
        finalCode.append("{\n");
    }

    @Override
    public void exitBlock(WavelusParser.BlockContext ctx) {
        super.exitBlock(ctx);
        finalCode.append("}\n");
    }

    @Override
    public void enterStatement(WavelusParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(WavelusParser.StatementContext ctx) {
        super.exitStatement(ctx);
        finalCode.append(";\n");
    }

    @Override
    public void enterStructuredStatement(WavelusParser.StructuredStatementContext ctx) {
        super.enterStructuredStatement(ctx);
    }

    @Override
    public void exitStructuredStatement(WavelusParser.StructuredStatementContext ctx) {
        super.exitStructuredStatement(ctx);
    }

    @Override
    public void enterSimpleStatement(WavelusParser.SimpleStatementContext ctx) {
        super.enterSimpleStatement(ctx);
    }

    @Override
    public void exitSimpleStatement(WavelusParser.SimpleStatementContext ctx) {
        super.exitSimpleStatement(ctx);
    }

    @Override
    public void enterAssignment(WavelusParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(WavelusParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
    }

    @Override
    public void enterVariableDeclaration(WavelusParser.VariableDeclarationContext ctx){
        super.enterVariableDeclaration(ctx);
        if(ctx.NUMBER()!=null){
            finalCode.append("int ");
        }
        if(ctx.TEXT()!=null){
            finalCode.append("String ");
        }
        if(ctx.BOOL()!=null){
            finalCode.append("boolean ");
        }
    }

    @Override
    public void exitVariableDeclaration(WavelusParser.VariableDeclarationContext ctx){
        super.exitVariableDeclaration(ctx);
    }

    @Override
    public void enterFunctionCall(WavelusParser.FunctionCallContext ctx) {
        super.enterFunctionCall(ctx);
        if (ctx.PRINT()!=null){
            finalCode.append("System.out.println");
        }
    }

    @Override
    public void exitFunctionCall(WavelusParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);
        if (ctx.PRINT()!=null){
        }
    }

    @Override
    public void enterIfStatement(WavelusParser.IfStatementContext ctx) {
        super.enterIfStatement(ctx);
    }

    @Override
    public void exitIfStatement(WavelusParser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);
    }

    @Override
    public void enterIfStat(WavelusParser.IfStatContext ctx) {
        super.enterIfStat(ctx);
        finalCode.append("if ");
    }

    @Override
    public void exitIfStat(WavelusParser.IfStatContext ctx) {
        super.exitIfStat(ctx);
    }

    @Override
    public void enterElseIfStat(WavelusParser.ElseIfStatContext ctx) {
        super.enterElseIfStat(ctx);
        finalCode.append("else if ");
    }

    @Override
    public void exitElseIfStat(WavelusParser.ElseIfStatContext ctx) {
        super.exitElseIfStat(ctx);
    }

    @Override
    public void enterElseStat(WavelusParser.ElseStatContext ctx) {
        super.enterElseStat(ctx);
        finalCode.append("else");
    }

    @Override
    public void exitElseStat(WavelusParser.ElseStatContext ctx) {
        super.exitElseStat(ctx);
    }

    @Override
    public void enterFunctionDef(WavelusParser.FunctionDefContext ctx) {
        super.enterFunctionDef(ctx);
    }

    @Override
    public void exitFunctionDef(WavelusParser.FunctionDefContext ctx) {
        super.exitFunctionDef(ctx);
    }

    @Override
    public void enterWhileStatement(WavelusParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
        finalCode.append("while (");
    }

    @Override
    public void exitWhileStatement(WavelusParser.WhileStatementContext ctx) {
        super.exitWhileStatement(ctx);
    }

    @Override
    public void enterIdList(WavelusParser.IdListContext ctx) {
        super.enterIdList(ctx);
    }

    @Override
    public void exitIdList(WavelusParser.IdListContext ctx) {
        super.exitIdList(ctx);
    }

    @Override
    public void enterExpressionList(WavelusParser.ExpressionListContext ctx) {
        super.enterExpressionList(ctx);
    }

    @Override
    public void exitExpressionList(WavelusParser.ExpressionListContext ctx) {
        super.exitExpressionList(ctx);
    }

    @Override
    public void enterExpression(WavelusParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(WavelusParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterTextExpression(WavelusParser.TextExpressionContext ctx) {
        super.enterTextExpression(ctx);
        finalCode.append("\"");
        finalCode.append(ctx.getText().replaceAll("\'",""));
        finalCode.append("\"");
    }

    @Override
    public void exitTextExpression(WavelusParser.TextExpressionContext ctx) {
        super.exitTextExpression(ctx);
    }

    @Override
    public void enterNumberExpression(WavelusParser.NumberExpressionContext ctx) {
        super.enterNumberExpression(ctx);
    }

    @Override
    public void exitNumberExpression(WavelusParser.NumberExpressionContext ctx) {
        super.exitNumberExpression(ctx);
    }

    @Override
    public void enterBooleanExpression(WavelusParser.BooleanExpressionContext ctx) {
        super.enterBooleanExpression(ctx);
    }

    @Override
    public void exitBooleanExpression(WavelusParser.BooleanExpressionContext ctx) {
        super.exitBooleanExpression(ctx);
    }

    @Override
    public void enterListElement(WavelusParser.ListElementContext ctx) {
        super.enterListElement(ctx);
    }

    @Override
    public void exitListElement(WavelusParser.ListElementContext ctx) {
        super.exitListElement(ctx);
    }

    @Override
    public void enterIndex(WavelusParser.IndexContext ctx) {
        super.enterIndex(ctx);
    }

    @Override
    public void exitIndex(WavelusParser.IndexContext ctx) {
        super.exitIndex(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
        if (node.getSymbol().getType() == WavelusParser.NAND){
            finalCode.append("!=");
        }
        if (node.getSymbol().getType() == WavelusParser.IDENTIFIER
            || node.getSymbol().getType()==WavelusParser.ASSIGN
            || node.getSymbol().getType()==WavelusParser.NUMBER_VALUE
            || node.getSymbol().getType()==WavelusParser.OPEN_PAREN
            || node.getSymbol().getType()==WavelusParser.CLOSE_PAREN
            || node.getSymbol().getType()==WavelusParser.PLUS
            || node.getSymbol().getType()==WavelusParser.MINUS
            || node.getSymbol().getType()==WavelusParser.EQUAL
            || node.getSymbol().getType()==WavelusParser.MULTIPLY
            || node.getSymbol().getType()==WavelusParser.OPEN_SQUARED_PAREN
            || node.getSymbol().getType()==WavelusParser.CLOSE_SQUARED_PAREN
            || node.getSymbol().getType()==WavelusParser.GREATER){
            finalCode.append(node.getText());
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }
}
