package easy;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLL {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Just understand the image given in question then you get this implementation
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;

        while (l1 != l2) {
            if (l1 != null) l1 = l1.next;
            else l1 = headB;
            if (l2 != null) l2 = l2.next;
            else l2 = headA;
        }
        return l1;
    }
}
