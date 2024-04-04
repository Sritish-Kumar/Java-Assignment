import java.util.Scanner;

class SquaredN {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / (i * i);
        }

        System.out.println("The sum of the series is: " + (float) sum);
    }
}
