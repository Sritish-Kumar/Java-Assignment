public class Q7 {
    public static void main(String[] args) {
        int x = 2; // You can change this value
        int y = 3; // You can change this value

        long result = power(x, y);
        System.out.println(x + "^" + y + " = " + result);
    }

    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}