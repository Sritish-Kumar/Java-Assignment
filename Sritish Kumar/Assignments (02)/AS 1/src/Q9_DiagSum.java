import java.util.Scanner;

public class Q9_DiagSum {

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum += m[i][j];

                }

            }

        }

        return sum;
    }

    static void display(double[][] arr) {
        for (double[] ds : arr) {
            for (double ds2 : ds) {
                System.out.println(ds2 + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] arr = new double[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();

            }

        }
        display(arr);
        System.out.println("Sum of diagonal elements: " + sumMajorDiagonal(arr));
        scan.close();
    }
}
