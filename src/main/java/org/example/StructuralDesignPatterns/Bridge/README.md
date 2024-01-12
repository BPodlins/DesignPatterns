# ***Bridge***

## Purpose:
Separates abstraction from its implementation, and thanks to that you can modify two elements independently.

## Use cases:
- If you want to avoid permanent tie of abstraction and its implementation. It can be useful when implementation needs to be chosen or changed during the runtime.
- When extending by creating subclasses should be possible for abstraction as well as for implementation. Then the __Bridge__ pattern allows connecting different abstractions and implementations and also expanding them independently.
- If changes in implementing abstraction shouldn't affect clients.
- When amount o classes increases fast.
- When you want to share implementation in meany objects and hide it from the client.

## Elements:
- Abstraction:
  - defines abstract interface
  - stores references to the __Implementor__ type objects.
- RefinedAbstraction:
  - extends interface defined in __Abstraction__ class.
- Implementor:
  - defines interface for class with implementation. This interface does not need to directly respond to the __Abstraction__ class interface. Usually interface class of __Implementor__ shares only simple operations and in __Abstraction__ class they are defined based on higher level operations.
- ConcreteImplementor:
  - defines implementation of interface __Implementor__ class and defines its concrete implementation.