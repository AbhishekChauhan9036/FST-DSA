import java.util.Stack;

public class CustomStack {
    private Stack<Integer> items;

    public CustomStack() {
        this.items = new Stack<>();
    }

    public void push(int element) {
        items.push(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return items.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return items.peek();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void print() {
        System.out.println(items.toString());
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        System.out.println(stack.isEmpty());
        stack.push(20);
        stack.push(10);
        stack.push(30);
        System.out.println(stack.size());
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.print();
    }
}
