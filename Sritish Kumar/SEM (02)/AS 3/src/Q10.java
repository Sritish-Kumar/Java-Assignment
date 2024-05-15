public class Q10 {
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        // System.out.println(n);

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }

}
