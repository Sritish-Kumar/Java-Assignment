
//import java.util.Arrays;
import java.util.Scanner;

public class Q8_2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rc = new int[2];
        System.out.print("Enter number of rows and column: ");
        for (int i = 0; i < rc.length; i++) {
            rc[i] = scan.nextInt();
        }

        System.out.println(" - Enter the elements of the array - ");

        int[][] arr = new int[rc[0]][rc[1]];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }

        }
        // System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
                sum += is2;

            }
            System.out.println();

        }
        System.out.println("Sum is: " + sum);
        scan.close();

    }
}
