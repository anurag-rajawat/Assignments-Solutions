package easy;

// Problem no 5: https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DelNode {
    //  Definition for singly-linked list, provided by LeetCode.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

//    In this problem, there's no access to head.
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
