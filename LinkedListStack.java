package dsa.stack;

public class LinkedListStack {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;

    
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = top.data;
        top = top.next;
        System.out.println("Popped: " + popped);
        return popped;
    }

    
    public void display() {
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.display();
    }
}
 {
    
}
