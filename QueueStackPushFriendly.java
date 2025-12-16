package dsa.queuestack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushFriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    
    public void push(int x) {
        q1.add(x);
        System.out.println("Pushed: " + x);
    }

    
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int popped = q1.remove();
        System.out.println("Popped: " + popped);

      
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    
    public void display() {
        System.out.println("Stack elements: " + q1);
    }

    
    public static void main(String[] args) {

        QueueStackPushFriendly stack = new QueueStackPushFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.display();
    }
}
