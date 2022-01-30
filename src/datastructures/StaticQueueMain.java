package datastructures;

public class StaticQueueMain {
    public static void main(String[] args) {
        StaticQueue queue = new StaticQueue();
        for (int i = 1; i <= 10; i++) {
            queue.offer(i * i);
        }

        System.out.println(queue);
        System.out.println(queue.size());

        System.out.println(queue.poll());
        System.out.println(queue.size());

        System.out.println(queue);
    }
}
