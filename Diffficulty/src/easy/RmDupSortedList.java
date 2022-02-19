package easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RmDupSortedList {
     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
      public ListNode deleteDuplicates(ListNode head) {
          // Edge case
          if (head == null) return null;
          ListNode dummyHead = head;
          while (head.next != null){
              if (head.val == head.next.val) head.next = head.next.next;
              else head = head.next;
          }
          return dummyHead;
      }
}
