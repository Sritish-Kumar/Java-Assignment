// A spy number is a number where the sum of its digits is equal to the product of its digits. ​

import java.util.Scanner;

public class Q3_SpyNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int sum = 0;
        int prod = 1;

        while (n1 > 0) {
            sum += (n1 % 10);
            prod *= (n1 % 10);
            n1 /= 10;

        }
        System.out.println(sum + " " + prod);
        if (sum == prod) {
            System.out.println("It is a Spy Number");

        } else {
            System.out.println("Not a Spy number");
        }
        scan.close();

    }

}
