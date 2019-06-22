parser grammar WavelusParser;
options { tokenVocab=WavelusLexer;}

block: (statement | functionDef) * (RETURN expression ';')?;

statement: simpleStatement| functionCall SEMI | structuredStatement;

structuredStatement: ifStatement| whileStatement;

simpleStatement: assignment SEMI;

assignment: IDENTIFIER ASSIGN expression;

functionCall
    : IDENTIFIER OPEN_PAREN expressionList? CLOSE_PAREN
    | PRINT OPEN_PAREN expression? CLOSE_PAREN;

ifStatement: ifStat elseIfStat* elseStat? END;

ifStat: IF OPEN_PAREN booleanExpression CLOSE_PAREN DO block;

elseIfStat: ELSE IF expression DO block;

elseStat: ELSE DO block;

functionDef: DEF_FUN IDENTIFIER OPEN_PAREN idList? CLOSE_PAREN block END;

whileStatement: WHILE expression DO block END;

idList: IDENTIFIER (COMMA IDENTIFIER)*;

expressionList: expression (COMMA expression)*;

expression
    : booleanExpression
    | numberExpression
    | textExpression
    | IDENTIFIER
    ;

textExpression
    : TEXT_VALUE
    ;

numberExpression
    : MINUS numberExpression
    | NUMBER_VALUE
    | functionCall
    | listElement
    | OPEN_PAREN numberExpression CLOSE_PAREN
    | IDENTIFIER
    ;

booleanExpression
    : BOOL
    | NULL
    | booleanExpression NAND booleanExpression
    | numberExpression EQUAL numberExpression
    | textExpression EQUAL textExpression
    | numberExpression GREATER numberExpression
    ;

listElement:
    IDENTIFIER index;

index:
    OPEN_SQUARED_PAREN NUMBER_VALUE CLOSE_SQUARED_PAREN;
