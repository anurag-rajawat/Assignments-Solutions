package medium;

// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
public class MinSwaps {
    public int minSwaps(String s) {
        int closeCount = 0, maxClose = 0;

        for(char ch : s.toCharArray()){
            if (ch == '[') closeCount--;
            else closeCount++;
            maxClose = Math.max(maxClose, closeCount);
        }
        return (maxClose + 1) / 2;
    }
}
