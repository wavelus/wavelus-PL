lexer grammar WavelusLexer;

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
RETURN: 'return';
PRINT: 'print';
PLUS: '+';
MINUS: '-';
EQUAL: '==';
GREATER: '>';
NAND: '!!';
MULTIPLY: '*';
SEMI: ';';
COMMA: ',';
ASSIGN: '=';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_SQUARED_PAREN: '[';
CLOSE_SQUARED_PAREN: ']';
TYPE: BOOL|TEXT|NUMBER;
NUMBER: N U M B E R;
TEXT: T E X T;
BOOL: TRUE | FALSE ;
NULL: N U L L ;
TRUE: T R U E;
FALSE: F A L S E;
NUMBER_VALUE: [-]?[0-9]+;
TEXT_VALUE: '\''[a-zA-Z0-9 \t\n]*'\'';
COMMENT_LINE : '##' ~[\r\n]* -> skip;
WHITESPACE: [ \t\n] -> skip;
IDENTIFIER: LOWERCASE (LOWERCASE | DIGIT | '_')*;