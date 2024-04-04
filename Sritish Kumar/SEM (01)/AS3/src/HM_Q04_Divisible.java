import java.util.Scanner;

public class HM_Q04_Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Integer: ");
        int n = scan.nextInt();

        System.out.println("Is " + n + " Divisible by 5 and 6? " + ((n % 5 == 0) && (n % 6 == 0)));
        System.out.println("Is " + n + " Divisible by 5 or 6 ? " + ((n % 5 == 0) || (n % 6 == 0)));
        System.out.println("Is 10 Divisible by 5 or 6, but not both? " + ((n % 5 == 0) ^ (n % 6 == 0)));
        scan.close();
    }
}
