package arrays.easy;

// Problem 22 - https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class SumToZero {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int j = 0; // This pointer is used to build our resultant array

        if (n % 2 == 0) {
            for (int i = -n / 2; i <= n / 2; i++) if (i != 0) res[j++] = i;
        } else {
            for (int i = -n / 2; i <= n / 2; i++) res[j++] = i;
        }
        return res;
    }
}