package easy;

// https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLLElement {
     // Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode prev = dummyHead;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            if(curr.val == val) prev.next = next;
            else prev = curr;
            curr = next;
        }
        return dummyHead.next;
    }
}
