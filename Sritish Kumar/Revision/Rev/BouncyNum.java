package Rev;
// If a number is in neither inscreasing or decresing order;

public class BouncyNum {
    static int[] nums = { 1, 2, 3, 0, };

    public static void main(String[] args) {
        boolean incs = false;
        boolean desc = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                incs = true;
            } else if (nums[i] > nums[i + 1]) {
                desc = true;
            }

        }
        if (incs == true && desc == true) {
            System.out.println("It is bouncy numbers");

        }
    }

}
