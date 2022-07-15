package medium;

// https://leetcode.com/problems/min-stack/

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack {
    private ListNode curr;

    public MinStack() {
        curr = new ListNode(null, 0, Integer.MAX_VALUE);
    }

    public void push(int val) {
        int min = Math.min(getMin(), val);
        curr = new ListNode(curr, val, min);
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
        private final ListNode prev;
        private final int val;
        private final int min;

        public ListNode(ListNode prev, int val, int min) {
            this.prev = prev;
            this.val = val;
            this.min = min;
        }
    }
}
