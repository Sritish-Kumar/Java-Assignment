package Rev;

import java.util.Arrays;

public class RemovingDuplicate {
    static int[] array = { 5, 6, 2, 3, 6, 2, 5, 4 };
    static int[] newarr = new int[array.length];

    public static void main(String[] args) {
        int pos = 0;

        for (int i = 0; i < array.length; i++) {
            int c = 0;
            for (int j = 0; j < newarr.length; j++) {
                if (array[i] == newarr[j]) {
                    c++;

                }

            }
            if (c == 0) {
                newarr[pos] = array[i];
                pos++;

            }

        }
        System.out.println(Arrays.toString(newarr));

    }
}
