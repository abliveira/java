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