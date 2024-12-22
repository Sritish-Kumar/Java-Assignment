import java.util.Scanner;

public class Q12 {
    public static int intGet(String str) {
        return Integer.valueOf(str).intValue();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String inp = scan.next();
        System.out.println(inp);

        System.out.println("Value: " + intGet(inp));
    }

}
