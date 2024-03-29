import java.util.Scanner;

public class Q6_IsOdd {

    public static boolean IsOdd(int n) {
        return ((int) (n & 1) == 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check odd : ");

        System.out.println(IsOdd(scan.nextInt()));

        scan.close();

    }
}
