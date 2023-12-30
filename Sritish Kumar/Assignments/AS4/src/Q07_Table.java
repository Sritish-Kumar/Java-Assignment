import java.util.Scanner;

public class Q07_Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find the table : ");
        int num = scan.nextInt();
        System.out.println("The table of " + num + " is below");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

        }
        scan.close();

    }
}
