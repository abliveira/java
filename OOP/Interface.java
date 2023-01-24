/*
Referências:
    https://www.programiz.com/java-programming/interfaces

An interface is a fully abstract class. It includes a group of abstract methods (methods without a body). They must be implemented in the classes that implement the interface. Interfaces provide specifications that a class (which implements it) must follow.

Implementing an Interface
Like abstract classes, we cannot create objects of interfaces.
To use an interface, other classes must implement it. We use the implements keyword to implement an interface.

Advantages of Interface in Java

Similar to abstract classes, interfaces help us to achieve abstraction in Java.

Here, we know getArea() calculates the area of polygons but the way area is calculated is different for different polygons. Hence, the implementation of getArea() is independent of one another.

In our previous example, we have used getArea() as a specification inside the interface Polygon. This is like setting a rule that we should be able to get the area of every polygon.

Now any class that implements the Polygon interface must provide an implementation for the getArea() method.
Interfaces are also used to achieve multiple inheritance in Java

Differences between abstract classes and interfaces

The main difference between an interface and an abstract class is that an interface cannot have state, whereas the abstract class can have state with instance variables.
Another key difference is that classes can implement more than one interface, but they can extend only one abstract class. This is a design decision based on the fact that multiple inheritance (extending more than one class) can cause code deadlocks. Java's engineers decided to avoid that.
Another difference is that interfaces can be implemented by classes or extended by interfaces, but classes can be only extended.
It's also important to note that lambda expressions can only be used with a functional interface (meaning an interface with only one method), while abstract classes with only one abstract method cannot use lambdas.

Abstract classes
- Can have any kind of instance or static variables, mutable or immutable.
- A class can extend only one abstract class.
- Can only be extended.
- Can have instance mutable fields, parameters, or local variables.
- Abstract classes with only one abstract method cannot use lambdas.
- Can have constructor.
- Can have any kind of methods.

Interfaces
- Can only have final static variables. An interface can never change its own state.
- A class can implement multiple interfaces.
- Can be implemented with the implements keyword. An interface can also extend interfaces.
- Can only use static final fields, parameters, or local variables for methods.
- Only functional interfaces can use the lambda feature in Java.
- Can't have constructor.
- Can have abstract methods.
- Can have default and static methods (introduced in Java 8).
- Can have private methods with the implementation (introduced in Java 9).

*/

interface Polygon {
  void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon {

  // implementation of abstract method
  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

class Main {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
  }
}