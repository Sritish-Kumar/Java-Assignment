import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integer numbers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Extract the first two digits of the first number
        String firstNumberStr = Integer.toString(firstNumber);
        String firstTwoDigits = firstNumberStr.substring(0, 2);

        // Extract the last two digits of the second number
        String secondNumberStr = Integer.toString(secondNumber);
        String lastTwoDigits = secondNumberStr.substring(secondNumberStr.length() - 2);

        // Create the third number
        String thirdNumberStr = firstTwoDigits + lastTwoDigits;
        int thirdNumber = Integer.parseInt(thirdNumberStr);

        // Output the result
        System.out.println("The third number is: " + thirdNumber);

        scanner.close();
    }
}