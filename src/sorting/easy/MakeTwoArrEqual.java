package sorting.easy;

import java.util.Arrays;

// Problem 24: https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
public class MakeTwoArrEqual {

    // First sort both arrays and check whether two arrays are equal or not.
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target[i]) return false;
        }
        return true;
    }
}