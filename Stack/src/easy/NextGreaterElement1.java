package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-i/
public class NextGreaterElement1 {
    // Not so good, solve again with map after learning them
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (stack.peek() > nums2[i]) {
                list.add(stack.peek());
            } else if (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                while (!stack.isEmpty() && stack.peek() <= nums2[i]) stack.pop();
                if (stack.isEmpty()) list.add(-1);
                else list.add(stack.peek());
            }
            stack.push(nums2[i]);
        }
        Collections.reverse(list);
        for (int i = 0; i < nums1.length; i++) {
            int idx = search(nums2, nums1[i]);
            ans[i] = list.get(idx);
        }
        return ans;
    }

    private static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
