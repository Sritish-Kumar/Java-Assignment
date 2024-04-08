import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter your Lucky Number: ");
            int num = scan.nextInt();

            if (num < 0) {
                throw new NumberFormatException("Illegal luck Number");
            }
            System.out.print("Your Luck Number:" + num);

        } catch (Exception e) {
            System.out.println("!! You can only choose +ve numbers !!");
        } finally {
            scan.close();
        }

    }

}

// OUTPUTS
// Enter your Lucky Number: -5
// !! You can only choose +ve numbers !!
// Enter your Lucky Number: 69
// Your Luck Number:69
