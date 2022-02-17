package easy;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoLists {
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Just applying merge-sort
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Edge Case
        if (list1 == null || list2 == null) return null;

//      Head of our merged linked-list and a traversal pointer.
        ListNode ansHead = new ListNode();
        ListNode trav = ansHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                trav.next = list1;
                list1 = list1.next;
            } else {
                trav.next = list2;
                list2 = list2.next;
            }
            trav = trav.next;  // Moving traversal pointer ahead because we've to point to next location to store next value
        }
        // Since answer is null, because we've created a new object. So we've to return the head which starts from ans.next.
        return ansHead.next;
    }
}