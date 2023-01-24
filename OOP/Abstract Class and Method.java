/*
Referências:
    https://www.programiz.com/java-programming/abstract-classes-methods

The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes)
An abstract class can have both the regular methods and abstract methods. 

Java Abstract Method
A method that doesn't have its body is known as an abstract method. We use the same abstract keyword to create abstract methods
If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.

Accesses Constructor of Abstract Classes
An abstract class can have constructors like the regular class. And, we can access the constructor of an abstract class from the subclass using the super keyword

Java Abstraction
The major use of abstract classes and methods is to achieve abstraction in Java.

Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.

This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.

A practical example of abstraction can be motorbike brakes. We know what brake does. When we apply the brake, the motorbike will stop. However, the working of the brake is kept hidden from us.

The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently for different motorbikes, however, what brake does will be the same.

Key Points to Remember
- We use the abstract keyword to create abstract classes and methods.
- An abstract method doesn't have any implementation (method body).
- A class containing abstract methods should also be abstract.
- We cannot create objects of an abstract class.
- To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
- A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
- We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example, Animal.staticMethod();

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


// Example 1 - Abstract Class
abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming \n");
  }
}



// Example 2 - Abstract Class and Method
abstract class Animal {
  abstract void makeSound();

  public void eat() {
    System.out.println("I can eat.");
  }
}

class Dog extends Animal {

  // provide implementation of abstract method
  public void makeSound() {
    System.out.println("Bark bark \n");
  }
}



// Example 3 - Java Abstraction
abstract class MotorBike {
  abstract void brake();
}

class SportsBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("SportsBike Brake \n");
  }
}

class MountainBike extends MotorBike {
    
  // implementation of abstract method
  public void brake() {
    System.out.println("MountainBike Brake");
  }
}




// Example 4 - Accesses Constructor of Abstract Classes
// An abstract class can have constructors like the regular class. And, we can access the constructor of an abstract class from the subclass using the super keyword. For example,

abstract class SuperClass {
   SuperClass() {
      System.out.println("SuperClass Constructor");
   }
}

class SubClass extends SuperClass {
   SubClass() {
      super();
   }
}
// Here, we have used the super() inside the constructor of Dog to access the constructor of the Animal.
// Note that the super should always be the first statement of the subclass constructor.




class Main extends Language {

  public static void main(String[] args) {


    // Example 1 - Abstract Class

    // create an object of Main
    Main obj = new Main();

    // access method of abstract class
    // using object of Main class
    obj.display();



    // Example 2 - Abstract Class and Method

    // create an object of Dog class
    Dog d1 = new Dog();

    d1.makeSound();
    d1.eat();



    // Example 3 - Java Abstraction
    MountainBike m1 = new MountainBike();
    m1.brake();
    SportsBike s1 = new SportsBike();
    s1.brake();



    // Example 4 - Accesses Constructor of Abstract Classes
    SubClass SC1 = new SubClass();
  }
}
