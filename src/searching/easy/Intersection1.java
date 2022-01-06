package searching.easy;

import java.util.ArrayList;
import java.util.Arrays;

// Problem 11 - https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection1 {

    // Not so optimized, because now I don't know about hashmaps
    public int[] intersection(int[] nums1, int[] nums2) {
        // We've to sort arrays so that we can apply binary search
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Since, we don't know how many element will intersect, so we need
        // a dynamic array to store our answer
        ArrayList<Integer> result = new ArrayList<>();

        // We can iterate on any one
        int i = 0;
        while (i < nums1.length) {
            // Check element of num1 exists in num2 or not.
            // Since, intersection consists of unique elements, so
            // we have to check that if that element is not in our result.

            boolean isFoundNums2 = search(nums2, nums1[i]);
            boolean isFoundRes = search(result, nums1[i]);

            // Checking element in nums2
            if (isFoundNums2) {
                // That element should not be already present in our answer, otherwise there will be duplicate entry of that
                // element, but we need unique elements.
                if (!isFoundRes) {
                    result.add(nums1[i]);
                }
            }
            i++;
        }

        // Since question asked us to return an array, so we've to copy our answer to array
        int[] ans = new int[result.size()];
        for (int index = 0; index < ans.length; index++) {
            ans[index] = result.get(index);
        }
        return ans;

    }

    private boolean search(int[] a, int target) {
        int s = 0, e = a.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (a[m] == target) return true;
            else if (a[m] < target) s = m + 1;
            else e = m - 1;
        }
        return false;
    }

    // To search in dynamic array
    private boolean search(ArrayList<Integer> list, int target) {
        int s = 0, e = list.size() - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (list.get(m) == target) return true;
            else if (list.get(m) < target) s = m + 1;
            else e = m - 1;
        }
        return false;
    }
}
