import java.util.Scanner;

public class Q08_NumGuess {
    public static void main(String[] args) {
        boolean r = true;
        Scanner scan = new Scanner(System.in);
        while (r == true) {
            int comp = 1 + (int) (10 * Math.random());
            System.out.println("Computer Guess: " + comp);
            System.out.print("Enter your Guess: ");
            int user = scan.nextInt();

            if (comp == user) {
                r = false;
            } else if (user > comp) {
                System.out.println("Too High, Try Again");
            } else
                System.out.println("Too Low, Try Again");
            System.out.println();

        }
        System.out.println("Good Guess");
        scan.close();
    }
}
