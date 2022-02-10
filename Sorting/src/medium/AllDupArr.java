package medium;

import java.util.ArrayList;
import java.util.List;

// Problem 12: https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class AllDupArr {
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(a));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        cyclicSort(nums);
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                res.add(nums[index]);
            }
        }
        return res;
    }

    private static void cyclicSort(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] a, int first, int second) {
        int curr = a[first];
        a[first] = a[second];
        a[second] = curr;
    }
}
