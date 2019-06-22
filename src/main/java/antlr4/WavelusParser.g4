parser grammar WavelusParser;
options { tokenVocab=WavelusLexer;}

program: functionDef* main EOF;

main: RUN block;

block: (statement | functionDef) * (RETURN expression ';')?;

statement: simpleStatement| functionCall  | structuredStatement;

structuredStatement: ifStatement| whileStatement;

simpleStatement
    : assignment SEMI
    | variableDeclaration SEMI;

assignment: IDENTIFIER ASSIGN expression;

variableDeclaration
    : NUMBER IDENTIFIER
    | TEXT IDENTIFIER
    | BOOL IDENTIFIER;

functionCall
    : IDENTIFIER OPEN_PAREN expressionList? CLOSE_PAREN SEMI
    | PRINT OPEN_PAREN expression? CLOSE_PAREN SEMI;

ifStatement: ifStat elseIfStat* elseStat? END;

ifStat: IF OPEN_PAREN booleanExpression CLOSE_PAREN DO block;

elseIfStat: ELIF OPEN_PAREN booleanExpression CLOSE_PAREN DO block;

elseStat: ELSE DO block;

functionDef: DEF_FUN IDENTIFIER OPEN_PAREN idList? CLOSE_PAREN block END;

whileStatement: WHILE booleanExpression DO block END;

idList: IDENTIFIER (COMMA IDENTIFIER)*;

expressionList: expression (COMMA expression)*;

expression
    : BOOL
    | booleanExpression
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
    | NUMBER_VALUE PLUS NUMBER_VALUE
    | functionCall
    | listElement
    | OPEN_PAREN numberExpression CLOSE_PAREN
    | IDENTIFIER
    ;

booleanExpression
    : BOOL_VALUE
    | NULL
    | booleanExpression NAND booleanExpression
    | numberExpression EQUAL numberExpression
    | textExpression EQUAL textExpression
    | IDENTIFIER GREATER numberExpression
    ;

listElement:
    IDENTIFIER index;

index:
    OPEN_SQUARED_PAREN NUMBER_VALUE CLOSE_SQUARED_PAREN;
