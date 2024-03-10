
import java.util.Scanner;

public class SequenceOf3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt();
        System.out.println("The sequence is: ");
        int a = 0, b = 1, c = 1;
        System.out.print(a + " " + b + " " + c + " ");

        while (n > 3) {
            int temp = a + b + c;
            System.out.print(temp + " ");
            a = b;
            b = c;
            c = temp;
            n--;
        }
    }
}
