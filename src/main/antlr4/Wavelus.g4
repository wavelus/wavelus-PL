grammar Wavelus;

program: block;

fragment LOWERCASE : [a-z] ;
fragment UPPERCASE : [A-Z] ;

fragment DIGIT     : [0-9] ;

fragment A: ('a' | 'A');
fragment B: ('b' | 'B');
fragment C: ('c' | 'C');
fragment D: ('d' | 'D');
fragment E: ('e' | 'E');
fragment F: ('f' | 'F');
fragment G: ('g' | 'G');
fragment H: ('h' | 'H');
fragment I: ('i' | 'I');
fragment J: ('j' | 'J');
fragment K: ('k' | 'K');
fragment L: ('l' | 'L');
fragment M: ('m' | 'M');
fragment N: ('n' | 'N');
fragment O: ('o' | 'O');
fragment P: ('p' | 'P');
fragment Q: ('q' | 'Q');
fragment R: ('r' | 'R');
fragment S: ('s' | 'S');
fragment T: ('t' | 'T');
fragment U: ('u' | 'U');
fragment V: ('v' | 'V');
fragment W: ('w' | 'W');
fragment X: ('x' | 'X');
fragment Y: ('y' | 'Y');
fragment Z: ('z' | 'Z');

IF: I F;
DO: D O;
ELSE: E L S E;
DEF_FUN: F U N;
WHILE: W H I L E;
RUN: R U N;
END: E N D;
TRUE: T R U E;
FALSE: F A L S E;
RETURN: 'return';
PRINT: 'print';
PLUS: '+';
MINUS: '-';
EQUAL: '==';
GREATER: '>';
NAND: '!!';
MULTIPLY: '*';
SEMI: ';';
ASSIGN: '=';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_SQUARED_PAREN: '[';
CLOSE_SQUARED_PAREN: ']';
TYPE: BOOL|TEXT|NUMBER;
NUMBER: N U M B E R;
TEXT: T E X T;
BOOL: TRUE | FALSE;
NULL: N U L L;
NUMBER_VALUE: [-]?[0-9]+;
//TEXT_VALUE: [a-zA-Z0-9 \t\n]*;
//T_COMMENT: '#'[a-zA-Z_ąćęłńóśźż0-9 \t\n;]*'#' -> skip;
//COMMENT_LINE : '##' ~[\r\n]* -> skip;
WHITESPACE: [ \t\n] -> skip;
IDENTIFIER: LOWERCASE (LOWERCASE | DIGIT | '_')*;


block: (statement | functionDef) * (RETURN expression ';')?;

statement: simpleStatement| functionCall SEMI | structuredStatement;

structuredStatement: ifStatement| whileStatement;

simpleStatement: assignment SEMI;

assignment: IDENTIFIER ASSIGN expression;

functionCall
    : IDENTIFIER OPEN_PAREN expressionList? CLOSE_PAREN
    | PRINT OPEN_PAREN expression? CLOSE_PAREN;

ifStatement: ifStat elseIfStat* elseStat? END;

ifStat: IF expression DO block;

elseIfStat: ELSE IF expression DO block;

elseStat: ELSE DO block;

functionDef: DEF_FUN IDENTIFIER OPEN_PAREN idList? CLOSE_PAREN block END;

whileStatement: WHILE expression DO block END;

idList: IDENTIFIER (',' IDENTIFIER)*;

expressionList: expression (',' expression)*;

expression
    : numberExpression
    | booleanExpression
    | textExpression
    | IDENTIFIER
    ;

textExpression
    : TEXT_VALUE;

numberExpression
    : MINUS numberExpression
    | NUMBER_VALUE
    | functionCall
    | listElement
    | OPEN_PAREN numberExpression CLOSE_PAREN
    ;

booleanExpression
    : BOOL
    | NULL
    | booleanExpression NAND booleanExpression
    | booleanExpression EQUAL booleanExpression
    | booleanExpression GREATER booleanExpression
    ;

listElement:
    IDENTIFIER index;

index:
    OPEN_SQUARED_PAREN NUMBER_VALUE CLOSE_SQUARED_PAREN;
