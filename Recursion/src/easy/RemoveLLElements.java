package easy;

// Problem: https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLLElements {
//    Definition for singly-linked list.
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode removeElements(ListNode head, int val) {
            // Edge case
            if (head == null) return null;

            ListNode trav = new ListNode(); // Traversal pointer
            trav.next = head;
            ListNode currNode = trav;

            // Self-explanatory
            while(currNode.next!=null){
                if(currNode.next.val == val){
                    currNode.next = currNode.next.next;
                }else{
                    currNode = currNode.next;
                }
            }
            return trav.next;
    }
}

