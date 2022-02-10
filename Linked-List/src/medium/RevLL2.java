package medium;

//Problem 2: https://leetcode.com/problems/reverse-linked-list-ii/

public class RevLL2 {

    //  Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

//      Edge or base case
        if (left == right) return head;

//        Skip left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newLast = current;

//      Reversing between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < (right - left + 1); i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) next = next.next;
        }

        if (last != null) last.next = prev;
        else head = prev;

        newLast.next = current;
        return head;
    }
}
