# ***Builder***

## Purpose:
Builder separates creating complex object from its representation, and because of that the same building process can lead to different representations.

## Use cases:
- If algorithm used to create complex objects, should be independent from components of this object and method of connecting them
- When process of construction has to enable different representations (views) for generated object

## Elements:
- Builder - determines abstract interface to create components of __Product__ element
- ConcreteBuilder - it is a concrete implementation of abstract __Builder__. It defines and tracks generated representations, 
also it provides an interface to get created products.
- Director - it creates an object with __Builder__ interface class.
- Product - represents generated cluster object.

