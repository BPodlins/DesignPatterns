# ***Visitor***

## Purpose:
It represents an operation performed on the elements of object structures.
This pattern prevents defining a new operation without modifying the classes of the elements it operates on

## Use cases:
- If the object structure involves multiple classes with different interfaces, and you want to perform operations on these objects depending on their specific classes
- When there is a need to perform many different and unrelated operations on objects within their structure, and you want to avoid 'cluttering' classes with these operations, the Visitor pattern allows for grouping related operations by defining them in a single class. If the object structure is shared among multiple applications, it is advisable to apply the Visitor pattern to encapsulate the operations only in those programs where they are needed
- When the classes defining the object structure rarely change but there is a frequent need to define new operations for that structure, modifying the classes within the object structure requires redefining the interface of all visitors, which can be costly. If the classes within the object structure change frequently, it is probably better to define the operations within those classes 

## Elements:
- Visitor - covers declaring a 'Visit' operation for each 'ConcreteElement' class within the object structure. The name and signature of the operation specify the sending class to the visitor, making it possible for visitors to identify the class of the specific element being visited. Subsequently, the visitor can directly access the element through its interface.
- ConcreteVisitor - covers implementations of all operations declared in the 'Visitor' class. Each operation realizes a portion of the algorithm defined for the corresponding class of an object within the structure. The 'ConcreteVisitor' class provides the context for the algorithm's execution and stores its local state. The state often accumulates results during traversal of a given structure.
- Element - defines operation __Accept__ that receives visitor as an argument.
- ConcreteElement - covers implementation of __Accept__ operation that receives visitor as an argument.
- ObjectStructure:
  - can count included elements.
  - can provide a high-level interface that allows visitors to visit elements within the structure.
  - can be either __Composite__ or a collection, such as a list or a set