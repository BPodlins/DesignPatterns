# ***Interpreter***

## Purpose:
It defines the representation of the language grammar and the interpreter, which uses this implementation to interpret the sentences from given language

## Use cases:
- Grammar is simple. In a complicated grammar case, class hierarchy becomes big and hard to manage. Then it may be better to use different type of tools, like for example Parsers.
- Efficiency is not the most important. Most efficient interpreters usually do not directly interpret syntax tree, but at first they translate them to a different form. For example regular expressions are often transformed to state machine.

## Elements:
- AbstractExpression - covers declaration of abstract operation __Interpret__ shared to all the nodes of the abstract syntax tree.
- TerminalExpression - covers implementation of __Interpret__ operation, connected to the end symbol from given grammar.
- NonterminalExpression:
  - for each rule of type R ::= R1, R2... Rn in grammar, there is a need to create one class of this type
  - stores variables of copy type __AbstractExpression__ for each of the symbols from R1 to Rn.
  - covers implementation of __Interpret__ operation for indirect symbols. Operation this usually recursively calls itself for variables representing symbols from R1 to Rn.
- Context - stores global interpreter info.
- Client: 
  - creates or receives abstract syntax tree, that represents defined task in language defined by grammar. This tree consists of copies of NonterminalExpression and TerminalExpression classes.
  - calls Interpret operation