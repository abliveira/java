/*
Referências:
    https://www.programiz.com/java-programming/string

Note that Char (Character) also have their own class with own methods

Java Strings are Immutable
In Java, strings are immutable. This means, once we create a string, we cannot change that string using the methods. But you can reassing using =.

Note: Strings in Java are not primitive types (like int, char, etc). 
Instead, all strings are objects of a predefined class named String.
And, all string variables are instances of the String class.

Methods of Java String
Besides those mentioned above, there are various string methods present in Java. Here are some of those methods:

contains()	checks whether the string contains a substring
substring()	returns the substring of the string
join()	join the given strings using the delimiter
replace()	replaces the specified old character with the specified new character
replaceAll()	replaces all substrings matching the regex pattern
replaceFirst()	replace the first matching substring
charAt()	returns the character present in the specified location
getBytes()	converts the string to an array of bytes
indexOf()	returns the position of the specified character in the string
compareTo()	compares two strings in the dictionary order
compareToIgnoreCase()	compares two strings ignoring case differences
trim()	removes any leading and trailing whitespaces
format()	returns a formatted string
split()	breaks the string into an array of strings
toLowerCase()	converts the string to lowercase
toUpperCase()	converts the string to uppercase
valueOf()	returns the string representation of the specified argument
toCharArray()	converts the string to a char array
matches()	checks whether the string matches the given regex
startsWith()	checks if the string begins with the given string
endsWith()	checks if the string ends with the given string
isEmpty()	checks whether a string is empty of not
intern() 	returns the canonical representation of the string
contentEquals()	checks whether the string is equal to charSequence
hashCode()	returns a hash code for the string
subSequence()	returns a subsequence from the string

*/


class Main {
  public static void main(String[] args) {

    // create a string
    String greet = "Hello! World";
    System.out.println("String: " + greet);

    // get the length of greet
    int length = greet.length();
    System.out.println("Length: " + length);


    // create a string using the new keyword
    String name = new String("Java String");


    // In Java, strings are immutable. This means, once we create a string, we cannot change that string.
    // To understand it more deeply, consider an example:
    
    // create a string
    String example = "Hello! ";
    // Here, we have created a string variable named example. The variable holds the string "Hello! ".

    // Now suppose we want to change the string.
    // add another string "World"
    // to the previous tring example
    example = example.concat(" World");
    // Here, we are using the concat() method to add another string World to the previous string.
    // It looks like we are able to change the value of the previous string. However, this is not true.
    
    // Let's see what has happened here, JVM takes the first string "Hello! " creates a new string by adding "World" to the first string
    // assign the new string "Hello! World" to the example variable the first string "Hello! " remains unchanged

    System.out.println(example);  // print Java String

    // create first string
    String first = "Java ";
    System.out.println("First String: " + first);

    // create second
    String second = "Programming";
    System.out.println("Second String: " + second);

    // join two strings
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);


    // create 3 strings
    String str1 = "java programming";
    String str2 = "java programming";
    String str3 = "python programming";

    // compare str1 and str2 strings
    boolean result1 = str1.equals(str2);
    System.out.println("Strings str1 and str2 are equal: " + result1);

    // compare first and str3 strings
    boolean result2 = first.equals(str3);
    System.out.println("Strings first and str3 are equal: " + result2);
  }
}