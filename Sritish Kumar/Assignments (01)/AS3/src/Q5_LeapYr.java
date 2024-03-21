import java.util.Scanner;

public class Q5_LeapYr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yr = scan.nextInt();
        scan.close();

        boolean leap = false;

        if (yr % 4 == 0) {
            if (yr % 100 != 0) {
                leap = true;
            } else { // div by 100
                if (yr % 400 == 0) { // has to be div by 400
                    leap = true;

                }
            }

        }
        if (leap == true) {
            System.out.println("It is a leap yr");
        } else
            System.out.println("Not a leap yr");

    }
}
