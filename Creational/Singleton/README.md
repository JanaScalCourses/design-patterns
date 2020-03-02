# The Pattern
> Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a 
global access point to this instance.

Generally, it consist of make the constructor private and creating only one object, that is referenced by a private class
attribute, and accessed by a getInstance method.
 
Although it is a simple pattern, since it needs to guarantee the existence of a single instance, 
depending on the environment, it is necessary to deal with some possible restrictions: threads, serialization, 
and reflection. 

## Treads
In a multi-thread application, it is necessary to make the initialization thread-safe. Most initializations is already 
true, but in the case of Lazy initialization inside the constructor this is false.
In the example, I choose the initialization on demand holder idiom, or Bill Pugh Holder, which takes advantage of 
language guarantees about class initialization. Thus, this solution is thread-safe and lazy initialized. 

## Serialization/Deserialization
By implementation, the deserialization of an object is actually a copy of the object serialized, which breaks the 
pattern. To avoid that, the singleton needs to return the instance on the `readResolve` method.
These method is checked on `readObject` during the deserialization, where, if exists, it is invoked instead the 
`readObject` method. This means that, instead creating a new object, the deserialization will return the instance 
from the Singleton class.

Other error from serialization is when the class structure changes between serialization and deserialization, which 
cause the JVM to give an exception in the de-serializing process.
This problem can be solved only by adding a unique serial version id to the class. 
It will prevent the compiler from throwing the exception by telling it that both classes are same, 
and will load the available instance variables only.

## Reflection  
The reflection api allows change private variables from outside a class. Although it is impossible to avoid that, 
refer [here](https://howtodoinjava.com/design-patterns/creational/singleton-design-pattern-in-java/#comment-5266), 
it is a good practice to throw a exception in the construction in case the instance already is initialized. 

# The Example
For the `Factory` example I'll use the [reffactoring.guru](https://refactoring.guru/design-patterns/singleton) 
example from the pseudocode: Database. But instead using the lazy thread-safe constructor pattern, I will implement
throw enum.  

# Run it!
To run the example, you need have the jdk to compile the code, consult the installation instructions.

After that, you need to compile the code, enter src folder:
 ```
 javac Main.java
 ```
 And then, run it:
 ```
java Main
```