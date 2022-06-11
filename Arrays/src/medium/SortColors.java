package medium;

// Problem 9 - https://leetcode.com/problems/sort-colors/
public class SortColors {
    // There is no need to explain this problem, as it's code is self-explanatory.
    public void sortColors(int[] nums) {
        int zeroes, ones, twos;
        zeroes = ones = twos = 0;

        for (int no : nums) {
            if (no == 0) zeroes++;
            else if (no == 1) ones++;
            else twos++;
        }

        for (int i = 0; i < zeroes; i++) nums[i] = 0;
        for (int i = zeroes; i < zeroes + ones; i++) nums[i] = 1;
        for (int i = zeroes + ones; i < zeroes + ones + twos; i++) nums[i] = 2;
    }
}
