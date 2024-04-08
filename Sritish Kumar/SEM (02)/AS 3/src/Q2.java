import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ARRAY SET TO 3
        System.out.println("Assign 3 of your lucky color");
        String[] colors = new String[3];
        int index;
        for (int i = 0; i < colors.length; i++) {

            try {
                System.out.print("Enter index: ");
                index = scan.nextInt();
                System.out.print("Enter element: ");
                String color = scan.next();
                colors[index] = color;

            } catch (InputMismatchException e) {
                System.out.println("\nILLEGAL INDEX");
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nINDEX OUT OF BOUND");
                break;
            }
        }
        System.out.println(Arrays.toString(colors));
        scan.close();
    }
}

// OUTPUTS
// Assign 3 of your lucky color
// Enter index: 0
// Enter element: Red
// Enter index: 2
// Enter element: Green
// Enter index: 50
// Enter element: Orange

// INDEX OUT OF BOUND
// [Red, null, Green]
