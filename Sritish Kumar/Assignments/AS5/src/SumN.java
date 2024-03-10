import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt();
        System.out.println("The series is:");
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(1);
                continue;
            } else
                System.out.print("+(");

            for (int j = 1; j <= i; j++) {
                if (j < i)
                    System.out.print(j + "+");
                else
                    System.out.print(j + ")");
                sum = sum + j;
            }
        }

        System.out.println("\nThe sum of the series is: " + sum);
    }
}
