import java.util.Scanner;

public class Sinx {
    public static void main(String[] args) {
        // Is not right

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the No: ");
        double x = scan.nextDouble();
        float limit = 0.000001F;
        double t = x;
        double sum = 0;
        boolean r = true;
        int fac = 1;

        while (Math.abs(t) > limit) {
            sum += t;
            fac = fac + 2;

            if (r) {
                t = -t * x * x / (fac * (fac - 1));
                System.out.println("True");
            } else {
                t = t * x * x / (fac * (fac - 1));
                System.out.println("False");
            }

            r = !r; // Toggle the sign flag
        }

        System.out.println(sum);
    }
}
