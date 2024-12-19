/*
In Java, we must import the java.util.List package in order to use List.

Methods of List:
The List interface includes all the methods of the Collection interface because Collection is a superinterface of List.

Some commonly used methods of the Collection interface that are also available in the List interface are:

- add() - adds an element to a list
- addAll() - adds all elements of one list to another
- get() - helps to randomly access elements from lists
- iterator() - returns an iterator object that can be used to sequentially access elements of lists
- set() - changes elements of lists
- remove() - removes an element from the list
- removeAll() - removes all the elements from the list
- clear() - removes all the elements from the list (more efficient than removeAll())
- size() - returns the length of the list
- toArray() - converts a list into an array
- contains() - returns true if a list contains a specified element

References:
    https://www.programiz.com/java-programming/list
*/

import java.util.List;
import java.util.ArrayList;

class ListsDemo {
    public static void main(String[] args) {
        // Creating a list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List after adding elements: " + numbers);

        // Add all elements from another list
        List<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(4);
        moreNumbers.add(5);
        numbers.addAll(moreNumbers);
        System.out.println("List after adding all elements from another list: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element at index 2: " + number);

        // Check if the list contains a certain element
        boolean containsNumber = numbers.contains(3);
        System.out.println("List contains 3: " + containsNumber);

        // Change an element of the list
        numbers.set(1, 10);
        System.out.println("List after setting index 1 to 10: " + numbers);

        // Get the size of the list
        int size = numbers.size();
        System.out.println("Size of the list: " + size);

        // Convert the list to an array
        Integer[] numberArray = numbers.toArray(new Integer[0]);
        System.out.print("Array: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Remove an element from the list
        int removedNumber = numbers.remove(1); // Removes element at index 1
        System.out.println("Removed Element at index 1: " + removedNumber);
        System.out.println("List after removing an element: " + numbers);

        // Remove all elements from the list
        numbers.removeAll(moreNumbers);
        System.out.println("List after removing all elements of another list: " + numbers);

        // Clear the list
        numbers.clear();
        System.out.println("List after clearing all elements: " + numbers);

        // Check if the list is empty
        System.out.println("Is the list empty? " + numbers.isEmpty());
    }
}
