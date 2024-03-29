import java.util.Scanner;

class Q8 {
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
    }
}
