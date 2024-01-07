
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enetr basic salary: ");
		float sal = scan.nextInt();
		float da = (float) (0.4 * sal);
		float hra = (float) (0.2 * sal);

		System.out.println("DA is " + da);
		System.out.println("HRA is " + hra);
		System.out.println("Gross salary is " + (sal + da + hra));
		scan.close();

	}

}
