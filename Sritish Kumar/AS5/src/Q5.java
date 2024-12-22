
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num: ");
        String num = scan.next();

        Integer num_converted = Integer.valueOf(num);
        System.out.println("Converdted Num: " + num_converted);
    }
}
