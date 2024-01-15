public class Queue {
    private int[] items;
    private int maxSize;
    private int front;
    private int rear;

    public Queue() {
        this.maxSize = 10;
        this.items = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    // add element to the queue
    public void enqueue(int element) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            items[rear] = element;
        } else {
            System.out.println("Queue is full." + element);
        }
    }

    // remove element from the queue
    public int dequeue() {
        if (!isEmpty()) {
            int removedElement = items[front];
            front = (front + 1) % maxSize;
            return removedElement;
        } else {
            System.out.println("Queue is empty.");
            return -1; // Assuming -1 as a default value for an empty queue
        }
    }

    // view the front element
    public int peek() {
        if (!isEmpty()) {
            return items[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Assuming -1 as a default value for an empty queue
        }
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return (rear + 1) % maxSize == front;
    }

    // check if the queue is full
    public boolean isFull() {
        return (rear + 2) % maxSize == front;
    }

    // the size of the queue
    public int size() {
        return (maxSize + rear - front) % maxSize + 1;
    }

    // empty the queue
    public void clear() {
        front = 0;
        rear = -1;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.enqueue(9);

        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.items[(queue.front + i) % queue.maxSize] + " ");
        }
        System.out.println();

        System.out.println("Is the queue full? " + queue.isFull());

        queue.dequeue();
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.items[(queue.front + i) % queue.maxSize] + " ");
        }
        System.out.println();

        System.out.println("Front element: " + queue.peek());

        System.out.println("Is the queue empty? " + queue.isEmpty());

        System.out.println("Queue size: " + queue.size());

        queue.clear();
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.items[(queue.front + i) % queue.maxSize] + " ");
        }
        System.out.println();

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
