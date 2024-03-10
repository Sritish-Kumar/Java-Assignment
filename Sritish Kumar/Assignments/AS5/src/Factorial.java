import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = ip.nextInt();
        System.out.print("Enter the value of n: ");
        int n = ip.nextInt();
        for (int i = m; i <= n; i++) {
            long fac = 1;
            for (int j = 2; j <= i; j++)
                fac = fac * j;
            System.out.println("Factorial of " + i + " is: " + fac);
        }
    }
}
