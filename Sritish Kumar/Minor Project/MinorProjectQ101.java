import java.util.Arrays;

public class MinorProjectQ101 {
    static int arr[] = { 10, 11, 12, 13 };
    static String oldBin[] = new String[4];
    static String[] newBin = new String[4];
    static long[] finalArr = new long[4];

    public static String fillZeros(String s) {
        String s0 = "";
        int l = 32 - s.length();
        for (int i = 0; i < l; i++) {
            s0 += "0";

        }

        return s0 + s;

    }

    public static void rotateRightBy2Bits() {
        newBin[0] = oldBin[3].substring(30, 32) + oldBin[0].substring(0, 30);

        for (int i = 1; i < 4; i++) {
            newBin[i] = oldBin[i - 1].substring(30, 32) + oldBin[i].substring(0, 30);

        }
        System.out.println("The Reversed Binary Array: ");
        System.out.println(Arrays.toString(newBin) + "\n");

    }

    public static void main(String[] args) {

        System.out.println("Given Array: ");
        System.out.println(Arrays.toString(arr) + "\n");

        // --------------------------------------------> Converting to 32-Bit Binary

        int j = 0;
        for (int i : arr) {
            String s = Integer.toBinaryString(i);
            oldBin[j] = fillZeros(s);
            j++;
        }
        System.out.println("Binary of the Given Array: ");
        System.out.println(Arrays.toString(oldBin) + "\n");

        // --------------------------------------------> Reversing the bits
        rotateRightBy2Bits();

        // --------------------------------------------> Binary to decimal with sign
        int i = 0;
        for (String s : newBin) {

            if (s.charAt(0) == '1') {
                long n = (long) (-1 * Math.pow(2, s.length() - 1));
                finalArr[i] = Long.parseLong(s.substring(1, 32), 2) + n;
                i++;

            } else {
                finalArr[i] = Long.parseLong(s, 2);
                i++;

            }

        }
        System.out.println("The Final Decimal Array: ");
        System.out.println(Arrays.toString(finalArr) + "\n");

    }
}