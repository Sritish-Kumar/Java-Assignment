import java.util.Scanner;

public class Q05_PerfectNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scan.nextInt();
        scan.close();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) { // here all the factors of num will be found before num/2
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " Is a Perfect Number");
        } else
            System.out.println(num + " Is not a perfect Number");

    }
}
