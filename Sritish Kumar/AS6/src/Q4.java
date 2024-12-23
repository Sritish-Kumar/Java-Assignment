import java.util.Scanner;

public class Q4 {

    public static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 64; i++) {
            // Extract the least significant bit and shift it to the correct position in the
            // result.
            result = (result << 1) | (n & 1);
            // Shift the input number to the right to process the next bit.
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 64-bit integer: ");
        long inputWord = scanner.nextLong();

        long reversedWord = reverseBits(inputWord);

        System.out.printf("Input (binary):   %64s%n", Long.toBinaryString(inputWord).replace(' ', '0'));
        System.out.printf("Reversed (binary):%64s%n", Long.toBinaryString(reversedWord).replace(' ', '0'));

        scanner.close();
    }
}
