package bitmanipulation.easy;

// Problem 2: https://leetcode.com/problems/single-number/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int unique = 0;
        // XORing the elements of nums because XOR gives true if two numbers are different otherwise false
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }
}
