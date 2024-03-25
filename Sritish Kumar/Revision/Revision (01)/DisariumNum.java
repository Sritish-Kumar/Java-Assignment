package Rev;

import java.util.Scanner;

// Disarium Number: 135 = 1 + 3*3 + 5*5*5 = 135

public class DisariumNum {
    static int num;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = scan.nextInt();
        scan.close();
        int num2 = num;
        int sum = 0;
        int l = Integer.toString(num).length();

        while (num > 0) {
            int temp = 1;
            int digit = num % 10;
            for (int i = l; i > 0; i--) {
                temp *= digit;

            }
            // System.out.println(temp);
            sum += temp;
            temp = 1;
            num /= 10;
            l--;

        }
        System.out.println("It is Disarium Number: " + (sum == num2));

    }

}
