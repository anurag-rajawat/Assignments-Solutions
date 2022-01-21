package recursion.easy;

// Problem 14: https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
public class Product {
    public static void main(String[] args) {
        System.out.println(product(100, 5));
        System.out.println(product(5,2));
        System.out.println(product(2,5));
    }

    public static int product(int a, int b) {
        if (b == 0) return 0;
        return product(a, b - 1) + a;
    }
}
