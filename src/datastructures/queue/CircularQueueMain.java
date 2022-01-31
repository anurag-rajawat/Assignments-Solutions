package datastructures.queue;

import datastructures.queue.CircularQueue;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        for (int i = 1; i <= 10; i++) {
            queue.offer(i * i * i);
        }
        System.out.println("Size of queue is: " + queue.size());
        System.out.println(queue);
        System.out.println();
//        for (int i = 0; i <= queue.size(); i++) {
//            i = 0;
//            System.out.println(queue.poll());
//        }
        System.out.println();
        System.out.println(queue.poll());
        queue.offer(1111);

        System.out.println("Size of queue is: " + queue.size());
        System.out.println(queue);

        System.out.println();
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        queue.offer(123);
        System.out.println(queue);
    }
}
