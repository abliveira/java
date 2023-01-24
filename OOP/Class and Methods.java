/*
Referências:
    https://www.programiz.com/java-programming/methods

This is the simple syntax of declaring a method. However, the complete syntax of declaring a method is

modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
  // method body
}
modifier - It defines access types whether the method is public, private, and so on. To learn more, visit Java Access Specifier.
static - If we use the static keyword, it can be accessed without creating objects.
returnType - It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value. If it does not return any, use void.

For example, the sqrt() method of standard Math class is static. Hence, we can directly call Math.sqrt() without creating an instance of Math class.
parameter1/parameter2 - These are values passed to a method. We can pass any number of arguments to a method.


Accessor Methods
In Java, accessor methods return the value of a private variable. This gives other classes access to that value stored in that variable. without having direct access to the variable itself.

Accessor methods take no parameters and have a return type that matches the type of the variable they are accessing.

public class CheckingAccount{
  private int balance;
  
  //An accessor method
  public int getBalance(){
    return this.balance;
  }
}
Mutator Methods
In Java, mutator methods reset the value of a private variable. This gives other classes the ability to modify the value stored in that variable without having direct access to the variable itself.

Mutator methods take one parameter whose type matches the type of the variable it is modifying. Mutator methods usually don’t return anything.

public class CheckingAccount{
  private int balance;
  
  //A mutator method
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
}

*/

class Main {

  // create a method of Main class
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}


