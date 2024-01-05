# ***Singleton***

## Purpose:
It ensures that there is only one instance of given class and that it is globally available.


## Use cases:
- If there must be only one instance of a class that is accessible to the clients in a know place.
- When you need a possibility to extend one instance by creating subclasses and clients should be able to use the extended instance without the need to change the code.

## Elements:
- Singleton
  - It defines Instance operation that allows clients to access the unique class instance. Instance is a static method.
  - it can be responsible for creating own unique instance.