import java.util.Scanner;

public class Q9_SecondLargest_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) { // a max
            System.out.println("Max: " + a);
            if (b > c) {
                System.out.println("Second: " + b);
            } else
                System.out.println("Second: " + c);
        } else if (b > a && b > c) { // max b
            System.out.println("Max: " + b);
            if (a > c) {
                System.out.println("Second: " + a);
            } else
                System.out.println("Second: " + c);
        } else if (c > a && c > b) { // max c
            System.out.println("Max: " + c);
            if (a > b) {
                System.out.println("Second: " + a);
            } else
                System.out.println("Second: " + b);
        }
        scan.close();
    }
}
