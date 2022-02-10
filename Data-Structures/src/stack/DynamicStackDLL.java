package stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

// Dynamic stack using doubly linked-list
public class DynamicStackDLL<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<>();

    //  Create an empty stack
    public DynamicStackDLL() {
    }

    //  Create stack with an initial element
    public DynamicStackDLL(T element) {
        if (element == null) throw new IllegalArgumentException();
        list.push(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Push an element to the last, it doesn't allow pushin null elements.
     *
     * @param element which needs to be pushed
     */
    public void push(T element) {
        if (element == null) throw new IllegalArgumentException();
        list.addLast(element);
    }

    /**
     * Pop an element off the stack, in other words, remove the top element of stack.
     * @return the element which is popped out
     */
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    /**
     * Peek the top of the stack without removing an element
     * @return the element present at the top of stack
     */
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.peekLast();
    }

    //  Allows user to iterate through stack using an iterator
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
