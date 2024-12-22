import java.util.Scanner;

public class Q15 {

    public static double getSeriesSum(int n) {
        // System.out.println(n);
        if (n == 1) {
            return 1.0;
        }

        return (1.0 / n) + getSeriesSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int num = scan.nextInt();

        System.out.println(getSeriesSum(num));
    }
}
