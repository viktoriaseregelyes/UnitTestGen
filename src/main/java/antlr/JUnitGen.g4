grammar JUnitGen;

testFile: packageDeclaration? importDeclaration* classDeclaration;

packageDeclaration: 'PACKAGE' packageName=ID;

importDeclaration: 'IMPORT' importName=ID;

classDeclaration: 'CLASS' className=ID classBodyElement*;

classBodyElement:
      field
    | methodDeclaration
    | constructorDeclaration;

field: 'FIELD' fieldType=type fieldName=ID (WILLBE expr)?;

constructorDeclaration:
    'CONSTRUCTOR' constructorName=ID
    paramDeclaration*
    ;

methodDeclaration:
    'METHOD' methodName=ID
    returnDeclaration
    paramDeclaration*
    statement*
    ;

statement:
      controlFlow
    | returnStmt
    | exceptionStmt
    | exprStatement
    ;

returnDeclaration: 'RETURN_TYPE' returnType=type;

paramDeclaration: 'PARAM' paramType=type paramName=ID;

returnStmt: 'RETURN' returnValue=expr;
exceptionStmt: 'EXCEPTION' exception;

controlFlow: ifStmt | forLoop | elseStmt | forEachLoop | tryBlock;
ifStmt: 'IF_CONDITION' expr;
elseStmt: 'ELSE_BLOCK_FOUND';
forLoop: 'FOR_LOOP' expr+;
forEachLoop: 'FOR_EACH_LOOP' iterateType=param variable=expr iterate=expr;
tryBlock: 'TRY_BLOCK_FOUND' expr* catchBlock? finallyBlock?;
catchBlock: 'CATCH_BLOCK' ID expr*;
finallyBlock: 'FINALLY_BLOCK_FOUND' expr*;

exception: 'throw new' ID LPAREN (param (',' param)*)? RPAREN SEMICOLON;

exprStatement: 'EXPRESSION' expr SEMICOLON;

expr
    : basicType
    | ID
    | '(' expr ')'
    | expr (comparison | operator) (expr | basicType)
    | NOT expr
    | varDecl
    | type expr?
    | expr methodDecl
    | '.' expr
    | LCURLY (ID (',' ID)*)? RCURLY
    ;

varDecl: type ID WILLBE expr;

methodDecl: LPAREN (param (',' param)*)? RPAREN (LANGLE (param (',' param)*)? RANGLE)? expr?;

basicType: INT
    | FLOAT
    | BOOLEAN
    | STRING;

param: type | basicType;

type: 'int'
     | 'float'
     | 'double'
     | 'char'
     | 'boolean'
     | 'String'
     | 'enum'
     | 'List<' type '>'
     | 'Optional<' type '>'
     | 'Map<' type '>'
     | 'Set<' type '>'
     | ID ((LT ((type (',' type)*) | '?')? GT) | LANGLE RANGLE)?
     | type LANGLE expr* RANGLE;

comparison: LT | GT | LTE | GTE | EQ | NEQ | AND | OR;
operator: ADD | SUB | MUL | DIV | WILLBE;

LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
EQ: '==';
NEQ: '!=';
AND: '&&';
OR: '||';
NOT: '!';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
WILLBE: '=';

LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';
LANGLE: '[';
RANGLE: ']';
SEMICOLON: ';';

ID: [a-zA-Z_.][a-zA-Z0-9_.]*;
INT: [0-9]+;
FLOAT: INT '.' [0-9]+;
BOOLEAN: 'true' | 'false';
STRING: '"' (~["\r\n])* '"' | '\'' (~["\r\n])* '\'';

WS: [ \t\r\n]+ -> skip;