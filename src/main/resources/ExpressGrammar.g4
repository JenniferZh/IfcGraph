grammar ExpressGrammar;


/*
 * Parser Rules
 */

// schema
schema
    : beginSchema (entity | type | function | therule )*  END_SCHEMA
    ;

beginSchema
    : SCHEMA NAME ';'
    ;



// entity
entity
	: beginEntity (entityType | entityArgument | inversePart | derivePart | wherePart | uniquePart )+ END_ENTITY
	;

beginEntity
    : ENTITY NAME
    ;


entityType
    : (subtypeOf|supertypeOf)* ';'
	;

subtypeOf
	: SUBTYPE_OF '(' NAME ')' # subtype
	;

supertypeOf
	: ABSTRACT? SUPERTYPE_OF '(' NAME ')'
	| ABSTRACT? SUPERTYPE_OF '(' ONEOF nameList ')'
	;

entityArgument
    : NAME ':' OPTIONAL? ( typeName | collectionOf typeName | collectionOf collectionArgPart) # attr
	;



collectionOf
	: typeArrayKeyword ('[' INT ':' (INT | '?' | NAME) ']') OF UNIQUE?
	;

collectionArgPart
	:(collectionOf typeName | collectionOf collectionArgPart)
	;

beginNameList
	: '('
	;

endNameList
	: ')'
	;

nameList
	: beginNameList endNameList | beginNameList names endNameList
	;

names
    : names ',' NAME
    | NAME
	;


// type
typeName
	: NAME ('(' INT ')')?
	| typeSingleKeyword ('(' INT ')')?
	;

type
	:
	TYPE NAME '='
	(
		typeName
		|
		collectionOf typeName
		|
		collectionOf collectionArgPart
		|
		ENUMERATION OF nameList
		|
		SELECT nameList
	)
	FIXED?
	';'
	wherePart*
    END_TYPE;



// INVERSE

inversePart
	: INVERSE inverseSentence+
	;

inverseSentence
	: (NAME ':' (collectionOf)? NAME FOR NAME ';')
	;

// DERIVE


derivePart
	: DERIVE (deriveSentence | ov=deriveOverrideSentence )+
	;

deriveOverrideSentence
	: ('SELF\\')* NAME '.' NAME ':' typeName ':=' commonSentence
    ;

deriveSentence
	: NAME ':' ( typeName | collectionArgPart ) ':=' commonSentence
	;


//UNIQUE

uniquePart
	: UNIQUE uniqueSentence+
	;

uniqueSentence
	: NAME ':' NAME (',' NAME)* ';'
	;

//WNERE

wherePart
	: WHERE whereSentence+
	;

whereSentence
	: NAME ':' commonSentence
	;


// other


function
    : FUNCTION NAME (commonKeyword|commonSentence)+ END_FUNCTION
    ;

therule
    : RULE NAME (commonKeyword|commonSentence)+ END_RULE
    ;

commonKeyword
    : (WHERE|DERIVE|UNIQUE|INVERSE)
	;

commonSentence
    : (NAME | INT | sign | innerKeyword)+ ';'
	;

typeSingleKeyword :
	BOOLEAN|
	REAL|
	INTEGER|
	BINARY|
	NUMBER|
	STRING
	;

typeArrayKeyword :
	SET|
	ARRAY|
	LIST
	;

typeKeyword :
	typeSingleKeyword|
	typeArrayKeyword|
	ENUMERATION OF|
	SELECT
	;

innerKeyword :
	ONEOF|
	ABSTRACT|
	OPTIONAL|
	OF|
	FIXED|
	SELF_|
	FOR |
	typeKeyword
	;

sign :
	'[' | ']' | '<' | '>' | ',' | '.' | '\\' | '/' |  '|'  | '=' | '*' | '\'' | '"' | '?' | '!' |  '-' |  '+' |  '{' |  '}' | ':' | '('  | ')' | ':='
	;

/*
 * Lexer Rules
 */

WS :	[ \t\r\n]+ -> skip	;

BLOCK_COMMENT
	: '(*' .*? '*)' -> skip
	;

INT :   '0' | [1-9] [0-9]* ;

SCHEMA : 'SCHEMA';
END_SCHEMA : 'END_SCHEMA;';

TYPE : 'TYPE';
END_TYPE : 'END_TYPE;';

ENTITY : 'ENTITY';
END_ENTITY : 'END_ENTITY;';

FUNCTION : 'FUNCTION';
END_FUNCTION : 'END_FUNCTION;';

RULE : 'RULE';
END_RULE : 'END_RULE;';




SUBTYPE_OF : 'SUBTYPE OF';
SUPERTYPE_OF : 'SUPERTYPE OF';

ONEOF : 'ONEOF';
ABSTRACT : 'ABSTRACT';
OPTIONAL : 'OPTIONAL';
FIXED : 'FIXED';
OF : 'OF';

SET : 'SET';
ARRAY : 'ARRAY';
LIST : 'LIST';

BOOLEAN : 'BOOLEAN';
REAL : 'REAL';
INTEGER : 'INTEGER';
BINARY : 'BINARY';
NUMBER : 'NUMBER';

STRING : 'STRING';
ENUMERATION : 'ENUMERATION';
SELECT : 'SELECT';


WHERE : 'WHERE';
DERIVE : 'DERIVE';
UNIQUE : 'UNIQUE';
INVERSE : 'INVERSE';

SELF_ : 'SELF\\';
FOR : 'FOR';

NAME : [0-9a-zA-Z_]+ ;
