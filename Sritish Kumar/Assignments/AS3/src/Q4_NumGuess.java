import java.util.Scanner;

public class Q4_NumGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int comp = 1 + (int) (9 * Math.random());

        int user = scan.nextInt();

        if (user == comp) {
            System.out.println("You got it right");

        } else if (user == comp + 1 || user == comp - 1) {
            System.out.println("Almost got it");

        } else
            System.out.println("You got it wrong");
        System.out.println(comp);
        scan.close();
    }
}
