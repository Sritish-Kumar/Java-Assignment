public class Q17 {
    public static void main(String[] args) {
        int[] array = { 5, 3, 9, 1, 6, 7, 2, 8, 4 };

        int min = findMin(array);
        int max = findMax(array);

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}