grammar ParamGen;

templateFile: constructorSet? mockSet? whenSet? paramSet*;

constructorSet:
    'CONSTRUCTOR'
    paramSpec+;

mockSet:
    'MOCKING'
    mockSpec+;

whenSet:
    'WHEN_RULES'
    whenSpec+;

paramSet:
    'TEST' testName=ID
    ('REPEAT' repeatTimes=INT)?
    'METHOD' methodName=ID
    paramSpec*
    variationSpec*
    whenSpec*
    expectation?;

variationSpec: 'VARIATION' varType=type varName=ID 'VALUES' (varInput | varFor);

varFor: 'FOR' INT 'TO' INT;

varInput: '[' literal (',' literal)* ']';

whenSpec:
    'WHEN' conditionExpr (('RETURNS' returnVal=literal ('THROW' throwVal)?) | ('THROW' throwVal));

throwVal:
    ID ('.' ID)?;

mockSpec:
    'MOCK' ID ID;

conditionExpr: ID (LPAREN ID? (',' ID)* RPAREN)?;

paramSpec:
    'PARAM' paramType=type paramName=ID paramInput;

paramInput: 'VALUE' literal
    | 'VALUES' '[' literal (',' literal)* ']';

expectation:
    'EXPECT' (expectInput | literal | expectFor | expectArray)
    | 'EXPECT_EXCEPTION' ID ('(' exceptionMessage=STRING ')')?;

expectArray: expectType = type expectInput;

expectFor: 'FOR' INT 'TO' INT;

expectInput: '[' literal (',' literal)* ']';

type: 'int'
    | 'float'
    | 'double'
    | 'char'
    | 'boolean'
    | 'string'
    | 'enum'
    | 'List<' type '>'
    | 'Optional<' type '>'
    | 'Map<' type '>'
    | 'Set<' type '>'
    | ID
    | type LANGLE RANGLE;

literal: INT
    | FLOAT
    | BOOLEAN
    | STRING
    | CHAR
    | NOTNULL
    | NULL;

LANGLE: '[';
RANGLE: ']';
LPAREN: '(';
RPAREN: ')';
BOOLEAN: 'true' | 'false';
NOTNULL: 'notnull';
NULL: 'null';
NOT: 'not';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: ('-')?[0-9]+;
FLOAT: ('-')?[0-9]+ '.' [0-9]+;
STRING: '"' (~["\r\n])* '"';
CHAR: '\'' . '\'';

WS: [ \t\r\n]+ -> skip;
