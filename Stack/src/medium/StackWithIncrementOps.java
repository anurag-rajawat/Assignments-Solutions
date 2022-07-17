package medium;

// https://leetcode.com/problems/design-a-stack-with-increment-operation/
public class StackWithIncrementOps {
    class CustomStack {
        private final int maxSize;
        private final int[] stack;
        private int curr;
        private int size;

        public CustomStack(int maxSize) {
            this.maxSize = maxSize;
            this.stack = new int[maxSize];
            this.curr = 0;
            this.size = 0;
        }

        public void push(int x) {
            if (this.size < maxSize) {
                stack[this.curr++] = x;
                this.size++;
            }
        }

        public int pop() {
            if (this.size == 0) return -1;
            int val = stack[this.curr-1];
            stack[this.curr-1] = 0;
            this.curr--;
            this.size--;
            return val;
        }

        public void increment(int k, int val) {
            for (int i = 0; i < k && i < size; i++) {
                stack[i] += val;
            }
        }
    }

}
