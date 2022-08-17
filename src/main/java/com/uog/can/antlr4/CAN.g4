grammar CAN;

c_text
    : stat+
    ;

stat
    : expr NEWLINE              # printExpr
    | NEWLINE                   # blank
    ;

expr
    : (type = 'Beliefs') expr   # initBelief
    | (type = 'Events') expr    # externalEvent
    | (type = 'Plan') expr      # plan
    | (type = 'Action') expr    # act
    | '{' atomlist '}'          # beliefEvents
    | atom ':' preCon '<-' expr+    # planBody
    | atom ':' preCon '<-' '<' '{' atomlist '}' ',' '{' atomlist '}' '>'    # actBody
    | atom                                                                  # atoms
    ;

atom
    : NAME                                      # atomName
    | ('true'|'false')                          # bool
    | '{' '}'                                   # emptyList
    | atom (op = ('&'|'|')) atom                # beliefs
    | atom (op = (';'|'>>'|'||')) atom          # programs
    | 'nil'                                     # emptyProgram
    | 'goal' '(' atom ',' atom ',' atom ')'     # goal
    | (op = '!') atom                           # negation
    ;

atomlist
    : atom (',' atom)*      # atomList
    ;

preCon
    : atomlist              # condition
    ;
/*
// belief
belief
    :  (op = '!')* atom
    | belief (op= ('&'|'|') belief)+
    | 'false'
    | 'true'
    ;

beliefs
    : (type = 'Beliefs') '{' beliefList '}'
    ;

beliefList
    : belief (',' belief)*
    | 'nil'
    ;

//event
event
    : atom
    ;

events
    : (type = 'Events') '{' eventList '}'
    ;

eventList
    : 'nil'
    | event (',' event)*
    ;

// plan
plan
    : atom
    | (type = 'Plan') plan ':' preCon '<-' planBody
    | 'goal' '(' beliefList ',' plan ',' belief ')'
    ;

planBody
    : (plan | action) ( op=( ';' | '>>' | '||') (plan | action) )*
    ;

*/
/*goal
    : 'goal' '(' beliefList ',' plan ',' belief ')'
    ;*//*


// action
action
    : atom
    | (type = 'Action') action ':' preCon '<-' '<' '{' beliefList '}' ',' '{' beliefList '}' '>'
    ;

preCon
    : beliefList
    ;
*/

// atomType
BELIEFS : 'Beliefs';
EVENTS : 'Events';
PLAN : 'Plan';
ACTION : 'Action';

// op
AND : '&';
OR : '|';
PARALLEL : '||';
NEGATION : '!';
SEQ : ';';
FAIL : '>>';

// op
/*op
    : '&'  //and
    | '|'  //or
    | '||' //paralleism
    | '!' //negative
    | '>>' // P1>>P2: the execution of P1, and the execution of P2 if P1 fails
    |  ';'
    ;*/

NAME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NEWLINE:'\r'? '\n' ;     // 换行
WS  :   [ \t]+ -> skip ; // 匹配空白，按->skip命令跳过

// comment
COMMENT: '//' ~[\n\r]* ( [\n\r] | EOF) -> channel(HIDDEN) ;
MULTILINE_COMMENT: '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> channel(HIDDEN);


