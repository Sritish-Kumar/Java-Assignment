package Rev;

import java.util.Scanner;

public class MagicNum {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = scan.nextInt();
        scan.close();
        boolean r = true;
        while (r) {
            if (digitSum(n) == 1) {
                System.out.println("It is a magic number");
                r = false;
            } else if ((digitSum(n) / 10) > 0) {
                n = digitSum(n);
                digitSum(n);
                continue;
            } else if ((digitSum(n) / 10) / 10 == 0) {
                System.out.println("Not a magic number");
                r = false;
            }
        }

    }

}
