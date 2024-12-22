import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num: ");
        String num = scan.next();

        Float num_converted = Float.valueOf(num);
        System.out.println("Converdted Num: " + num_converted);
    }
}
