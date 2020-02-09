# The Factory Method
 The Factory Method  is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of an object that will be created. It separates product construction code, within an method, from the code that actually uses the product, the class main purpose.
 
# Example
For the `Factory` example I'll use the [reffactoring.guru](https://refactoring.guru/design-patterns/factory-method) example:  
> Create a cross-platform UI elements without coupling the client code to concrete UI classes.  

![](./example.png)

- A superclass `Dialog` handle objects using `Button` interface.
  - The `WindownsDialog` subclass handle a concrete button: `WindownsButton`
  - The `WebDialog` subclass handle a concrete button: `WebButton`
- The Main program only handle the `Dialog` and `Button` class

