import java.util.Arrays;
import java.util.Scanner;

public class Q9 {

    public static void calculate(String[] inps) {
        String nums = "0123456789";
        System.out.println();
        for (String str : inps) {
            if (nums.contains(str)) {
                int num = Integer.valueOf(str);
                System.out.println();
                System.out.println("Number: " + num);
            } else if (str.contains(".") && str.contains("f")) {
                float f = Float.valueOf(str);
                System.out.println("Float: " + f);
            } else if (str.contains(".") || str.contains("d")) {
                double d = Double.valueOf(str);
                System.out.println("Double: " + d);
            } else if (str.contains("true") || str.contains("flase")) {
                boolean b = Boolean.valueOf(str);
                System.out.println("Boolean: " + b);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the inputs: ");
        String inp = scan.nextLine();

        String[] inps = inp.split(" ");

        System.out.println(Arrays.toString(inps));

        calculate(inps);

    }

}
