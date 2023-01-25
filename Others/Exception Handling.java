/*
Referências:
    https://www.programiz.com/java-programming/exceptions

An exception is an unexpected event that occurs during program execution. It affects the flow of the program instructions which can cause the program to terminate abnormally.

An exception can occur for many reasons. Some of them are:
- Invalid user input
- Device failure
- Loss of network connection
- Physical limitations (out of disk memory)
- Code errors
- Opening an unavailable file
- Java Exception hierarchy

Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. Errors are usually beyond the control of the programmer and we should not try to handle errors.

Exceptions can be caught and handled by the program. When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception such as the name and description of the exception and state of the program when the exception occurred.

Java Exception Types
The exception hierarchy also has two branches: RuntimeException and IOException.

A runtime exception happens due to a programming error. They are also known as unchecked exceptions. These exceptions are not checked at compile-time but run-time. Some of the common runtime exceptions are:
- Improper use of an API - IllegalArgumentException
- Null pointer access (missing the initialization of a variable) - NullPointerException
- Out-of-bounds array access - ArrayIndexOutOfBoundsException
- Dividing a number by 0 - ArithmeticException

An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions. Some of the examples of checked exceptions are:
- Trying to open a file that doesn’t exist results in FileNotFoundException
T- rying to read past the end of a file

Keyword	Description
try	The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.
catch	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
finally	The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.
throw	The "throw" keyword is used to throw an exception.
throws	The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.
*/

import java.io.*; // For Example 6


// Here, we have placed the code that might generate an exception inside the try block. Every try block is followed by a catch block.

// When an exception occurs, it is caught by the catch block. The catch block cannot be used without the try block.

class Example1 {
  Example1() {

    try {

      // code that generate exception
      int divideByZero = 5 / 0;
      System.out.println("Rest of code in try block");
    }
    
    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
  }
}

// In the example, we are trying to divide a number by 0. Here, this code generates an exception.

// To handle the exception, we have put the code, 5 / 0 inside the try block. Now when an exception occurs, the rest of the code inside the try block is skipped.

// The catch block catches the exception and statements inside the catch block is executed.

// If none of the statements in the try block generates an exception, the catch block is skipped.



// Multiple Catch blocks
// For each try block, there can be zero or more catch blocks. Multiple catch blocks allow us to handle each exception differently.

// The argument type of each catch block indicates the type of exception that can be handled by it. For example,

class ListOfNumbers {
  public int[] arr = new int[10];

  public void writeList() {

    try {
      arr[10] = 11;
    }
    
    catch (NumberFormatException e1) {
      System.out.println("NumberFormatException => " + e1.getMessage());
    }
    
    catch (IndexOutOfBoundsException e2) {
      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
    }

  }
}

class Example2 {
  Example2() {
    ListOfNumbers list = new ListOfNumbers();
    list.writeList();
  }
}

// IndexOutOfBoundsException => Index 10 out of bounds for length 10
// In this example, we have created an integer array named arr of size 10.

// Since the array index starts from 0, the last element of the array is at arr[9]. Notice the statement,

// arr[10] = 11;
// Here, we are trying to assign a value to the index 10. Hence, IndexOutOfBoundException occurs.

// When an exception occurs in the try block,

// The exception is thrown to the first catch block. The first catch block does not handle an IndexOutOfBoundsException, so it is passed to the next catch block.
// The second catch block in the above example is the appropriate exception handler because it handles an IndexOutOfBoundsException. Hence, it is executed.



// In Java, the finally block is always executed no matter whether there is an exception or not.

// The finally block is optional. And, for each try block, there can be only one finally block.

// If an exception occurs, the finally block is executed after the try...catch block. Otherwise, it is executed after the try block. For each try block, there can be only one finally block.

