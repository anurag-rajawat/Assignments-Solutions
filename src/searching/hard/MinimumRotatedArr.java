package searching.hard;

import java.util.Arrays;

public class MinimumRotatedArr {
    // This is not a good approach, but I just do it because I'll definitely do it later properly
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
