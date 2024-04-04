import java.util.Scanner;

public class HM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers (a, b, c): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } else {
            System.out.println("None of the formulas are satisfied.");
        }

        scanner.close();
    }
}
