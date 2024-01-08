# ***Adapter***

## Purpose:
Transforms class interface to other, that is expected by client. Adapter allows classes to share, which because of their not compatible interfaces, normally cannot cooperate 


## Use cases:
- If you want to use existing class, but its interface does not match the one that is needed
- When you want to create class to be used multiple times, that works with unrelated or unknown classes (so that the interfaces won't probably match)
- * (it only relates to object adapter) - when you need to use multiple existing subclasses, but adjusting their interfaces by creating them for each one is impractical. Object adapter can adjust interface of its superior class.

## Elements:
- Target - defines interface that is specific for clients domain
- Client - cooperates with objects that match interface of __Target__ class
- Adaptee - defines existing interface, which needs to be adjusted
- Adapter - adjusts interface of class __Adaptee__ to the __Target__ interface