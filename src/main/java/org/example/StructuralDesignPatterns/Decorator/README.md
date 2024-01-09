# ***Decorator***

## Purpose:
Dynamically adds additional jobs to the object. This pattern exposes elastic, alternate way to create subclasses with enriched functionalities. 

## Use cases:
- When there is a need to add tasks to the particular objects in dynamic and transparent way (so without influencing other objects)
- When you need a mechanism to serve tasks, that can be revoked
- When expanding by creating subclasses is impractical. Sometimes there is a possibility to create large amount of independent expansions, which leads to considerable growth of subclasses that are needed to serve all combinations. Furthermore, definition of class may be hidden or in other way it can make creating subclasses impossible. 
- 
## Elements:
- Component - defines interface of objects, to which there can be dynamically added additional jobs.
- ConcreteComponent - it defines the component interface.
- Decorator - it has a reference to the Component object, and it defines interface, that matches Component class interface.
- ConcreteDecorator - adds tasks to the component