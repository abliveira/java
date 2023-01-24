/*
Referências:
    https://www.geeksforgeeks.org/overriding-equals-method-in-java/

Comparing objects using == can give wrong results. So you can implement a method in your class to make the comparision
*/


// Example 1 - Complex class using ==
class Complex {
	private double re, im;
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
}


// Example 2 - Driver class to test the Complex class using equal
class Complex2 {

	private double re, im;

	public Complex2(double re, double im) {
		this.re = re;
		this.im = im;
	}

	// Overriding equals() to compare two Complex2 objects
	@Override
	public boolean equals(Object o) {

		// If the object is compared with itself then return true
		if (o == this) {
			return true;
		}

		/* Check if o is an instance of Complex2 or not
		"null instanceof [type]" also returns false */
		if (!(o instanceof Complex2)) {
			return false;
		}
		
		// typecast o to Complex2 so that we can compare data members
		Complex2 c = (Complex2) o;
		
		// Compare the data members and return accordingly
		return Double.compare(re, c.re) == 0
				&& Double.compare(im, c.im) == 0;
	}
}



public class Main {

	public static void main(String[] args) {


		// Example 1 - Driver class to test the Complex class using ==

		Complex c1a = new Complex(10, 15);
		Complex c1b = new Complex(10, 15);
		System.out.println("Comparing using == ");
		if (c1a == c1b) {
			System.out.println("Equal \n");
		} else {
			System.out.println("Not Equal \n");
		}
		// The reason for printing “Not Equal” is simple: when we compare c1a and c1b, it is checked whether both c1a and c1b refer to same object or not (object variables are always references in Java). c1a and c1b refer to two different objects, hence the value (c1a == c1b) is false. If we create another reference say c3 like following, then (c1a == c3) will give true.

		// So, how do we check for equality of values inside the objects? All classes in Java inherit from the Object class, directly or indirectly (See point 1 of this). The Object class has some basic methods like clone(), toString(), equals(),.. etc. We can override the equals method in our class to check whether two objects have same data or not. 




		// Example 2 - Driver class to test the Complex class using equals
		Complex2 c2a = new Complex2(10, 15);
		Complex2 c2b = new Complex2(10, 15);
		System.out.println("Comparing equals()");
		if (c2a.equals(c2b)) {
			System.out.println("Equal \n");
		} else {
			System.out.println("Not Equal \n");
		}
		// As a side note, when we override equals(), it is recommended to also override the hashCode() method. If we don’t do so, equal objects may get different hash-values; and hash based collections, including HashMap, HashSet, and Hashtable do not work properly (see this for more details). We will be covering more about hashCode() in a separate post. 
	}
}