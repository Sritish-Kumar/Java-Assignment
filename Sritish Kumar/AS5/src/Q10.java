import java.util.Scanner;

public class Q10 {
    public static void calculate(String op) {
        String[] arr = new String[3];
        if (op.contains("+")) {
            arr = op.split("\\+");
            System.out.println("> " + (Integer.valueOf(arr[0]) + Integer.valueOf(arr[1])));
        } else {
            System.out.println("Invalid Expression");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Expression: ");
        String exp = sc.nextLine().trim();
        System.out.println(exp);

        calculate(exp);

    }

}
