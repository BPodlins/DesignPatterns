# ***Facade***

## Purpose:
Shares uniform interface for collection of interfaces from the subsystem. Facade determines interface of higher level, which makes using the subsystem interfaces easier.
## Use cases:
- Programmer wants to share interface that's easy to use, for a complicated subsystem. Complexity of subsystem usually grows with their development. Using design patterns usually leads to creating bigger amount of smaller classes. It makes it easier to adjust and reuse code, but on the other hand it makes it harder to use in a client that does not need modifying. Facade lets you expose an interface that is good enough for most of the clients. Only programmer that need bigger capabilities, will need to look under the facade.
- Appearance of multiple dependencies between clients and classes with implemented abstraction. Then you can introduce facade to separate subsystem from clients and other subsystems, which has a positive effect on the dependency of subsystem and its transfer between platforms.
- Programmer wants to divide subsystem into layers. Facade then serves to defining entry point for each layer of the subsystem. If subsystems are independent, you can simplify the dependencies between them by using only their facade to communicate.

## Elements:
- Facade:
  - knows subsystem classes that are responsible for handling requests.
  - delegates requests from client to corresponding subsystem objects.
- Subsystem classes:
  - covers implementation of subsystem classes
  - handles tasks that are assigned by facade object
  - they do not have reference to the __Facade__ object