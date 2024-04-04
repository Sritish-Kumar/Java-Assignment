/**
 * HM5
 */

// Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix,
// prints the matrix, and finds the first row and column with the most 1s.

public class HM5 {

    public static int[][] arr = new int[4][4];

    static int row;
    static int col;

    static void column() {
        int count = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 1) {
                    count++;

                }

            }
            if (count > max) {
                max = count;
                col = i;

            }
            count = 0;

        }
        System.out.println("COL: " + (col + 1) + " NO: " + max);

    }

    static void rows() {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    count++;

                }

            }

            if (count > max) {
                max = count;
                row = i;

            }
            count = 0;

        }
        System.out.println("ROW: " + (row + 1) + " NO: " + max);
    }

    static void input() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }

        }

    }

    static void display() {
        for (int[] is : arr) {
            for (int i : is) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        input();
        display();

        rows();
        column();

    }
}