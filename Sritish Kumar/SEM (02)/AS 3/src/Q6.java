public class Q6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        Integer[] arr = { 1, 20, 1, 2, 1, 3, 4, 5 };
        System.out.print("'1' is present: ");
        System.out.println(count(arr, 1));

    }
}

// using Generics to count the occurrence of an element in an array of
// any type. The signature of count method is given below.
// public static <T> int count(T[] array, T item)
