public class HM1 {
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    public static void main(String[] args) {

        int a = 100;
        int b = 15;
        System.out.println(gcd(a, b));

    }
}
