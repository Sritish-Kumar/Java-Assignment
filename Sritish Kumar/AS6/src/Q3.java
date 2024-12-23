public class Q3 {
    public static void main(String[] args) {

        int num = 4;
        int i = 3;
        int j = 5;

        int i_val = (num >> (i - 1)) & 1;
        int j_val = (num >> (j - 1)) & 1;

        if (i_val != j_val) {
            // i toggle
            num = (1 << (i - 1)) ^ num;

            // j toggle
            num = (1 << (j - 1)) ^ num;

            System.out.println(num);
        } else {
            System.out.println(num);
        }

    }
}
