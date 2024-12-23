class Q5 {
    public static int multiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result = add(result, x);
        }
        return result;
    }

    // Helper method to add two numbers without using arithmetic operators
    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println("Result: " + multiply(x, y)); // Output: 15
    }
}