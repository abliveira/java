/*
Referências:
    https://www.programiz.com/java-programming/inheritance

Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.

The new class that is created is known as subclass (child or derived class) and the existing class from where the child class is derived is known as superclass (parent or base class).

Why use inheritance?
The most important use of inheritance in Java is code reusability. The code that is present in the parent class can be directly used by the child class.
Method overriding is also known as runtime polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.

Subclass methods inherited from a super class are used for 3 purposes
1. To augment the subclass API
• e.g., Stack subclass inherits fields & methods from Vector super class
public class Stack<E> {
 extends Vector<E> {

 e.g.,
 Stack<Integer> s =
 new Stack<>();
 ...
 if(!s.isEmpty())
 s.pop();

2. To implement subclass methods
• e.g., Stack’s push() method is implemented via addElement() method inherited from Vector
public class Stack<E> {
 extends Vector<E> {
 ...
 public Object push(E e){
 addElement(e);
 return e;
 }
...

3. To override super class methods in subclass with same signatures
• e.g., the HashMap subclass overrides AbstractMap super class methods
public abstract class
 AbstractMap<K,V> ...
 public abstract
 Set<Entry<K,V>> entrySet();
 public V put(K key, V value)
 { ... }
 ...
public HashMap<K,V> extends
 AbstractMap<K,V> ...
public Set<Entry<K,V>>
 entrySet() { ... }
 public V put(K key, V value)
 { ... }
 ...


Types of inheritance. There are five types of inheritance:

1. Single Inheritance
    In single inheritance, a single subclass extends from a single superclass.
    For example, Class A inherits from class B.

2. Multilevel Inheritance
    In multilevel inheritance, a subclass extends from a superclass and then the same subclass acts as a superclass for another class. 
    For example, Class B inherits from class A and class C inherits from class B.

3. Hierarchical Inheritance
    In hierarchical inheritance, multiple subclasses extend from a single superclass.
    For example, Both classes B and C inherit from the single class A.

4. Multiple Inheritance
    In multiple inheritance, a single subclass extends from multiple superclasses. 
    For example, Class C inherits from both classes A and B.
    Note: Java doesn't support multiple inheritance. However, we can achieve multiple inheritance using interfaces. To learn more, visit Java implements multiple inheritance.

5. Hybrid Inheritance
    Hybrid inheritance is a combination of two or more types of inheritance. For example, Class B and C inherit from a single class A and class D inherits from both the class B and C.
*/

class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

// inherit from Animal
class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rohu";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}