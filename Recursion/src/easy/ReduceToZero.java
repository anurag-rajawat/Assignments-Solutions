package easy;

// Problem 23: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class ReduceToZero {
    public int numberOfSteps(int num) {
        return steps(num, 0);
    }

    public int steps(int n, int step) {
        // Base case
        if (n == 0) return step;
        if (isEven(n)) return steps(n / 2, step + 1);
        return steps(n - 1, step + 1);
    }

    public boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
