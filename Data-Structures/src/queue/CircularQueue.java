package queue;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 10;
    private int[] a;
    private int size;
    private int head = 0;
    private int end = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int initialCapacity) {
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
        end %= a.length;
        size++;
        return true;
    }

    public int poll() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        int data = a[head++];
        head %= a.length;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        return a[head];
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        int i = head;
        StringBuilder sb = new StringBuilder().append("START: ");
        do {
            sb.append(a[i]).append(" <- ");
            i++;
            i %= a.length;
        } while (i != end);
        sb.append("END");
        return sb.toString();
    }
}
