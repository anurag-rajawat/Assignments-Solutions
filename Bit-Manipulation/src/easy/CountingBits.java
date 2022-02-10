package easy;

// Problem 5: https://leetcode.com/problems/counting-bits/
public class CountingBits {
    // Method 1: Not so good
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i = 1; i < ans.length; i++){
            ans[i] = noOfOnes(i);
        }

        return ans;
    }

    public int noOfOnes(int n){
        String num = Integer.toBinaryString(n);
        int ans = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '1') ans++;
        }
        return ans;
    }

    // Method 2: Using built-int fn
    public int[] countBits2(int n){
        int[] ans = new int[n+1];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }
}
