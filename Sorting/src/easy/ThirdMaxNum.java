package easy;


// Problem 7: https://leetcode.com/problems/third-maximum-number/
public class ThirdMaxNum {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num < first && num > second) {
                third = second;
                second = num;

            } else if (num > third && num < second) {
                third = num;
            }
        }
        if (third == Long.MIN_VALUE) return (int) first;
        return (int) third;
    }
}
