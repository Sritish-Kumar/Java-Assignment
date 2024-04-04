//Write a Java program that takes two arrays a and b of length n storing int values, and returns the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.

import java.util.Arrays;
import java.util.Scanner;

public class HM3 {

    static Scanner scan = new Scanner(System.in);

    static int[] arr1;
    static int[] arr2;

    static int[] input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        return arr;

    }

    static int[] dotProduct(int[] a, int[] b) {
        int[] dot = new int[a.length];
        for (int i = 0; i < dot.length; i++) {
            dot[i] = (a[i] * b[i]);

        }
        return dot;

    }

    public static void main(String[] args) {

        System.out.print("Enter the size of array : ");
        int n = scan.nextInt();
        arr1 = new int[n];
        arr2 = new int[n];

        arr1 = input(arr1);
        arr2 = input(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(dotProduct(arr2, arr1)));

    }
}
