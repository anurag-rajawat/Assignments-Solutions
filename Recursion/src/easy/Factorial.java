package easy;

// Problem 21: https://www.hackerrank.com/challenges/30-recursion/problem
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(20));
    }
    public static long factorial(int n) {
        // Write your code here
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
