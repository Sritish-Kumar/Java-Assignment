// WRONG ANSWER

import java.util.Arrays;
import java.util.Scanner;

public class Q4_Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scan.next());

        char[] arr;

        System.out.println(str.toString());
        arr = str.toString().toCharArray();

        System.out.println(Arrays.toString(arr));

    }
}
