package datastructures.queue;

import java.util.Iterator;
import java.util.LinkedList;

// Dynamic queue using doubly linked-list
public class DynamicQueueDLL<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<>();

    public DynamicQueueDLL() {
    }

    public DynamicQueueDLL(T firstElement) {
        if (firstElement == null) throw new IllegalArgumentException();
        offer(firstElement);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Appends the element at the end of the list. This will not allow adding null elements.
     *
     * @param item element which has to be appended.
     */
    public void offer(T item) {
        if (item == null) throw new IllegalArgumentException();
        list.addLast(item);
    }

    /**
     * Poll an element from the front of the queue. Throws exception if there is no element.
     *
     * @return the element which got removed.
     */
    public T poll() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");
        return list.removeFirst();
    }

    /**
     * Peek the element at the front of the queue, without removing it. Throws exception if there is no element.
     */
    public T peek() {
        if (list.isEmpty()) throw new RuntimeException("Empty Queue");
        return list.peek();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

}
