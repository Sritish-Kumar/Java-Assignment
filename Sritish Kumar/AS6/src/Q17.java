public class Q17 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 4; // Example number
        System.out.println("Is " + number + " even? " + isEven(number));
    }
}