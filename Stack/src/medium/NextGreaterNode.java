package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-node-in-linked-list/
public class NextGreaterNode {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Brute force, using stack. It uses same approach as "next greater element to right"
    // After learning more advance things solve again with optimized one
    public int[] nextLargerNodes(ListNode head) {
        if(head.next == null) return new int[] {0};

        List<Integer> nums = new ArrayList<>();
        while(head != null){
            nums.add(head.val);
            head = head.next;
        }

        return nextGreater(nums);
    }

    private static int[] nextGreater(List<Integer> nums){
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int i = nums.size() - 1; i >= 0; i--){
            if(stack.isEmpty()){
                list.add(0);
            }else if(stack.peek() > nums.get(i)){
                list.add(stack.peek());
            }else if(!stack.isEmpty() && stack.peek() <= nums.get(i)){
                while(!stack.isEmpty() && stack.peek() <= nums.get(i)) stack.pop();
                if(stack.isEmpty()) list.add(0);
                else list.add(stack.peek());
            }

            stack.push(nums.get(i));
        }
        Collections.reverse(list);

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

}
