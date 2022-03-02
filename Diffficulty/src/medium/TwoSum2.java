package medium;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {
    // Simply use binary search
    public int[] twoSum(int[] numbers, int target) {
        int s = 0, e = numbers.length - 1;
        while (s <= e) {
            if (numbers[s] + numbers[e] == target) return new int[]{s + 1, e + 1};
            else if (numbers[s] + numbers[e] < target) s++;
            else e--;
        }
        return new int[]{-1, -1};
    }
}
