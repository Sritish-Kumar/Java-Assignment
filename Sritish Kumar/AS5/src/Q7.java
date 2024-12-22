import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num: ");
        String num = scan.next();

        Double num_converted = Double.valueOf(num);
        System.out.println("Converdted Num: " + num_converted);

    }
}
