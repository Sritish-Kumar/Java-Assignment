import java.util.Scanner;

public class HM_Q02_FindDay {

    static String getDay(int i) {
        switch (i) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";

            default:
                return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter todays day: ");
        int today = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int pass = scan.nextInt();

        System.out.println("Today is " + getDay(today));
        System.out.println("Future day is " + getDay(today + pass % 7));
        scan.close();
    }

}
