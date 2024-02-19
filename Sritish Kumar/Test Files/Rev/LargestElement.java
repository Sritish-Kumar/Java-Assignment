package Rev;

import java.util.Arrays;

public class LargestElement {
    static int[] arrays = { 33, 88, 55, 44, 99, 11, 77, 66, 22 };

    // Removing element from the position

    static void remove(int i) {
        for (int j = i; j < arrays.length - 1; j++) {
            arrays[j] = arrays[j + 1];
        }
        arrays[arrays.length - 1] = 0;
    }

    // comparing in pairs
    static int[] compare(int[] arr) {
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            if (arr[i] < arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i + 1] = 0;
            } else {
                arr[i + 1] = 0;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrays));
        boolean flag = true;
        while (flag) {
            if (arrays[1] == 0) {
                flag = false;
                break;
            } else {
                arrays = compare(arrays);
                // System.out.println(" # " + Arrays.toString(arrays));
                for (int i = 0; i < arrays.length; i++) {
                    if (arrays[i] == 0) {
                        remove(i);
                    }

                }
                System.out.println(Arrays.toString(arrays));

            }

        }
        System.out.println("Largest Element: " + arrays[0]);

    }
}
