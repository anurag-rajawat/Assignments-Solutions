package queue;

public class StaticQueue {
    private int[] a;
    private int size;
    private int end = 0;
    private static final int DEFAULT_SIZE = 10;

    public StaticQueue() {
        this(DEFAULT_SIZE);
    }

    public StaticQueue(int initialCapacity) {
        this.a = new int[initialCapacity];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size() == a.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean offer(int item) {
        if (isFull()) throw new RuntimeException("Queue is full");
        a[end++] = item;
        size++;
        return true;
    }

    public int poll() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        int data = a[0];
        // Shifts the element to the left
        for (int i = 1; i < end; i++) {
            a[i - 1] = a[i];
        }
        size--;
        return data;
    }

    public int peek(){
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        return a[0];
    }

    public String toString(){
        if (size() == 0) return "[]";
        int arrLen = size() - 1;
        if (arrLen == -1) return "[]";
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < size(); i++) {
            if (i == arrLen) return sb.append(a[i]).append("]").toString();
            sb.append(a[i]).append(" <- ");
        }
        return sb.toString();
    }
}
