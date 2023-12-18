import java.util.Scanner;

public class Q3_InscDesc_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && b > c) {
            System.out.println("Desc");
        } else if (a < b && b < c) {
            System.out.println("Insc");

        } else
            System.out.println("Neither");
        scan.close();
    }
}
