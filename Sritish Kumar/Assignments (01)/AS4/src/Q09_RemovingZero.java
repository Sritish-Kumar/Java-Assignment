import java.util.Scanner;

public class Q09_RemovingZero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int n1 = 0;
        int p = 1;
        while (n > 0) {
            if (n % 10 == 0) { // IF ZERO DO NOTHING
                n = n / 10;
                continue;
            }
            n1 = n1 + p * (n % 10);
            p *= 10;
            n = n / 10;
        }
        System.out.println("The number after removing zeros: " + n1);
        scan.close();

    }
}
