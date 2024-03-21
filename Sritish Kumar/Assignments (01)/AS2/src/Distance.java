
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float dist = scan.nextFloat();
		int meters = 1000;
		float feet = 3280.8399f;
		float inch = 39370.0787f;
		int cm = 1000000;

		System.out.println(dist + " km is " + dist * meters + " meters");
		System.out.println(dist + " km is " + dist * feet + " feet");
		System.out.println(dist + " km is " + dist * inch + " inch");
		System.out.println(dist + " km is " + dist * cm + " centimeters");
		scan.close();

	}

}
