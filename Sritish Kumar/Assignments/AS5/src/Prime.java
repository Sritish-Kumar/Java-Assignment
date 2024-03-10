import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n) {
        boolean r = true;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                r = false;
                break;
            }

        }

        return r;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number 1: ");
        int n1 = scan.nextInt();

        System.out.print("Enter the Number 2: ");
        int n2 = scan.nextInt();

        for (int i = n1; i <= n2; i++) {
            // System.out.println(i + "Is prime : " + isPrime(i));
            if (isPrime(i)) {
                System.out.print(i + " ");

            }

        }

    }
}