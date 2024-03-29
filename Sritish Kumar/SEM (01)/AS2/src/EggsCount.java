
import java.util.Scanner;

public class EggsCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Eggs you have: ");
		int eggs = scan.nextInt();
		final int gross = 144;
		final int dozen = 12;
		System.out.println("You have " + eggs / gross + " Gross Eggs");
		eggs = eggs % gross;
		System.out.println("You have " + eggs / dozen + " Dozens Eggs");
		eggs = eggs % dozen;
		System.out.println("You have " + eggs + " left");
		scan.close();

	}

}
