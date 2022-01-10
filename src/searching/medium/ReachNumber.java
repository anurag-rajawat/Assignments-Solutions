package searching.medium;

// Problem 8: https://leetcode.com/problems/reach-a-number/solution/
public class ReachNumber {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0) {
            target -= ++k;
        }
        if (target % 2 == 0) {
            return k;
        }
        return k + 1 + k % 2;
    }
}
