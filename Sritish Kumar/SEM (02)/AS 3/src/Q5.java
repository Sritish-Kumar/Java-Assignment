public class Q5 {

    public static <E> void printArray(E[] inputArray) {
        System.out.print("[ ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(" " + inputArray[i] + ", ");

        }
        System.out.println(" ]");

    }

    public static void main(String[] args) {
        // has to use wrapper class to pass in generics
        Integer[] arr = { 1, 2, 3, 4, 5, 6 };
        String[] names = { "Jagdish", "is", "Gay" };
        printArray(arr);
        printArray(names);

    }
}

// Write a java program to print an array of different type using a single
// Generic method. The
// signature of printArray method is given below.
// public static < E > void printArray( E[] inputArray)