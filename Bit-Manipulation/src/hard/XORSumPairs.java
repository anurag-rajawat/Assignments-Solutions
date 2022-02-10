package hard;

// Problem 3: https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/
public class XORSumPairs {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {6, 5};
        int[] c = {12}, d = {4};
        System.out.println(getXORSum(a, b));
//        System.out.println(getXORSum(c, d));
//        System.out.println(0^1^2^0^2^1);
    }

    // Using LeetCode hint 3 and Distributive property for AND and XOR : (a1^a2) & (b1^b2) = (a1&b1) ^ (a1&b2) ^ (a2&b1) ^ (a2&b2)
    // Hint 3: Let arr2XorSum = (arr2[0]^arr2[1]^arr2[2]...), arr1XorSum = (arr1[0]^arr1[1]^arr1[2]...)
    // so the final answer is (arr2XorSum&arr1[0]) ^ (arr2XorSum&arr1[1]) ^ (arr2XorSum&arr1[2]) ^ ... = arr2XorSum & arr1XorSum.

    public static int getXORSum(int[] arr1, int[] arr2) {
        int arr1XorSum = 0, arr2XorSum = 0;

        for (int num : arr1) arr1XorSum ^= num;
        for (int num : arr2) arr2XorSum ^= num;

        return arr1XorSum & arr2XorSum;
    }
}
