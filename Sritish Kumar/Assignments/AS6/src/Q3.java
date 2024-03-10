import java.util.*;

class Q3 {
    public static int reverse(int number) {
        int reversal = 0;
        while (number != 0) {
            reversal = reversal * 10 + number % 10;
            number /= 10;
        }
        return reversal;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int no = sc.nextInt();

        if (isPalindrome(no))
            System.out.println(no + " is a palindrome number");
        else
            System.out.println(no + " is not a palindrome number");
    }
}
