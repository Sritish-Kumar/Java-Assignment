
import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a no. b/w (0 to 1000): ");
		int n = scan.nextInt();
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			// System.out.println("sum"+n%10);
			n = n / 10;
			// System.out.println("n"+n);

		}
		System.out.println("Sum of digits is " + sum);
		scan.close();

	}

}
