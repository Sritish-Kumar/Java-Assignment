import java.util.Arrays;
import java.util.Scanner;

public class Q7_Occurence {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    static int max_second = Integer.MIN_VALUE;
    static int min_second = Integer.MAX_VALUE;

    static int max_c = 1;
    static int min_c = 1;

    static void maxmin(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max_second = max;
                max = arr[i];
                max_c = 1;
                continue;
            } else if (max == arr[i]) {
                max_c++;

            } else if (max_second < arr[i]) {
                max_second = arr[i];

            }

            if (min > arr[i]) {
                min_second = min;
                min = arr[i];
                min_c = 1;
                continue;

            } else if (min == arr[i]) {
                min_c++;

            } else if (min_second > arr[i]) {
                min_second = arr[i];

            }

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();

        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        maxmin(arr);
        System.out.println("MAX: " + max + " OCCURENCE: " + max_c + " SECOND MAX: " + max_second);
        System.out.println("MIN: " + min + " OCCURENCE: " + min_c + " SECOND MIN: " + min_second);

    }
}
