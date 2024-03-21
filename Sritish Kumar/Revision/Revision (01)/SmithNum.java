package Rev;

import java.util.Arrays;
import java.util.Scanner;

public class SmithNum {

    static int[] fact = new int[20];
    static int[] primeFact = new int[10];
    static int num;

    static boolean isPrime(int i) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 10) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static void factorials(int n) {
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    fact[c] = i;
                    c++;

                }

            }

        }

    }

    // static void factorialsCheck() {
    // boolean r = true;
    // int p = 1;
    // int n = num;
    // int c = 0;
    // // to be continued;

    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scan.nextInt();
        scan.close();
        System.out.println("Digit sum: " + sum(num));
        factorials(num);
        System.out.println(Arrays.toString(fact));

    }
}
