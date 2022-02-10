package easy;


// Problem no 9: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RmDup {
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

    public ListNode deleteDuplicates(ListNode head) {
//         Edge Case
        if (head == null) return null;

//        Dummy Head for storing current head, which is required to return to LeetCode
        ListNode dummyHead = head;

        while (head.next != null) {
            if (head.val == head.next.val) {
//            Moving head two steps ahead
                head.next = head.next.next;
            } else head = head.next;
        }
        return dummyHead;
    }
}
