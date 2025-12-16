package dsa.stackqueue;

import java.util.Stack;

public class StackQueueEnqueueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

   
    public void enqueue(int x) {
        s1.push(x);
        System.out.println("Enqueued: " + x);
    }

   
    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        int dequeued = s2.pop();
        System.out.println("Dequeued: " + dequeued);
        return dequeued;
    }

   
    public void display() {
        System.out.println("Queue elements: " + s2);
    }

   
    public static void main(String[] args) {

        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.display();
    }
}
