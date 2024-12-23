public class Q13 {
    public static void main(String[] args) {
        int number = 1122334455;
        int[] digitCount = new int[10];

        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        for (int i = 0; i < digitCount.length; i++) {
            System.out.println("Digit " + i + ": " + digitCount[i]);
        }
    }
}