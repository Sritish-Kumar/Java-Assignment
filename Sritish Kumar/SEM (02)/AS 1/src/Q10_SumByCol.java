import java.util.Scanner;

public class Q10_SumByCol {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == columnIndex) {
                    sum += m[i][j];

                }

            }

        }
        return sum;
    }

    static void display(double[][] arr) {
        for (double[] ds : arr) {
            for (double ds2 : ds) {
                System.out.print(ds2 + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] arr = new double[3][4];
        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();

            }

        }
        display(arr);
        for (int i = 0; i < 4; i++) {

            System.out.println("Sum at col " + i + " is " + sumColumn(arr, i));

        }
        scan.close();

    }
}
