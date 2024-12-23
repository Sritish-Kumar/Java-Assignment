import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();

        float epsilon = 1.0f;
        float difference = Math.abs(num1 - num2);

        if (difference < epsilon) {
            System.out.println("The difference between the two numbers is less than epsilon.");
        } else {
            System.out.println("The difference between the two numbers is not less than epsilon.");
        }

        scanner.close();
    }
}