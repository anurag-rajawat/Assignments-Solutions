package easy;

// Problem no 2: https://leetcode.com/problems/reverse-linked-list/

public class RevLL {
    //  Definition for singly-linked list, provided by LeetCode.
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

    /**
     * I'm solving this problem using in-place reversal of linked-list.
     * You can also do this using recursion.
     * Space Complexity: O(1)
     * Time Complexity: O(n) ; n = the size of linked list.
     **/

    public ListNode reverseList(ListNode head) {
//       Edge case
        if (head == null) return null;

//      Three pointers to traverse and reverse linked-list in place.
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current != null) {
            current.next = prev; // Reversing the link
            prev = current;   // Moving previous pointer one step ahead i.e., the position of current pointer
            current = next; // Moving current pointer one step ahead i.e., the position of next location (pointer)
            if (next != null) next = next.next;
        }
//      At this stage, previous pointer will point towards the head of reversed linked-list.
        return prev;
    }
}
