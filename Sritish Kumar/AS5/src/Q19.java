public class Q19 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        reverseArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}