public class HM3 {

    // Method to convert decimal to binary using recursion
    public static String decimalToBinary(int decimal) {
        // Base case: if the decimal number is 0
        if (decimal == 0) {
            return "0";
        }
        // Base case: if the decimal number is 1
        if (decimal == 1) {
            return "1";
        }
        // Recursive step: divide the decimal number by 2 and recursively call the
        // method
        int remainder = decimal % 2;
        int quotient = decimal / 2;
        // Concatenate the binary representation of the quotient and the remainder
        return decimalToBinary(quotient) + String.valueOf(remainder);
    }

    public static void main(String[] args) {
        int decimalNumber = 23;
        String binaryEquivalent = decimalToBinary(decimalNumber);
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Binary Equivalent: " + binaryEquivalent);

    }
}

// Write a recursive method in Java to find the binary equivalent of a positive
// decimal integer.
