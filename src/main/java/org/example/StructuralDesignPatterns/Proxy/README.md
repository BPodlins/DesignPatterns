# ***Proxy***

## Purpose:
Shares replacement or representation of another object in order to control access to it

## Use cases:
You can use proxy whenever where is a need more versatile and advanced reference to the object than normal pointer. Some typical examples:

- Remote Proxy - local representation of object in different addressing space.
- Virtual Proxy - on demand, it creates expensive objects.
- Security Proxy - controls access to the original object. Proxies of this type are useful when objects should have different access rights.
- Intelligent references - replaces normal pointers and performs additional operations with access to the object. Examples:
  - counting references that lead to the primary object, what enables to automatically let it go, when number of references drops down to zero.
  - reading permanent objects, to the memory in moment of creating theirs first reference
  - checking before accessing the original object, if it is locked, what guarantees that no other object can modify it.

## Elements:
- Proxy:
  - contains reference that enables Proxy to access real object; this reference can lead to the __Subject__ object, if class __RealSubject__ and __Subject__ have the same interfaces.
  - shares interface that is identical to the interface of __Subject__ class, and thanks to that Proxy can be substitution for a real object
  - controls access to the real object and can correspond for its creation and deletion
  - serves different purposes, depending on the type:
    - Remote Proxy - is responsible for encrypting requests and its arguments and passing the encrypted requests to the real object in different addressing space  
    - Virtual Proxy - can store additional information about real object, which enables to delay access to it.
    - Security Proxy - checks if the sender od request is authorized to send the request.
- Subject: 
  - defines shared interface of __RealSubject__ and __Proxy__, and thanks to that object __Proxy__ can be used everywhere, where objets __RealSubject__ are expected. 
- RealSubject:
  - defines real object represented by __Proxy__