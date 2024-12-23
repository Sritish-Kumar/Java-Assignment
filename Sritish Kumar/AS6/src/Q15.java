public class Q15 {
    public static void main(String[] args) {
        int num = 2;
        int primeCount = 0;
        while (primeCount < 100) {
            if (isPrime(num)) {
                primeCount++;
                if (primeCount == 100) {
                    System.out.println("The 100th prime number is: " + num);
                }
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}