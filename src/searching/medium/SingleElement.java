package searching.medium;

// Problem 2: https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElement {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(a));
    }

    // Method 1: Using Bitwise XOR '^' operator
    public static int singleNonDuplicate(int[] nums) {
        int unique = 0;
        for (int ele : nums) {
            unique ^= ele;
        }
        return unique;
    }

    // Method 2: By keeping count of each number
    public int singleNonDuplicate2(int[] nums) {
        int ans = -1;
        int[] count = new int[nums[nums.length - 1] + 1];
        for (int num : nums) count[num]++;

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1)
                ans = i;
        }
        return ans;
    }

    // Method 3: Using binary search, but I'm not able to with it now, later I'll do it.
}
