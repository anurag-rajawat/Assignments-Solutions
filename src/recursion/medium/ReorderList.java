package recursion.medium;

// Problem 34: https://leetcode.com/problems/reorder-list/
public class ReorderList {
    
      // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
     
    public void reorderList(ListNode head) {
        // Edge case
        if (head == null || head.next == null) return;

        // Getting middle node
        ListNode midNode = getMidNode(head);

        ListNode fHead = head;    // Head of starting list.
        ListNode sHead = reverseList(midNode);    // Head of reversed list from middle

        // Rearranging
        while (fHead != null && sHead != null) {
            ListNode crrNext = fHead.next;    // The next node to the head of first(starting) list
            fHead.next = sHead;
            fHead = crrNext;

            crrNext = sHead.next;     // The node next to head of second list.
            sHead.next = fHead;
            sHead = crrNext;
        }

        // Second next of tail to null
        if (fHead != null) fHead.next = null;
    }

    private ListNode getMidNode(ListNode head) {
        ListNode fast = head; // Fast pointer
        ListNode slow = head; // Slow pointer

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

  /*
      We've to return slow, why ? Let's think, if a person runs twice faster as you then
      if he completes a round, it means definitely you're at middle of round.
      That's why we've to return slow.
   */
        return slow;
    }

    private ListNode reverseList(ListNode head) {
//        Edge case
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
