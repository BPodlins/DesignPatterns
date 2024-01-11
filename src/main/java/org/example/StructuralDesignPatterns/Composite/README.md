# ***Composite***

## Purpose:
Composes object into tree-like structures that resembles part-whole hierarchy. This pattern allows user to treat individual objects and their compositions in the same way. 

## Use cases:
- If you want to picture part-whole hierarchy type
- When you want, so that in the client you can ignore the differences between objects and objects compositions. Clients than will treat all the objects from the structure, in the same way. 
## Elements:
- Component:
  - includes declaration of interface of composed objects
  - includes implementation of default behaviour for the common interface of all the classes
  - includes declaration of interface that allows access to subordinate components and managing them
  - optionally it defines the interface that allows access to parent element of given component in recurrence structure, and also if needed, implementation of this interface.
- Leaf:
  - represents leafs in composition
  - defines behavior of objects that are not complex to compose
- Composite:
  - defines behaviour of components that have subordinate elements
  - stores subordinate components
  - includes implementation of operations from Component class interface, that are connected with subordinate elements
- Client:
  - manipulates objects in composition by __Component__ class interface