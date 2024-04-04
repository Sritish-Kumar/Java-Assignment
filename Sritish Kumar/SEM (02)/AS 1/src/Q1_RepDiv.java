// Write a Java program that can take a positive integer greater than 2 as input and write out the number of times one must repeatedly divide this number by 2 before getting a value less than 2.

import java.util.Scanner;

public class Q1_RepDiv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n < 2) {
            System.out.print("Enter a Number > 2 : ");
            n = scan.nextInt();
        }
        int c = 0;
        while (n > 2) {
            n /= 2;
            c++;

        }
        System.out.println(c);
        scan.close();

    }

}
