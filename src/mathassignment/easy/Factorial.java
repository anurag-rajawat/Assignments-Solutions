package mathassignment.easy;

// Problem 5: https://practice.geeksforgeeks.org/problems/factorial5739/1/?category[]=Mathematical&category[]=Mathematical&page=3&query=category[]Mathematicalpage3category[]Mathematical
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    // Not so good
    public static int factorial(int n) {
        if (n == 0 || n == 1 || n < 0) return 1;
        return n * factorial(n - 1);
    }

}
