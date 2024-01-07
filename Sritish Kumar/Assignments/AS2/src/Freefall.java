
import java.util.Scanner;

public class Freefall {

	final static float g = 32.174f;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the time in seconds: ");
		float t = scan.nextFloat();
		float d = (float) (1.0 / 2 * g * Math.pow(t, 2));
		System.out.println("Distance Travelled " + d);
		scan.close();

	}

}
