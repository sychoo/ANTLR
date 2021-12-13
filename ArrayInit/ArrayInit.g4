// antlr4 ArrayInit.g4;

// match array/nested array like
//
// {1, 2, 3}
// {1, {2, 3}, 4}

grammar ArrayInit;

init : '{' value (',' value)* '}';

value : init
    | INT
    ;

INT : [0-9]+;
WS: [ \t\r\n]+ -> skip;
