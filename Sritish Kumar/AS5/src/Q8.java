import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num: ");
        String flag = scan.next();

        Boolean num_converted = Boolean.valueOf(flag);
        System.out.println("Converdted Num: " + num_converted);
    }
}
