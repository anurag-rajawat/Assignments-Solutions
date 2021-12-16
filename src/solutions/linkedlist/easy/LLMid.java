package solutions.linkedlist.easy;

// Problem no 3: https://leetcode.com/problems/middle-of-the-linked-list/

public class LLMid {
    // Definition for singly-linked list, provided by LeetCode.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    //    This is also using fast and slow pointer approach.
    public ListNode middleNode(ListNode head) {
        ListNode fast = head; // Fast pointer
        ListNode slow = head; // Slow pointer

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

  /*
      We've to return slow, why ? Let's think, if a person runs twice faster as you then
      if he completes a round, it means definitely you're at middle of round.
      That's why we've to return slow.
   */
        return slow;
    }
}
