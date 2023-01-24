/*
Referências:
    https://www.programiz.com/java-programming/constructors


A constructor in Java is similar to a method that is invoked when an object of the class is created.
Unlike Java methods, a constructor has the same name as that of the class and does not have any return type. For example,

class Test {
  Test() {
    // constructor body
  }
}

Types of Constructor
In Java, constructors can be divided into 3 types:

No-Arg Constructor
Parameterized Constructor
Default Constructor

Important Notes on Java Constructors
Constructors are invoked implicitly when you instantiate objects.
The two rules for creating a constructor are:
The name of the constructor should be the same as the class.
A Java constructor must not have a return type.
If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0
Constructor types:
No-Arg Constructor - a constructor that does not accept any arguments
Parameterized constructor - a constructor that accepts arguments
Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
A constructor cannot be abstract or static or final.
A constructor can be overloaded but can not be overridden.
*/


// Example 1: Constructor Demonstration
class Example1 {
    private String name;

    // constructor
    Example1() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main() {

        // constructor is invoked while
        // creating an object of the Example1 class
        Example1 obj = new Example1();
        System.out.println("The name is " + obj.name);
    }
}


// Example 2: Java Constructor Overloading
class Example2 {

    String language;

    // constructor with no parameter
    Example2() {
        this.language = "Java";
    }

    // constructor with a single parameter
    Example2(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Programming Langauage: " + this.language);
    }

    public static void main() {

        // call constructor with no parameter
        Example2 obj1 = new Example2();

        // call constructor with a single parameter
        Example2 obj2 = new Example2("Python");

        obj1.getName();
        obj2.getName();
    }
}

// Only runs the examples contained in their classes
class Main {

    public static void main(String[] args) {

        // Runs example 1
        Example1 obj1 = new Example1();
        obj1.main();

        System.out.println();

        // Runs example 2
        Example2 obj2 = new Example2();
        obj2.main();
    }
}