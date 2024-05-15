public class HM2 {

    static int search(int i, int j, int target, int[] arr) {
        int m = (i + j) / 2;
        if (i > j) {
            return -1;
        }

        if (target == arr[m]) {
            return m;

        }

        if (arr[m] > target) {
            return search(i, m - 1, target, arr);

        }
        return search(m + 1, j, target, arr);

    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Index: " + search(0, arr.length - 1, n, arr));

    }
}
