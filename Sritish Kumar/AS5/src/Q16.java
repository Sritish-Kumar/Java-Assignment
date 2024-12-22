import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    static int largest = Integer.MIN_VALUE;
    static int smallest = Integer.MAX_VALUE;

    static int[] getInputs() {
        int[] arr = new int[2];
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to Enter more number: ");
            String check = scan.next();

            if (check.equals("no")) {
                break;
            }

            int num = scan.nextInt();
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        arr[0] = largest;
        arr[1] = smallest;

        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getInputs()));

    }

}
