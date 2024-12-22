import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        Arrays.sort(array);

        int kthSmallest = array[k - 1];
        int kthLargest = array[n - k];

        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        System.out.println("The " + k + "th largest element is: " + kthLargest);

        scanner.close();
    }
}