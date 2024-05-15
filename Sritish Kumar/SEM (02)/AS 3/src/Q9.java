public class Q9 {
    static int rev = 0;

    public static int reverse(int num) {
        if (num == 0) {
            return rev;
        }

        int r = num % 10;

        rev = rev * 10 + r;

        return reverse(num / 10);

    }

    public static void main(String[] args) {

        int n = 1234;

        System.out.println(reverse(n));

    }
}

// Write a recursive method in Java which, given an integer n, print it with its
// digits reversed.
// For example , given 4735, it prints 5374.
