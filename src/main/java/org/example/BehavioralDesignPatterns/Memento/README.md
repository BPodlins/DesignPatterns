# ***Memento***

## Purpose:
Without violating encapsulation, it records and stores the internal state of an object in an external unit, 
allowing the object to be restored to its previous state based on the stored information.

## Use cases:
- When there is a need to preserve the (partial) state of an object for its later restoration in that state ___and___
- direct access to retrieve the state would result in revealing implementation details and violate the encapsulation of the object

## Elements:
- Memento:
  - stores the internal state of the object, the __Originator__. The memento can encompass any part of its internal state as determined by the source.
  - protects data from being accessed by objects other than the source. Essentially, mementos have two interfaces. The caretaker sees a restricted interface of the memento and can only pass it to other objects, while the originator has access to the full interface, allowing retrieval of all data necessary to restore its previous state. Ideally, only the source that created the memento has access to its internal state.
- Originator:
  - creates a memento encompassing the snapshot of the internal state of the source.
  - uses the memento to restore its internal state
- Caretaker:
  - is responsible for managing the memento
  - never manipulates the contents of the memento nor inspects its content
