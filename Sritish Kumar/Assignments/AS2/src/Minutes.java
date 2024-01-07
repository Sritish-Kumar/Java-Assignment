
import java.util.Scanner;

public class Minutes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long min = scan.nextLong();
		long yr = min / (365 * 24 * 60);
		min = min % (365 * 24 * 60);
		long days = min / (24 * 60);
		System.out.println("Years: " + yr + " Days: " + days);
		scan.close();
	}

}
