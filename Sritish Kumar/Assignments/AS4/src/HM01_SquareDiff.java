import java.util.Scanner;

public class HM01_SquareDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int sq = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sq = sq + i * i;
            sum += i;
        }
        System.out.print("The diff. between the sum of squares and square of sum is : ");
        System.out.print((sum * sum) - sq);
        scan.close();
    }
}
