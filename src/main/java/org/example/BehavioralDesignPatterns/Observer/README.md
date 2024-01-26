# ***Observer***

## Purpose:
Defines dependency one to meany between objects. When state of one of the objects changes, all objects depended on it, are automatically noticed and updated

## Use cases:
- When abstraction has two aspects, and one of them depends on the other. Encapsulating those aspects in separate objects enables modifying and reusability independent of one another.
- If change in one object requires modifying another, but it is not known how meany objects need to be changed.
- If object should be able to notify different objects, without determining its type. It means that objects shouldn't be closely related.

## Elements:
- Subject:
  - knows observers that are related to it; subject can be observed by any number of __Observer__ objects.
  - shares interface to attach and detach __Observer__ objects. 
- Observer - defines interface to update object, which should be notified about changes of subject.
- ConcreteSubject:
  - stores state that is relevant for __ConcreteObserver__ objects.
  - when its state is changed, it sends notification to connected observers.
- ConcreteObserver:
  - stores reference to __ConcreteSubject__ objects.
  - stores state, which should be consistent with the state of subject
  - covers implementation of interface to update, from __Observer__ class, that is needed to keep the consistency of __ConcreteObserver__ class state, with the state of the subject