import java.util.Scanner;

public class HM_Q01_RockPaper {

    static String geString(int i) {
        switch (i) {
            case 0:
                return "Scissor(0)";
            case 1:
                return "Rock(1)";
            case 2:
                return "Paper(2)";
            default:
                return "Invalid";

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int comp = (int) (3 * Math.random());
        System.out.print("Enter Scissor(0) Rock(1) Paper(2) : ");
        int user = scan.nextInt();

        if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) {
            System.out.println(" - You won - ");
            System.out.println("Computer: " + geString(comp) + " User: " + geString(user));
        } else if ((user == 0 && comp == 1) || (user == 1 && comp == 2) || (user == 2 && comp == 0)) {
            System.out.println(" - You lost - ");
            System.out.println("Computer: " + geString(comp) + " User: " + geString(user));

        } else if ((user == 0 && comp == 0) || (user == 1 && comp == 1) || (user == 2 && comp == 2)) {
            System.out.println(" - Its a draw - ");
            System.out.println("Computer: " + geString(comp) + " User: " + geString(user));
        } else {
            System.out.println("The input number is " + geString(user));
        }
        scan.close();

    }
}
