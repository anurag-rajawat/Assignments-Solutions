package easy;

import java.util.Arrays;

// Problem 15 - https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class NAndDouble {
    // We only need to check :-
    // 1. i != j
    // 2. arr[i] = 2 * arr[j]
    // If all the conditions satisfies returns true, otherwise false;
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
