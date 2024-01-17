# ***Flyweight***

## Purpose:
Uses partition to efficiently serve large amount of small objects.

## Use cases:
- App uses a large amount of objects
- Costs of maintaining objects is big, due to the sheer amount of them
- Most of the object states can be saved outside of it
- After transferring state outside, meant object groups can be replaced with relatively small amount of shared objects
- App is not dependent from objects identity. Because flyweight objects can be used concurrently, true test in fact will return __true__ for all the separate objects

## Elements:
- Flyweight - declares interface, from which the flyweights can get external state and use it to do the job
- ConcreteFlyweight - covers implementation of interface and stores innate state (if needed). ConcreteFlyweight objects need to allow concurrency. Saved in them state, must be external (cannot depend on context of their job)
- UnsharedConcreteFlyweight - not concurrent concrete flyweight:
  - not all subclasses of Flyweight class need to be concurrent. Interface of Flyweight class allows concurrency but does not force it. UnsharedConcreteFlyweight on some level of object structure, often have subordinate objects from ConcreteFlyweight family.
- FlyweightFactory:
  - creates flyweight objects and manages them
  - guarantees, that flyweights are used concurrently in a correct way. If client requests flyweight, object __Flyweight factory__ shares existing copy or if it does not exist, then it creates a new one.
- Client:
  - shares reference to the flyweight
  - calculates or stores external state of flyweights