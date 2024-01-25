# ***Template Method***

## Purpose:
Defines wireframe of algorithm and leaves clarification to some of its steps, to the subclasses.
Enables modification of some steps of the algorithm in subclasses without altering its structure.

## Use cases:
- To nonrecurring implementation of invariant parts of algorithm and enables implementation of changing behaviour in subclasses  
- When shared behaviour for subclasses should be separated and put in one class, to evade code replication. First you should find the differences in the existing code, and then they should be put in a new operation. At the end the parts that differ should be replaced with __Template method__ that calls one of the new operations.
- To control expansion of subclasses 

## Elements:
- AbstractClass: 
  - defines abstract simple operations defined in concrete subclasses to implement the steps of algorithm.
  - covers implementation of __Template method__ that defines wireframe of algorithm. __Template method__ calls simple operations, and also operations defined in __AbstractClass__ or other classes. 
- ConcreteClass - covers implementation of simple operations that implements specific, for subclass, steps of the algorithm.