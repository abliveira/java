/*
    Formatting values (optional):
    %d   represents integer numbers
    %f   represents floating-point numbers
    %.2f represents floating-point numbers with 2 decimal places
    %b   represents boolean values
    %c   represents characters
    %s   represents strings
*/

class IO {
  public static void main(String[] args) {

        // Concatenated Strings
        Double number = -10.6;
        System.out.println("I am " + "awesome.");
        System.out.println("Number = " + number);

        // Corrected formatting examples
        // Formatted output for strings
        System.out.printf("%s\n%s\n", "Marcela", "Nogueira");

        // Formatting integers
        int num1 = 10;
        int num2 = 30;
        System.out.printf("Sum of variables num1 and num2 = %d\n", (num1 + num2));
        
        // Formatting floating-point numbers
        double pi = 3.14159;
        System.out.printf("Value of Pi (rounded to 2 decimal places) = %.2f\n", pi);

        // Formatting boolean values
        boolean isJavaFun = true;
        System.out.printf("Is Java fun? %b\n", isJavaFun);

        // Formatting characters
        char grade = 'A';
        System.out.printf("Your grade is: %c\n", grade);
  }
}
