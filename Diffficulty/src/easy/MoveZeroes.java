package easy;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes2(a);
        System.out.println(Arrays.toString(a));
    }

    // Good but, with O(n) space
    public static void moveZeroes(int[] a) {
        int[] b = new int[a.length];
        int j = 0;
        for (int num : a) {
            if (num != 0) b[j++] = num;
        }
        System.arraycopy(b, 0, a, 0, a.length);
    }

    // Good using O(1) space
    public static void moveZeroes2(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int curr = a[i];
        a[i] = a[j];
        a[j] = curr;
    }
}
