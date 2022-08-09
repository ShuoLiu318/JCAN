grammar CAN;

expr: (beliefs
    | events
    | plan
    | action ) * EOF;

atom
    : NAME
    ;

// belief
belief
    : operator* atom // !atom
    | belief (operator belief)+
    | 'true'
    | 'false'
    ;

beliefs
    : 'Beliefs' '{' beliefList '}'
    ;

beliefList
    : belief (',' belief)*
    | 'nil'
    ;

events
    : 'Events' '{' eventList '}'
    ;

event
    : atom
    ;

eventList
    : 'nil'
    | event (',' event)*
    ;

// plan
plan
    : atom
    | 'Plan' plan ':' event '<-' planBody
    | 'goal' '(' beliefList ',' plan ',' belief ')'
    ;

planBody
    : plan ((operator | ';') plan)*
    ;

/*goal
    : 'goal' '(' beliefList ',' plan ',' belief ')'
    ;*/

// action
action
    : atom
    | 'Action' action ':' preCon '<-' '<' '{' beliefList '}' ',' '{' beliefList '}' '>'
    ;

preCon
    : beliefList
    ;

// op
operator
    : '&'  // and
    | '|'  // or
    | '||' // paralleism
    | '!' // negative
    | '>>' // the execution of P1, and the execution of P2 if P1 fails
    ;

NAME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// comment
COMMENT: '//' ~[\n\r]* ( [\n\r] | EOF) -> channel(HIDDEN) ;
MULTILINE_COMMENT: '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> channel(HIDDEN);