class Example3 {
  Example3() {
    try {
      // code that generates exception
      int divideByZero = 5 / 0;
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    
    finally {
      System.out.println("This is the finally block");
    }
  }
}

// In the above example, we are dividing a number by 0 inside the try block. Here, this code generates an ArithmeticException.

// The exception is caught by the catch block. And, then the finally block is executed.

// Note: It is a good practice to use the finally block. It is because it can include important cleanup codes like,

// code that might be accidentally skipped by return, continue or break
// closing a file or connection



// Java try...catch...finally block
// In Java, we can also use the finally block after the try...catch block. For example,

// import java.io.*;

class ListOfNumbers2 {

  // create an integer array
  private int[] list = {5, 6, 8, 9, 2};

  // method to write data from array to a fila
  public void writeList() {
    PrintWriter out = null;

    try {
      System.out.println("Entering try statement");

      // creating a new file OutputFile.txt
      out = new PrintWriter(new FileWriter("OutputFile.txt"));

      // writing values from list array to Output.txt
      for (int i = 0; i < 7; i++) {
        out.println("Value at: " + i + " = " + list[i]);
      }
    }
    
    catch (Exception e) {
      System.out.println("Exception => " + e.getMessage());
    }
    
    finally {
      // checking if PrintWriter has been opened
      if (out != null) {
        System.out.println("Closing PrintWriter");
        // close PrintWriter
        out.close();
      }
      
      else {
        System.out.println("PrintWriter not open");
      }
    }

  }
}

class Example4 {
  Example4() {
    ListOfNumbers2 list = new ListOfNumbers2();
    list.writeList();
  }
}

// Entering try statement
// Exception => Index 5 out of bounds for length 5
// Closing PrintWriter
// In the above example, we have created an array named list and a file named output.txt. Here, we are trying to read data from the array and storing to the file.

// Notice the code,

// for (int i = 0; i < 7; i++) {
//   out.println("Value at: " + i + " = " + list[i]);
// }
// Here, the size of the array is 5 and the last element of the array is at list[4]. However, we are trying to access elements at a[5] and a[6].

// Hence, the code generates an exception that is caught by the catch block.

// Since the finally block is always executed, we have included code to close the PrintWriter inside the finally block.

// It is a good practice to use finally block to include important cleanup code like closing a file or connection.

// Note: There are some cases when a finally block does not execute:

// Use of System.exit() method
// An exception occurs in the finally block
// The death of a thread




// Java throw and throws keyword
// The Java throw keyword is used to explicitly throw a single exception.

// When we throw an exception, the flow of the program moves from the try block to the catch block.

// Example: Exception handling using Java throw
class Example5 {
  Example5() {

    // throw an exception
    throw new ArithmeticException("Trying to divide by 0");
  }
}

// In the above example, we are explicitly throwing the ArithmeticException using the throw keyword.



// Similarly, the throws keyword is used to declare the type of exceptions that might occur within the method. It is used in the method declaration.

// Example: Java throws keyword

class Example6 {
    
  // declareing the type of exception
  public static void findFile() throws IOException {

    // code that may generate IOException
    File newFile = new File("test.txt");
    FileInputStream stream = new FileInputStream(newFile);
  }

  Example6() {

    try {
      findFile();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
// When we run this program, if the file test.txt does not exist, FileInputStream throws a FileNotFoundException which extends the IOException class.

// The findFile() method specifies that an IOException can be thrown. The main() method calls this method and handles the exception if it is thrown.

// If a method does not handle exceptions, the type of exceptions that may occur within it must be specified in the throws clause.



// Only runs the examples contained in their classes
class Main {

    public static void main(String[] args) {

        // Runs example 1
        Example1 obj1 = new Example1();
        System.out.println();

        // Runs example 2
        Example2 obj2 = new Example2();
        System.out.println();

        // Runs example 3
        Example3 obj3 = new Example3();
        System.out.println();

        // Runs example 4
        Example64 obj4 = new Example4();
        System.out.println();

        // Runs example 6
        Example6 obj6 = new Example6();
        System.out.println();
        
        // Runs example 5. Finishes program execution, so for this example we run it last
        Example5 obj5 = new Example5();
        System.out.println();
    }
}