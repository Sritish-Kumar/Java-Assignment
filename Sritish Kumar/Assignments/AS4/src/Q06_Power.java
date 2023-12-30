import java.util.Scanner;

public class Q06_Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the power: ");
        int pow = scan.nextInt();
        int power = 1;

        for (int i = 0; i < pow; i++) {
            power *= base;

        }
        System.out.println(base + " to the power " + pow + " is: " + power);
        scan.close();
    }
}
