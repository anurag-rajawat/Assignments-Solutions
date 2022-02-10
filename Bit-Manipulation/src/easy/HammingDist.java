package easy;

// Problem 7: https://leetcode.com/problems/hamming-distance/
public class HammingDist {
    // As we know:
    // 0 ^ 0 = 0
    // 0 ^ 1 = 1
    // 1 ^ 0 = 1
    // 1 ^ 1 = 0
    // So, first we xor of x and y and then count the no of 1's in xor-ed string.
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }
}
