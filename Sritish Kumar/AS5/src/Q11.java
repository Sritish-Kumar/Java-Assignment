import java.util.Scanner;

public class Q11 {

    public static double doubleGet(String str) {
        return Double.valueOf(str).doubleValue();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String inp = scan.next();
        System.out.println(inp);

        System.out.println("Value: " + doubleGet(inp));
    }
}
