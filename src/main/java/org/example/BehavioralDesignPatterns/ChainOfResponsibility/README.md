# ***Chain of responsibility***

## Purpose:
Allows to avoid binding sender with receiver, because it allows several objects to serve 
requests. It chains receiver objects and transmits request between them, until it is handled 

## Use cases:
- When more than one object can handle request, but at the beginning it is not known which one will do it. Object that handles request, should be established automatically.
- When you want to send request to one from several objects without specifying receiver
- If collection of objects, which can handle request, should be defined dynamically

## Elements:
- Handler:
  - defines interface to handle requests
  - (optional) covers implementation of reference to successor
- Concrete handler:
  - handles requests, that it is responsible to
  - can obtain access to successor 
  - if object __Concrete Handler__ can handle request, it does it; in other case it passes it on to the successor
- Client - initializes request directed to object __ConcreteHandler__ included in the chain