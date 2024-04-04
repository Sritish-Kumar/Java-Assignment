import java.util.Scanner;

public class TwistedPrime {
    static boolean r = true;

    static void prime(int n) {
        if (n == 1) {
            r = false;
        }

        for (int i = 2; i < n & r == true; i++) {
            if (n % i == 0) {
                r = false;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scan.nextInt();
        int n1 = 0;
        // prime check of original
        prime(n);

        if (r == true) {
            // reverse
            while (n > 0) {
                n1 = (n1 * 10) + (n % 10);
                n = n / 10;
            }
            // prime check of reverse number
            prime(n1);

            if (r == true)
                System.out.println("It is twisted prime");
            else
                System.out.println("It is not twisted prime");
        } else
            System.out.println("Entered number is not prime");
        scan.close();

    }
}
