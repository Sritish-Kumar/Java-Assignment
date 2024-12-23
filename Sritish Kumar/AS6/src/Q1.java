
public class Q1 {

    static int countBit1(int n) {
        int count = 0;
        // System.out.println(n);

        while (n != 0) {
            if ((n & 1) == 1) {

                count++;
            }

            n = n >>> 1;
            // System.out.println(n);
        }

        return count;

    }

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your Number: ");
        // int n = scan.nextInt();

        System.out.println("The Number of bits: " + countBit1(-2));

    }
}
