package dsa.stackqueue;

import java.util.Stack;

public class StackQueueDequeueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void enqueue(int x) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(x);
        System.out.println("Enqueued: " + x);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }


    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int dequeued = s1.pop();
        System.out.println("Dequeued: " + dequeued);
        return dequeued;
    }


    public void display() {
        System.out.println("Queue elements: " + s1);
    }

    public static void main(String[] args) {

        StackQueueDequeueFriendly queue = new StackQueueDequeueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.display();
    }
}
