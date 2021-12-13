// generate java parser programs
// antlr4 Hello.g4; javac *.java;
//
// start TestRig on grammar Hello at rule r
// grun Hello r -tokens;
//
// print parse tree in LISP-style text form (root children1 children2 ...)
// grun Hello r -tree
//
// look at the parse tree visually
// grun Hello r -gui
//
// default
// antlr4 Hello.g4; javac *.java; grun Hello r -gui;

grammar Hello;
r : '你好' ID;
ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;
