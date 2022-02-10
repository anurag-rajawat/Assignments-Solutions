package stack;

import java.util.EmptyStackException;

public class StaticStack {
    private int[] a;
    private int topPtr = -1;
    private static final int DEFAULT_SIZE = 10;

    public StaticStack() {
        this(DEFAULT_SIZE);
    }

    public StaticStack(int size) {
        this.a = new int[size];
    }

    public boolean isEmpty() {
        return topPtr == -1;
    }

    public int size() {
        return topPtr+1;
    }

    public boolean isFull() {
        return topPtr == a.length - 1;
    }

    public boolean push(int value) {
        if (isFull()) throw new StackOverflowError();
        a[++topPtr] = value;
        return true;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return a[topPtr];
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return a[topPtr--];
    }

    @Override
    public String toString(){
        if (size() == 0) return "[]";
        int arrLen = size() - 1;
        if (arrLen == -1) return "[]";
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < size(); i++) {
            if (i == arrLen) return sb.append(a[i]).append("]").toString();
            sb.append(a[i]).append(", ");
        }
        return sb.toString();
    }
}
