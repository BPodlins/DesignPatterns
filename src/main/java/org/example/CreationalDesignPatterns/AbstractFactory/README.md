# ***Abstract factory***

## Purpose:
Abstract factory shares interface to create families of connected or dependent from each other objects, without specifying their concrete classes.

## Use cases:
- When system should be independent from creation method, assembling and representing its product.
- If system should be configured with the help of one of a meany product families.
- If connected object-products from one of the families ale designed to be used together and there must be insurance that they can be used together.
- When programmer wants to share product class and only reveal its interface, and not implementations.

## Elements:
- AbstractFactory - covers declaration of interface with operations to create abstract products. 
- ConcreteFactory - covers implementation of operations that create concrete products.
- AbstractProduct - cover declaration of interface for products of specific type
- ConcreteProduct - it defines object-product that is being created by responding concrete factory, and it covers implementation of __AbstractProduct__ interface class.
- Client:
  - Uses only the interfaces that are decelerated in classes __AbstractFactory__ and __AbstractProduct__