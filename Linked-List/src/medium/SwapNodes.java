package medium;

//Problem 5 - https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

//------------------------------------------------|||||||||||||||||||||||||||||||||||||||||||||||||------------------------------------------------

//      I'm solving this, using the hints provided by LeetCode.
//      Hint 1: We can transform the linked list to an array this should ease things up
//      Hint 2: After transforming the linked list to an array it becomes as easy as swapping two integers in an array then rebuilding the linked list

//------------------------------------------------|||||||||||||||||||||||||||||||||||||||||||||||||------------------------------------------------

import java.util.Scanner;

public class SwapNodes {
//  Definition for singly-linked list.
     class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


//   Method 1 - Not so much optimized,
    public ListNode swapNodes(ListNode head, int k) {
        // if(k==1) return head;

        int len=size(head);     // Length of linked-list
        int[] a=new int[len];

//      Pointer to traverse and build the list from array.
        ListNode trav=head;

//        Building the array with linked-list val
        for(int i=0;i<len;i++) {
            a[i]=trav.val;
            trav=trav.next;
        }

        int endIndex= len-k;

        swap(a, k-1, endIndex);

        // Now we've to point it to start so that we can build our linked-list after swapping,
        // Because it has reached the end while building the array.
        trav=head;

//      Building the list after swapping
        for(int i=0;i<len;i++){
            trav.val=a[i];
            trav=trav.next;
        }

        return head;
    }

    private void swap(int[] a, int first, int second){
        int val=a[first];
        a[first]=a[second];
        a[second]=val;
    }

    private int size(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }

}
