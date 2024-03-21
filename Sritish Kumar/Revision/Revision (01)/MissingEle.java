package Rev;

public class MissingEle {
    static int[] arr1 = { 7, 5, 3, 9, 1, 6 };
    static int[] arr2 = { 2, 9, 7, 4, 1, 8 };
    static String miss = "";

    static int[] sort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

    static String missing(int arrRX[], int arrTX[]) {
        String st = "";
        for (int i = 0; i < arrRX.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arrTX.length && flag == true; j++) {
                if (arrRX[i] == arrTX[j]) {
                    // found
                    flag = false;
                }

            }
            // not found - It is a missing number
            if (flag) {
                st += arrRX[i] + " ";

            }

        }

        return st;
    }

    public static void main(String[] args) {

        miss += missing(arr1, arr2);
        miss += missing(arr2, arr1);
        System.out.println(miss);

    }
}
