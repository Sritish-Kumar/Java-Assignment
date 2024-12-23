public class Q6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        System.out.println(divide(x, y));
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int quotient = 0;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient;
    }
}