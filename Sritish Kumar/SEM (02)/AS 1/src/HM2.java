import java.util.Scanner;

public class HM2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("No. of lines: ");
        String[] lines = new String[scan.nextInt()];
        scan.nextLine();
        System.out.println("Enter the lines: ");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scan.nextLine();

        }
        System.out.println("Reversed order: ");

        for (int i = lines.length - 1; i >= 0; i--) {

            System.out.println(lines[i]);

        }
    }

}
