package datastructures;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackLL<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<>();

    //  Create an empty stack
    public StackLL() {
    }

    //  Create stack with an initial element
    public StackLL(T element) {
        list.push(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    //  Push an element to last
    public void push(T element) {
        list.addLast(element);
    }

    //  Pop an element off the stack
    public void pop() {
        if (isEmpty()) throw new EmptyStackException();
        list.removeLast();
    }

    //   Peek the top of the stack without removing an element
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
