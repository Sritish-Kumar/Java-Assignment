public class Q7 {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else if (num < 0) {
            System.out.println("Invalid Number");
            return -1;

        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        int n = -1;
        System.out.println("Factorail: " + fact(n));

    }

}

// Write a recursive method in Java that computes the factorial of a given
// integer.
