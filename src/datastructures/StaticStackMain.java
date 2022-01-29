package datastructures;

public class StaticStackMain {
    public static void main(String[] args) {
        StaticStack stack = new StaticStack();
        StaticStack stack2 = new StaticStack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i*2);
        }
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack2.size());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.isFull());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        stack2.push(2);
        stack2.push(2);
        stack2.push(2);
        stack2.push(2);

        System.out.println(stack2.size());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.isFull());
        System.out.println(stack);
        System.out.println(stack2);
        System.out.println(stack.peek());
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());


    }
}
