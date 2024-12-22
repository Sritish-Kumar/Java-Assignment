import java.util.Scanner;

public class Q14 {

    public static int getHCF(int num1, int num2) {
        for (int i = Math.max(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }

        return -1;
    }

    public static int getLCM(int num1, int num2) {
        return ((num1 * num2) / getHCF(num1, num2));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("HCF: " + getHCF(num1, num2));
        System.out.println("LCM: " + getLCM(num1, num2));

    }
}
