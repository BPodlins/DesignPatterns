# ***Command***

## Purpose:
Encapsulates a request as an object. This allows parameterizing clients with different requests, queuing and logging of requests, and providing support for undoable operations

## Use cases:
- To parameterize objects with executed actions. In procedural languages, you can use __callbacks__ registered for later invocation to achieve parameterization. Commands are the object-oriented equivalents of callbacks.
- For specifying, queuing, and invoking requests at different points in a program. The lifetime of a __Command__ object does not have to depend on the original request. If it's possible to represent the recipient of the request independently of the address space, you can pass the command object associated with the request to another process and handle it there.
- For enabling the undo of changes. The Execute operation of the __Command__ object can store the necessary state within the command itself for undoing the effects of its execution. The class interface of __Command__ needs to include an __Unexecute__ operation, which reverses the effects of a previous __Execute__ call. The command history is stored on a list. This way, any number of operations can be undone and redone by traversing the list backward and forward, invoking the respective operations - __Unexecute__ and __Execute__
- For handling the recording of changes, allowing them to be replayed in case of system failure. By enriching the interface of the __Command__ class with load and save operations, you can create a persistent log of changes. Restoring the system after a failure involves loading the recorded commands from disk and re-executing them using the __Execute__ operation
- For building a system based on high-level operations derived from simple operations. This structure is commonly found in computer systems with __transaction__ handling. A transaction encapsulates a set of changes to data. The Command pattern allows modeling transactions. Commands share a common interface, enabling the execution of all transactions in the same manner. This pattern also facilitates the extension of the system with new transactions.

## Elements:
- Command -  involves declaring an interface intended for executing operations.
- ConcreteCommand:
  - defines the association between a Receiver object and an operation.
  - includes the implementation of the Execute operation in the form of invoking the relevant operations of the Receiver object.
- Client - creates a ConcreteCommand object and specifies the associated __Receiver__ with it.
- Invoker - demands handling of a request to the command.
- Receiver - capable of performing the operations needed to handle a request. Any class can act as the Receiver