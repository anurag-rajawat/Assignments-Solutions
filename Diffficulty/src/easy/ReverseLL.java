package easy;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLL {

//    Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
         // Iterative Method, Time Complexity = O(n), Space O(1)
        public ListNode reverseList1(ListNode head) {
            if(head == null) return null;

            ListNode prev = null;
            ListNode curr = head;
            ListNode next = null;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
        // Recursive Method, Time Complexity = O(n), Space O(1)
        public ListNode reverseList2(ListNode head) {
            if(head == null) return null;
            ListNode newHead = head;

            if (head.next != null){
                newHead = reverseList2(head.next);
                head.next.next = head;
            }
            head.next = null;
            return newHead;
        }

    }
}
