package medium;

// Problem 8:
public class SortList {

    // Definition for singly-linked list provided by linked-list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    // Sorting the linked-list using merge-sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = middleNode(head); // Middle node of list
        ListNode left = sortList(head);  // Left part of list
        ListNode right = sortList(mid);  // Left part of list
        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        while (list1 != null) {
            head.next = list1;
            list1 = list1.next;
            head = head.next;
        }
        while (list2 != null) {
            head.next = list2;
            list2 = list2.next;
            head = head.next;
        }
        return ans.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode midprev = null;
        while (head != null && head.next != null) {
            midprev = (midprev == null) ? head : midprev.next;
            head = head.next.next;
        }
        ListNode mid = midprev.next;
        midprev.next = null;
        return mid;
    }
}

