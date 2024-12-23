
public class Q2 {

    static int parity(int n) {
        int count = Q1.countBit1(n);
        System.out.println(count);

        if (count % 2 == 0) {
            return 0;

        }

        return 1;

    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your Number: ");
        // int n = scan.nextInt();

        System.out.println("Parity Of Num: " + parity(11));

    }
}
