public class HM4 {

    public static int product(int m, int n) {

        if (m == 0 || n == 0) {
            return 0;

        }
        return m + product(m, --n);

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 3;

        System.out.println("Product: " + product(Math.max(a, b), Math.min(a, b)));

    }
}
