package easy;

// https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bits = (n >> i) & 1;
            ans = ans | (bits << (31 - i));
        }
        return ans;
    }
}
