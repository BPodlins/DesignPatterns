# ***Mediator***

## Purpose:
Describes object that encapsulates information about abstraction between objects from given collection. This pattern helps to ensure loose connection, because it
prevents direct reference of objects to each-other also it enables to independently modify interaction between them.

## Use cases:
- Collection of objects communicates in a well defined, but complicated way. Dependencies that are created in that way, are unstructured and hard to understand.
- Repeated use of object is hard, due to the fact that it uses references to meany other objects and communicates with them.
- Adapting distributed behavior across multiple classes should not require creating multiple subclasses.

## Elements:
- Mediator - defines interface to communicate with cooperating objects.
- ConcreteMediator
  - covers cooperation with coordinating the cooperating objects .
  - knows linked cooperating objects that are linked with it and manages them.
- Colleague classes (cooperating classes)
  - each cooperating object knows Mediator object that is linked to it.
  - each cooperating object communicates with mediator instead of other objects like that.
