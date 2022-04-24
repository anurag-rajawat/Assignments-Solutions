package medium;

// https://leetcode.com/problems/sum-of-two-integers/submissions/
public class SumTwoInts {
    // Time & Space comp: O(b) & O(1)
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a ^= b;
            b = carry << 1;
        }
        return a;
    }
}
