import java.util.Arrays;

public class MinorProjectQ102 {
    static int length = 4;

    static int[] arr = { 10, 11, 12, 13 };
    static int[] rarr = new int[length];

    static void print(int[] array, String st) {
        // Function to print the array

        System.out.println();
        System.out.println(st + " Rotation (binary): ");
        System.out.print("[");
        int c = 1;
        for (int i : array) {
            String str = Integer.toBinaryString(i);
            int l = str.length();
            if (l < 32) {
                // If length is less than 32 Zero padding is required

                if (c == 4) { // just to ommit the last comma - ","
                    System.out.printf(" %0" + (32 - l) + "d%s ", 0, str);

                } else {
                    System.out.printf(" %0" + (32 - l) + "d%s,", 0, str);
                    c++;
                }

            } else {
                // No Zero padding is required

                if (c == 4) { // just to ommit the last comma - ","
                    System.out.printf("%s ", str);

                } else {
                    System.out.printf(" %s,", str);
                    c++;

                }

            }

        }
        System.out.println("]");

    }

    public static void rotateRightBy2Bits(int s[]) {
        // calling print function to print the array
        print(s, "Before");
        int c = 0;

        for (int i : s) {
            if (c == 0) {
                rarr[c] = (arr[c] >>> 2) | (arr[length - 1] << 30);
                c++;
                continue;
            }
            rarr[c] = (arr[c] >>> 2) | (arr[c - 1] << 30);
            c++;

        }
        print(rarr, "After");
        System.out.println();

    }

    public static void main(String[] args) {

        System.out.println("Given Array is: " + Arrays.toString(arr));
        rotateRightBy2Bits(arr);

        System.out.println("Rotated Array is: " + Arrays.toString(rarr));

    }
}
