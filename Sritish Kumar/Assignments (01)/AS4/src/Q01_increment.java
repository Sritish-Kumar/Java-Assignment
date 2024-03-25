import java.util.Scanner;

public class Q01_increment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int i = scan.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int n = scan.nextInt();
        System.out.print("Enter the third Number: ");
        int inc = scan.nextInt();

        int sum = 0;

        for (int j = i; j <= n; j = j + inc) {
            System.out.print(j + " ");
            sum += j;

        }
        System.out.println();
        System.out.println("The sum of number displayed is " + sum);
        scan.close();
    }
}
