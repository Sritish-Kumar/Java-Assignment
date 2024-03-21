import java.util.Scanner;

public class CarmicalNo {

    static int Divisor(int num) {
        // divisor sum
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                sum += i;

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = scan.nextInt();

        if (n2 == Divisor(n1) && (n1 == Divisor(n2))) {
            System.out.println("It's Amicable Number");
        } else {
            System.out.println("It's Not a Amicable Number");
        }

    }
}