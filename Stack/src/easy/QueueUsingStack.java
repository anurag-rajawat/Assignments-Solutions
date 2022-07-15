package easy;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class QueueUsingStack {

    class MyQueue {
        private Stack<Integer> stack;

        public MyQueue() {
            stack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            int idx = stack.indexOf(stack.firstElement());
            return stack.remove(idx);
        }

        public int peek() {
            return stack.firstElement();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
