package Rev;
// a number is a leader number if it is larger than all the number to its right .

public class LeaderNum {
    static int[] nums = { 10, 9, 14, 23, 15, 0, 9 };

    public static void main(String[] args) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            boolean r = true;
            for (int j = i; j < nums.length; j++) {
                if (max < nums[j]) {
                    r = false;
                    break;
                }

            }
            if (r) {
                System.out.print(max + " ");

            }

        }

    }

}
