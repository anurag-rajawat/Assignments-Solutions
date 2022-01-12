package sorting.easy;

// Problem 30: https://leetcode.com/problems/two-sum/
// This is the same problem of array's easy "Two Sum"
public class TwoSum {
    //  Now, I don't know about hashmap that's why I'm doing it using bruteforce approach
    //  but when I will learn that than I again do this using hashmap and come up with optimized solution.
//    TODO: After learning hashmap again do this problem.

    //  Using LeetCode hints:
//  So, if we fix one of the numbers, say x , no we have to scan the entire array to find the next number, y
//  which is = value - x
//  where value is the input parameter. Can we change our array somehow so that this search becomes faster?
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - x) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
