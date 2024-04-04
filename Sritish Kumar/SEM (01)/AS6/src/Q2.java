import java.util.Scanner;

public class Q2 {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {

        System.out.println("First 100 pentagonal numbers with 10 numbers on each line");

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%6d", getPentagonalNumber(i));

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
