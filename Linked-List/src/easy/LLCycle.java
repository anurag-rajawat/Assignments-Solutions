package easy;

// Problem no 8: https://leetcode.com/problems/linked-list-cycle/

public class LLCycle {
    // Definition for singly-linked list, provided by LeetCode.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // It's using linked-list cycle-detection approach.
    public boolean hasCycle(ListNode head) {
        // Edge case
        if (head == null) return false;

        // These are two pointers
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Moving fast pointer two times ahead.
            slow = slow.next;

            // If cycle is present, fast and slow definitely going to meet.
            if (fast == slow) return true;
        }
        return false;
    }
}
