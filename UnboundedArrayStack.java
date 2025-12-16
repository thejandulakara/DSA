public class UnboundedArrayStack {

    private int[] stack;
    private int top;

    public UnboundedArrayStack() {
        stack = new int[2];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }
        stack[++top] = value;
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }

        int value = stack[top--];

        if (top > 0 && top == stack.length / 4) {
            resize(stack.length / 2);
        }

        return value;
    }

    // Resize stack
    private void resize(int newSize) {
        int[] newStack = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
}
