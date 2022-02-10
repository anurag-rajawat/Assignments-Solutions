package easy;

// Problem 16: https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class SumToN {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
}
