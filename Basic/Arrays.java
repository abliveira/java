/*
Referências:
    https://www.programiz.com/java-programming/arrays
    https://www.programiz.com/java-programming/enhanced-for-loop

*/

class Main {

    public static void main(String[] args) {

        // declare an array
        double[] arr1;
        // allocate memory
        arr1 = new double[10];

        double[] arr2 = new double[10];

        //declare and initialize and array
        int[] arr3 = {12, 4, 5, 2, 5};

        // declare an array
        int[] arr4 = new int[3];
        // initialize array
        arr4[0] = 12;
        arr4[1] = 4;
        arr4[2] = 5;

        for(int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        // Using for-each loop
        // In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.
        for(int a : arr4) {
            System.out.println(a);
        }

    }
}