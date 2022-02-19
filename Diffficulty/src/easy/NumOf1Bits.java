package easy;

// https://leetcode.com/problems/number-of-1-bits/
public class NumOf1Bits {
    // you need to treat n as an unsigned value
    // Step 1: Convert n to binary String then count the occurrences of 1's
    public int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        return totalOnes(num);
    }

    public int totalOnes(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') ans++;
        }
        return ans;
    }
}
