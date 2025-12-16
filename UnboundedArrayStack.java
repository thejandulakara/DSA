package dsa.stack;

public class UnboundedArrayStack {

    private int[] stack;
    private int top;

    public UnboundedArrayStack() {
        stack = new int[2];
        top = -1;
    }

   
    public void push(int x) {
        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }

        stack[++top] = x;
        System.out.println("Pushed: " + x);
    }

   
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = stack[top--];
        System.out.println("Popped: " + popped);

        if (top > 0 && top == stack.length / 4) {
            resize(stack.length / 2);
        }

        return popped;
    }

   
    private void resize(int newSize) {
        int[] newStack = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

   
    public void display() {
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

  
    public static void main(String[] args) {

        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.display();
    }
}
