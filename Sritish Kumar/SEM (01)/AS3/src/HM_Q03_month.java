import java.util.Scanner;

public class HM_Q03_month {
    static int i;

    static String getMonth() {
        // here switch case can be used in place of an array.
        // we can acess the values at the index forom case values.
        switch (i) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "March";
            case 4:
                return "april";
            case 5:
                return "may";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "Aug";
            case 9:
                return "Sept";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "December";

            default:
                return "Not a Valid Month";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        i = 1 + (int) ((12 - 1 + 1) * Math.random());
        System.out.println("Generated Month is: " + i + " " + getMonth());
        scan.close();

    }
}
