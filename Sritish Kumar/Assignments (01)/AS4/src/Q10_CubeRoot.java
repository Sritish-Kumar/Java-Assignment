import java.util.Scanner;

/**
 * Q10_CubeRoot
 */
public class Q10_CubeRoot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int cube = 1;
        while (true) {
            if (cube >= num) {
                break;
            }
            cube = cube * 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + num + " is " + cube / 3);
        scan.close();
    }
}