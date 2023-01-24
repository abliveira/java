/*
Referências:
    https://www.digitalocean.com/community/tutorials/java-random

Random class is used to generate pseudo-random numbers in java. An instance of this class is thread-safe. The instance of this class is however cryptographically insecure. This class provides various method calls to generate different random data types such as float, double, int.

Random number generation algorithm works on the seed value. If not provided, seed value is created from system nano time.
If two Random instances have same seed value, then they will generate same sequence of random numbers.
Java Random class is thread-safe, however in multithreaded environment it’s advised to use java.util.concurrent.ThreadLocalRandom class.
Random class instances are not suitable for security sensitive applications, better to use java.security.SecureRandom in those cases

Note: To access the methods, you need to create an instance of Random class.

*/
import java.util.Random; //The import statement

class Main {

    public static void main( String args[] ) {

        //Creating an object of Random class
        Random random = new Random();
        //Calling the nextInt() method
        System.out.println("A random int: " + random.nextInt());  
        //Calling the overloaded nextInt() method
        System.out.println("A random int from 0 to 49: "+ random.nextInt(50));
        //Calling the nextDouble() method
        System.out.println("A random double: "+ random.nextDouble()); 
        //Calling the nextFloat() method
        System.out.println("A random float: "+ random.nextFloat());
        //Calling the nextLong() method
        System.out.println("A random long: "+ random.nextLong());  
        System.out.println();

        //initialize two random number generators using same seed
        Random random1 = new Random(100);
        Random random2 = new Random(100);
        
        System.out.println(random1.nextInt());
        System.out.println(random2.nextInt());

    }
}  