package easy;

import java.util.Stack;

// https://leetcode.com/problems/min-stack/
public class MinStack {
    // Solution 1, with the help of discussion of LeetCode and pretty good solution;
    class Solution1 {
        ListNode curr;

        public Solution1() {
            curr = new ListNode(0, Integer.MAX_VALUE, null);
        }

        public void push(int val) {
            int min = getMin();
            if (val < min) min = val;
            curr = new ListNode(val, min, curr);
        }

        public void pop() {
            curr = curr.prev;
        }

        public int top() {
            return curr.val;
        }

        public int getMin() {
            return curr.min;
        }

        static class ListNode {
            private int val;
            private int min;
            private ListNode prev;

            public ListNode(int val, int min, ListNode prev) {
                this.val = val;
                this.min = min;
                this.prev = prev;
            }
        }
    }

    // Solution 2, good but not so optimized.
    class Solution2 {

        Stack<Integer> stack;
        Stack<Integer> minStack;

        public Solution2() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek())) minStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}


