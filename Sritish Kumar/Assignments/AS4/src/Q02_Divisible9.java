import java.util.Scanner;

/**
 * Q02_Divisible9
 */
public class Q02_Divisible9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scan.nextInt();
        int n1 = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
        }
        if (sum % 9 == 0) {
            System.out.println("The number " + n1 + " is divisible by 9");
        } else
            System.out.println("The number " + n1 + " is not divisible by 9");
        scan.close();

    }
}