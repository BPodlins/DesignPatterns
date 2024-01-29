# ***State***

## Purpose:
Enables an object to modify its behavior in response to changes in its internal state. It appears as if the object has changed its class.

## Use cases:
- The object's behavior depends on its state, and the object must change its behavior dynamically based on its state during runtime.
- Operations involve long, multipart conditional instructions depending on the object's state. This state is typically represented by enumerations. Often, several operations share the same conditional structure. The State pattern entails placing each branch of such a structure in a separate class. This allows treating the state as an independent object that can be modified.

## Elements:
- Context
  - defines the interface accessible to clients.
  -  holds an instance of a ConcreteState subclass, defining the current state.
- State - defines an interface for encapsulating the behavior associated with a particular state of the __Context__ object.
- Subclasses of ConcreteState class - Each subclass includes an implementation of behavior associated with the state of the __Context__ object.