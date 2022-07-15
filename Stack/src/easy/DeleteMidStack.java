package easy;

import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1/#
public class DeleteMidStack {
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        int mid = (s.size() + 1) / 2;
        s.remove(mid - 1);
    }
}
