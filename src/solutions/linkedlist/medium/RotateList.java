package solutions.linkedlist.medium;

//// Problem 10 - https://leetcode.com/problems/rotate-list/
public class RotateList {

    //  Definition for singly-linked list.
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

    public ListNode rotateRight(ListNode head, int k)  {
        // Edge Case
        if (k <= 0 || head == null || head.next == null) return head;

        ListNode last = head; // Reference point to last Node of original list
        int len = 1; // Length of original list

        // Finding the last node of original list
        while (last.next != null) {
            last = last.next;
            len++;
        }
        last.next=head;

        int rotations = k % len;
        int toSkip = len - rotations;  // No of nodes to be skipped

        ListNode newLast = head;

        for (int i = 0; i < toSkip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null; // At this point new-last is new tail after being rotated that's why it's pointing to null.

        return head;
    }
}
