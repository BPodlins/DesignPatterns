# ***Iterator***

## Purpose:
Allows sequential access to the elements of complex object without revealing its internal representation

## Use cases:
- When you want to access the content of aggregated object without reveling it internal implementation
- If you want to allow multiple processes to simultaneously go through aggregated objects
- If you want to share uniform interface to walk through different aggregated structures (to ensure handling of polymorphic iteration)

## Elements:
- Iterator - defines interface, that allows access to elements, and walking through them
- ConcreteIterator - covers implementation of __Iterator__ class interface
- Aggregate - defines interface to create __Iterator__ objects
- ConcreteAggregate - covers implementation of interface to create __Iterator__ objects that return copy of appropriate __ConcreteIterator__ class