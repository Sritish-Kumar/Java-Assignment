public class HM6 {

    public static boolean checkPalindrome(String str) {
        if (str.length() < 2) {
            return true;
        }
        int i = 0;
        int j = str.length() - 1;
        return checkPalindrome(str, i, j);

    }

    public static boolean checkPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;

        }
        if (str.charAt(start) == str.charAt(end)) {
            return checkPalindrome(str, ++start, --end);

        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        String s = "aaabbbaaa";

        System.out.println(checkPalindrome(s));

    }
}

// Write a recursive Java method that determines if a string s is a palindrome,
// that is, it is
// equal to its reverse. Examples of palindromes include 'racecar' and
// 'gohangasalamiimalasagnahog