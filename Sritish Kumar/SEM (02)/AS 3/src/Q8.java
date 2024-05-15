public class Q8 {

    public static void main(String[] args) {
        int x = 3;
        int n = 3;
        System.out.println("Power: " + pow(x, n));

    }

    public static long pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * pow(x, --n);
    }
}

// Write a recursive method in Java which, given real value x and a positive
// integer n, returns
// the value of xn.