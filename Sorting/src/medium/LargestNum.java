package medium;

import java.util.Arrays;
import java.util.Comparator;

// Problem 9: https://leetcode.com/problems/largest-number/
public class LargestNum {
    // Using LeetCode hint to use custom comparator

    //Custom comparator to compare two strings
    private class LargeNumCompare implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }
    }

    public String largestNumber(int[] nums) {
        // Convert integer array numbers into strings
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        // Now sort the string array using our custom comparator
        Arrays.sort(numsStr, new LargeNumCompare());

        if (numsStr[0].equals("0")) {
            return "0";
        }

        StringBuilder builder = new StringBuilder();
        for (String str : numsStr) {
            builder.append(str);
        }
        return builder.toString();
    }
}
