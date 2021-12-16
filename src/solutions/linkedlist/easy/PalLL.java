package solutions.linkedlist.easy;

// Problem no 6 - https://leetcode.com/problems/palindrome-linked-list/

public class PalLL {
    //     Definition for singly-linked list.
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

    //    Method 1 - Bruteforce approach, using string builder and loops.
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }

        String s = sb.toString();
        int len = s.length();

        int i, j = len - 1, mid = len / 2;

//       Just checking the first and last character of string (consists of linked-list values) are equal or not.
        for (i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(j)) return false;
            j--;
        }
        return true;
    }

    //    Method 2 - Optimized approach, using reversal of linked-list.
//    Approach: Reverse half of the list, and check whether head is equal to the mid-element.
    public boolean isPalindrome2(ListNode head) {
//      Edge Case
        if (head == null) return true;

        ListNode mid = getMid(head); // Getting mid of provided linked-list
        ListNode revLL = reverseList(mid); // reverse the half list

        while (head != null && revLL != null) {
            if (head.val != revLL.val) return false;
            head = head.next;
            revLL = revLL.next;
        }
        return true;
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
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