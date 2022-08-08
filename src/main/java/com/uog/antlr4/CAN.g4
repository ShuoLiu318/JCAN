grammar CAN;

expr: (initBelief
    | externalEvent
    | plan      //| (atomList operator+)+
    | action ) * EOF;

atom
    : NAME
    | '!'atom  //negative
    ;

/*atomList
    : atom (operator+ atom)*
    ;*/

// belief
initBelief
    : 'InitBeliefs' '{' beliefList '}' ';'
    ;

belief
    : atom
    | 'true'
    | 'false'
    ;

beliefList
    : belief (operator+ belief)*
    | 'nil'
    ;

externalEvent
    : 'Event' '{' eventList '}' ';'
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
    //: 'Plan' plan ':' beliefList '<-' ((plan | action | goal) operator+)+
    : 'Plan' plan ':' beliefList '<-' ((atom | goal) operator+)+ // to-do: Cannot tell the atom if it's a plan or an action
    | NAME
    ;

goal
    : 'goal' '(' goalList ')'
    ;

goalList
    : ( beliefList | 'true' | 'false') ',' plan ',' (atom | 'true' | 'false')
    ;

// action
action
    : 'Action' action ':' beliefList '<-' '<' '{' beliefList '}' ',' '{' beliefList '}' '>' ';'
    | NAME
    ;

// op
operator
    : '<-'
    | '//'  //comment
    | '&'  //and
    | '|'  //or
    | '||' //paralleism
    | ','
    | ':'
    | ';'
    | '<' '>'
    | '{' '}'
    ;

NAME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// comment
COMMENT: '//' ~[\n\r]* ( [\n\r] | EOF) -> channel(HIDDEN) ;
MULTILINE_COMMENT: '/*' ( MULTILINE_COMMENT | . )*? ('*/' | EOF) -> channel(HIDDEN);


