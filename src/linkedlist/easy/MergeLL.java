package linkedlist.easy;

// Problem no 4: https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeLL {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//      Edge case
        if (list1 == null && list2 == null) return null;

//      Head of our merged linked-list and a traversal pointer.
        ListNode ans = new ListNode();
        ListNode trav = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                trav.next = list1;
                list1 = list1.next;
            } else {
                trav.next = list2;
                list2 = list2.next;
            }
//          Moving traversal pointer ahead because we've to point to next location to store next value
//          Otherwise it will store next value at same position (index).
            trav = trav.next;
        }

//        In-case if list1 has more element than list 2 which are remaining to be added to our answer list.
        while (list1 != null) {
            trav.next = list1;
            list1 = list1.next;
            trav = trav.next;
        }

//        In-case if list2 has more element than list 1, which are remaining to be added to our answer list.

        while (list2 != null) {
            trav.next = list2;
            list2 = list2.next;
            trav = trav.next;
        }

        // Since answer is null, because we've created a new object. So we've to return the head which starts from ans.next.
        return ans.next;
    }
}
