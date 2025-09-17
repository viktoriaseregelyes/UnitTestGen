grammar ParamGen;

templateFile: constructorSet? mockSet? paramSet*;

constructorSet:
    'CONSTRUCTOR'
    paramSpec+;

mockSet:
    'MOCKING'
    mockSpec+;

paramSet:
    'TEST' testName=ID
    'METHOD' methodName=ID
    paramSpec+
    expectation?;

mockSpec:
    'MOCK' ID ID;

paramSpec:
    'PARAM' paramType=type paramName=ID paramInput;

paramInput: 'VALUE' literal
    | 'VALUES' '[' literal (',' literal)* ']';

expectation:
    'EXPECT' NOT? literal
    | 'EXPECT_EXCEPTION' ID ('(' exceptionMessage=STRING ')')?;

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
