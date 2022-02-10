package easy;

// Problem 3: https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1/?category[]=Mathematical&category[]=Mathematical&page=2&query=category[]Mathematicalpage2category[]Mathematical
public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println(isArmstrongNum(153));
        System.out.println(isArmstrongNum(370));
    }

    public static boolean isArmstrongNum(int n) {
        int originalNum = n;
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += cube(lastDigit);
            n /= 10;
        }
        return sum == originalNum;
    }

    public static int cube(int n) {
        return (int) Math.pow(n, 3);
    }
}
