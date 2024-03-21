import java.util.Scanner;

public class Q04_Gcd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter Numeber 2: ");
        int n2 = scan.nextInt();

        if (n1 % n2 == 0) { // 50%10==0 ---> 10
            System.out.println("GCD: " + n2);

        } else if (n2 % n1 == 0) {
            System.out.println("GCD: " + n1);
        } else {
            int gcd = 1;
            for (int i = 1; i <= Math.min(n1, n2); i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }

            }
            System.out.println("GCD: " + gcd);
        }
        scan.close();
    }

}
