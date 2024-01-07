
import java.util.Scanner;

public class AreaVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		float r = scan.nextFloat();

		float area = (float) (3 * Math.PI * Math.pow(r, 2));
		float volume = (float) (2.0 / 3 * Math.PI * Math.pow(r, 3));

		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
		scan.close();
	}

}
