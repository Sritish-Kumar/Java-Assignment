
// Write a method to add two matrices. 
import java.util.Arrays;
import java.util.Scanner;

class array {
    int[][] list;

    array(int r, int c) {
        list = new int[r][c];
        System.out.println(r + " " + c);
    }

    int[] size() {
        int[] len = new int[2];

        len[0] = list.length;

        len[1] = list[0].length;

        return len;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = scan.nextInt();

            }

        }
        scan.close();

    }

    void display() {
        for (int[] is : list) {
            for (int i : is) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }

}

public class HM4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Array 1 size: ");
        array arr1 = new array(scan.nextInt(), scan.nextInt());

        arr1.input();

        System.out.print("Array 2 size: ");
        array arr2 = new array(scan.nextInt(), scan.nextInt());

        arr2.input();

        System.out.println(Arrays.equals(arr1.size(), arr2.size()));

        System.out.println("Array 1: " + Arrays.toString(arr1.size()));

    }
}
