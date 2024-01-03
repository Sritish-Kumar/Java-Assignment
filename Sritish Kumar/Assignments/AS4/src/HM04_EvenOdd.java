import java.util.Scanner;

public class HM04_EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("For input, N =  ");
        int n = scan.nextInt();
        int even = 0;
        int odd = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even += i;

            } else
                odd *= i;
        }
        System.out.println("Sum of all even numbers = " + even);
        System.out.println("Product of all odd numbers = " + odd);
        scan.close();
    }
}
