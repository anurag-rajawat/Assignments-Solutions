package easy;

import java.util.ArrayList;
import java.util.Objects;

// https://leetcode.com/problems/palindrome-linked-list/
public class PalLL {

//    Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // Brute force approach
        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> nums = new ArrayList<>();
            while(head != null){
                nums.add(head.val);
                head = head.next;
            }
            int left = 0, right = nums.size() - 1;
            while (left <= right){
                if (!(nums.get(left).equals(nums.get(right)))) return false;
                left++;
                right--;
            }
            return true;
        }

        // Using fast and slow pointer, good approach
        public boolean isPalindrome2(ListNode head){
            ListNode fast = head;
            ListNode slow = head;

            // Find middle
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            //  Reverse second half of list
            ListNode prev = null;
            ListNode next = null;
            while(slow != null){
                next = slow.next;
                slow.next = prev;
                prev = slow;
                slow = next;
            }

            // Check for palindrome
            ListNode left = head, right = prev;
            while(right != null){
                if(right.val != left.val) return false;
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }
}
