public class HM8 {
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {

        if (n == 1) {

            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);

            return;

        }

        towerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Move the nth disk from 'fromRod' to 'toRod'

        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Move (n-1) disks from 'auxRod' to 'toRod' using 'fromRod' as auxiliary

        towerOfHanoi(n - 1, auxRod, toRod, fromRod);

    }

    public static void main(String[] args) {

        int n = 4; // Number of disks

        towerOfHanoi(n, 'A', 'C', 'B'); // 'A' is the source rod, 'C' is the target rod, 'B' is the auxiliary rod

    }
}
