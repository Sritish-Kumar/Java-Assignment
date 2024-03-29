import java.util.Scanner;

public class Q5_SumOfDigits {

    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scan.nextInt();

        while ((n / 10) != 0) {
            n = sum_Of_Digits(n);

        }
        System.out.println(n);
        scan.close();
    }
}
