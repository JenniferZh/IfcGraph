grammar STEPGrammar;


/*
 * Parser Rules
 */

ifcFile
	: ISOSTEPSTART (header)? (data)? ISOSTEPEND EOF
	;


//header

header
	: 'HEADER;' (headerLine)* 'ENDSEC;'
	;


headerLine
	: 'FILE_DESCRIPTION' '(' argumentList ')' ';' #filedescipt
	| 'FILE_NAME' '(' STRING ',' argumentList ')' ';'  #filename
	| 'FILE_SCHEMA' '(''(' STRING ')'')' ';' #fileschema
	;



//data

data
	: 'DATA;' (dataLine)* 'ENDSEC;'
	;

dataLine
	:
	'#' INT '=' typedListArgument ';'
	;

typedListArgument
	: NAME  '(' ')'
	| NAME  '(' argumentList ')'
	;


//argument

argument
    : '#' INT
    | typedListArgument
	| (INT|NEGINT|INTEXP|FLOAT|STRING|BOOLEAN|ENUM|OVERRIDE|NONDEF)
	| listArgument
	;


listArgument
	: '()'
	| '(' argumentList ')'
	;


argumentList
    : argument (',' argument)*
    ;
/*
 * Lexer Rules
 */

WS :	[ \t\r\n]+ -> skip	;


BLOCK_COMMENT
	: '/*' .*? '*/' -> skip
	;
LINE_COMMENT
	: '//' ~[\r\n]* -> skip
	;

NONDEF : '$';
OVERRIDE : '*';


BOOLEAN : '.T.' | '.F.' ;


INT :   '0' | [1-9] [0-9]* ; // no leading zeros

NEGINT :  '-' INT; // negtive int

INTEXP : (INT|NEGINT) EXP ;

FLOAT :
		'.' [0-9]+ EXP?	 // .35E-9
	|	(INT|NEGINT) '.' [0-9]* EXP? // 1.35, 1.35E-9, 0.3, -4.5, 1.E-5
    ;

fragment EXP :   [Ee] [+\-]? [0-9]* ; // \- since - means "range" inside [...]



ENUM : '.' NAME '.' ;

STRING : '\'' ((~[']) | '\'\'' )* '\'' ;



ISOSTEPSTART :	'STEP;' | 'ISO' [0-9\-]* ';';
ISOSTEPEND :	'ENDSTEP;' | 'END-ISO'[0-9\-]* ';';

HEADER	:	'HEADER;';
DATA	:	'DATA;';
ENDSEC	:	'ENDSEC;';



NAME : [0-9a-zA-Z_]+ ;

