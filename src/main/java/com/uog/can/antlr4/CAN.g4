grammar CAN;

c_text
    : stat+
    ;

stat
    : expr NEWLINE              # expression
    | NEWLINE                   # blank
    ;

expr
    : (type = 'initBelief') '{' atom (',' atom)* '}'                                       # initBelief
    | (type = 'externalEvent') '{' atom (',' atom)* '}'                                    # externalEvent
    | (type = 'Plan') atom ':' preCon '<-' planBody                                        # plan
    | (type = 'Action') atom ':' preCon '<-' '<' '{' add '}' ',' '{' delete '}' '>'        # action
    ;

atom
    : NAME                                      # atomName
    | ('true'|'false')                          # bool
    | atom (op = ('&'|'|')) atom                # logicBeliefs
    | 'nil'                                     # empty
    | (op = '!') atom                           # negation
    | 'goal' '(' atom ',' atom ',' atom ')'     # goal
    ;

planBody
    : atom (';' atom)*
    ;

preCon
    : atom              # preCondition
    ;

add
    : atom (',' atom)*  # addBelief
    ;

delete
    : atom (',' atom)*  # deleteBelief
    ;



// atomType
BELIEFS : 'initBelief';
EVENTS : 'externalEvent';
PLAN : 'Plan';
ACTION : 'Action';

// op
AND : '&';
OR : '|';
NEGATION : '!';

NAME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NEWLINE:'\r'? '\n' ;                                                                                // 换行
WS  :   [ \t]+ -> skip ;                                                    // 匹配空白，按->skip命令跳过

// comment
COMMENT: '//' ~[\n\r]* ( [\n\r] | EOF) -> channel(HIDDEN) ;
MULTILINE_COMMENT: '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> channel(HIDDEN);


//PARALLEL : '||';
//FAIL : '>>';
// SEQ : ';';

/*
// op
op
    : '&'  //and
    | '|'  //or
    | '||' //paralleism
    | '!' //negative
    | '>>' // P1>>P2: the execution of P1, and the execution of P2 if P1 fails
    |  ';'
    ;
*/

