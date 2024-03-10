
import java.util.Scanner;

public class Temp_Convert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a degree in Fahrenheit: ");
		double far = scan.nextDouble();
		float cel = (float) ((far - 32) * 5.0 / 9);
		System.out.println(far + " Fahrenheit is " + cel);
		scan.close();
	}

}
