package solutions.arrays.easy;

// Problem 4: https://leetcode.com/problems/richest-customer-wealth/

public class RichestWealth {
    public int maximumWealth(int[][] accounts) {
        int bal=0;
        for (int[] account : accounts) {
            int maxBal = 0;
            for (int i : account) {
                maxBal += i;
            }
            bal = Math.max(bal, maxBal);
        }
        return bal;
    }
}
