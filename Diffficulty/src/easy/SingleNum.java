package easy;

// https://leetcode.com/problems/single-number/
public class SingleNum {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) unique ^= num;
        return unique;
    }
}
