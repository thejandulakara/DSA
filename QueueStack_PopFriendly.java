package dsa.queuestack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopFriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

   
    public void push(int x) {

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1.add(x);
        System.out.println("Pushed: " + x);

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

   
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = q1.remove();
        System.out.println("Popped: " + popped);
        return popped;
    }

   
    public void display() {
        System.out.println("Stack elements: " + q1);
    }

    
    public static void main(String[] args) {

        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.push(9);
        stack.display();
    }
}
