import java.util.Scanner;

public class Q13 {

    public static void printTable(int n) {
        System.out.println();
        for (int i = 1; i < 11; i++) {
            // System.out.println(n + " X " + i + " = " + (n * i));
            System.out.println(String.format("%02d X %02d = %02d", n, i, (n * i)));

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number to View Table: ");

        int n = scan.nextInt();

        printTable(n);

    }

}
