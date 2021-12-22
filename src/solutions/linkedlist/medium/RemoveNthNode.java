package solutions.linkedlist.medium;

// Problem 4 - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNode {
//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode removeNthFromEnd(ListNode head, int n) {
//       Edge Case
        // if(head==null || head.next==null) return head;

//      Two pointers to make changes in list
        ListNode fast=head, slow=head;

//      Moving fast pointer ahead by n times
        for(int i=0;i<n;i++) fast=fast.next;

//      Check if fast is null or not
        if(fast==null) return head.next;

//     Doing this will cause slow to reach the nth node from the end at the same time that fast reaches the end.
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

//      Deleting nth node
        slow.next=slow.next.next;

        return head;
    }
}
