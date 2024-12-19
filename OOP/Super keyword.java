/*
    The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).

    Uses of super keyword
        To call methods of the superclass that is overridden in the subclass.
        To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
        To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.

    Super cannot be called by the client because they should not know about the details of the implementation

    References:
        https://w ww.programiz.com/java-programming/super-keyword

*/


/*
    Example 1: Method overriding

    If methods with the same name are defined in both superclass and subclass, the method in the subclass overrides the method in the superclass. This is called method overriding.

    Since display() is defined in both the classes, the method of subclass Dog overrides the method of superclass Animal. Hence, the display() of the subclass is called.

    What if the overridden method of the superclass has to be called?
        We use super.display() if the overridden method display() of superclass Animal needs to be called.
*/

class Animal1 {

    // overridden method
    public void display() {
        System.out.println("I am an animal");
    }
}

class Dog1 extends Animal1 {

    // overriding method
    @Override
    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {
        display();
    }
}


/*
    Example 2: super to Call Superclass Method

    The superclass and subclass can have attributes with the same name. We use the super keyword to access the attribute of the superclass.
*/

class Animal2 {

    // overridden method
    public void display() {
        System.out.println("I am an animal");
    }
}

class Dog2 extends Animal2 {

    // overriding method
    @Override
    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {

        // this calls overriding method
        display();

        // this calls overridden method
        super.display();
    }
}


/*
    Example 3: Access superclass attribute

    In this example, we have defined the same instance field type in both the superclass Animal and the subclass Dog.

    We then created an object dog1 of the Dog class. Then, the printType() method is called using this object.

    Inside the printType() function, type refers to the attribute of the subclass Dog. super.type refers to the attribute of the superclass Animal.

    Hence, System.out.println("I am a " + type); prints I am a mammal. And, System.out.println("I am an " + super.type); prints I am an animal.
*/

class Animal3 {
    protected String type = "animal";
}

class Dog3 extends Animal3 {
    public String type = "mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

/* 
    Example 4: Use of super() to access superclass constructor

    As we know, when an object of a class is created, its default constructor is automatically called.

    The super() keyword is used to explicitly call the constructor of the superclass. This is particularly useful when the superclass has a parameterized constructor or when you want to add clarity to the code. 

    Here, when an object dog1 of Dog class is created, it automatically calls the default or no-arg constructor of that class.

    Inside the subclass constructor, the super() statement calls the constructor of the superclass and executes the statements inside it. Hence, we get the output I am an animal.

     However, using super() is not compulsory. Even if super() is not used in the subclass constructor, the compiler implicitly calls the default constructor of the superclass.

    If super() is not explicitly used, the compiler automatically inserts a call to the no-argument constructor of the superclass.

    The parameterized super() must always be the first statement in the body of the constructor of the subclass, otherwise, we get a compilation error.
 */

class Animal4 {

    // default or no-arg constructor of class Animal
    Animal4() {
        System.out.println("I am an animal");
    }
}

class Dog4 extends Animal4 {

    // default or no-arg constructor of class Dog
    Dog4() {

        // calling default constructor of the superclass
        super();

        System.out.println("I am a dog");
    }
}


/*
    Example 5: Call Parameterized Constructor Using super()

    The compiler can automatically call the no-arg constructor. However, it cannot call parameterized constructors.
    
    If a parameterized constructor has to be called, we need to explicitly define it in the subclass constructor.
    
    Note that in the example, we explicitly called the parameterized constructor super("Animal"). The compiler does not call the default constructor of the superclass in this case.
 */

class Animal5 {

    // default or no-arg constructor
    Animal5() {
        System.out.println("I am an animal");
    }

    // parameterized constructor
    Animal5(String type) {
        System.out.println("Type: " + type);
    }
}

class Dog5 extends Animal5 {

    // default constructor
    Dog5() {

        // calling parameterized constructor of the superclass
        super("Animal");

        System.out.println("I am a dog");
    }
}


class SuperKeyword {
    
    public static void main(String[] args) {

        // Example 1: Method overriding
        Dog1 dog1 = new Dog1();
        dog1.printMessage();

        // Example 2: super to Call Superclass Method
        Dog2 dog2 = new Dog2();
        dog1.printMessage();
  
        // Example 3: Access superclass attribute
        Dog3 dog3 = new Dog3();
        dog3.printType();

        // Example 4: Use of super()
        Dog4 dog4 = new Dog4();

        // Example 5: Call Parameterized Constructor Using super()
        Dog5 dog5 = new Dog5();

    }
}