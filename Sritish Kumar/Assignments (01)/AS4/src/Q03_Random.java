import java.util.Scanner;

public class Q03_Random {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        int sum = 0;
        System.out.print("Random numbers generated are: ");
        do {
            int random = 1 + (int) (n * Math.random());
            System.out.print(random + " ");
            sum += random;
            i++;

        } while (i <= n);
        System.out.println();
        System.out.println("Average of " + n + " random numerbs are " + (sum / (float) n));
        scan.close();
    }
}
