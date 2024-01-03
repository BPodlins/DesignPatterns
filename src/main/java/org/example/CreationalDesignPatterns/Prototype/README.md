# ***Prototype***

## Purpose:
Based on prototyped copy, it determines types of created objects and generates new objects by coping this prototype.


## Use cases:
- Classes of created copies are determined during the runtime (data input accessed dynamically)
- Programmer wants to avoid creating a class hierarchy of fabrics that corresponds to the class hierarchy of products 
- Class examples can tak one of a few states, then adding corresponding number of prototypes than cloning them may be easier and more handy than manually creating copies of classes. (for every state)

## Elements:
- Prototype - covers the declaration of cloning interface.
- ConcretePrototype - covers the implementation of prototype.
- Client - creates new object by requiring form the prototype to clone itself. 