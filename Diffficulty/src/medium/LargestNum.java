package medium;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/largest-number/
public class LargestNum {
    public static void main(String[] args) {
        int[] a = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(a));
    }

    //Custom comparator to compare two strings
    private static class LargeNumCompare implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo(s1);
        }
    }

    public static String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strings[i] = String.valueOf(nums[i]);

        Arrays.sort(strings, new LargeNumCompare());
        if (strings[0].equals("0")) return "0";
        for (String s : strings)
            sb.append(s);
        return sb.toString();
    }
}
