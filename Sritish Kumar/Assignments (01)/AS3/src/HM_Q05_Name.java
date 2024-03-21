import java.util.Scanner;

public class HM_Q05_Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is you gender (M or F): ");
        String gender = scan.nextLine().toUpperCase();
        System.out.print("First name: ");
        String fname = scan.nextLine();
        System.out.print("Last name: ");
        String lname = scan.nextLine();
        System.out.print("Age: ");
        int age = scan.nextInt();
        scan.nextLine();

        String dis = "";

        if (gender.equals("F") && age >= 20) {

            System.out.print("Are you married " + fname + " (y/n) ");
            String mcheck = scan.nextLine().toLowerCase();
            if (mcheck.equals("y")) {
                dis = "Mrs.";
            } else if (mcheck.equals("n")) {
                dis = "Ms.";
            }

        } else if (gender.equals("M") && age >= 20) {
            dis = "Mr.";

        }
        System.out.println("Then i shall call you " + dis + " " + fname + " " + lname);
        scan.close();
    }
}
