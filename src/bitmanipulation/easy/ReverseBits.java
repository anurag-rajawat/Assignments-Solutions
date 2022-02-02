package bitmanipulation.easy;

// Problem 3: https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
    // Method 1: Using built-in method
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }


    // Method 2: Using our custom fn, from the discussion form
    public static int reverseBits2(int n) {
        int res = 0;
        //creating a mask to match the msb with the input
        //mask -> 10000000000000000000000000000000
        int match = 1 << 31;
        for (int i = 0; i < 32; i++) {
            //doing & and checking if msb is not zero
            //shift the result to ith left
            if ((n & match) != 0) {
                res += 1 << i;
            }
            n = n << 1;
        }
        return res;
    }
}

