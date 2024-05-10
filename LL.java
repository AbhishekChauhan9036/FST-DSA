class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;

    public LinkedList1() {
        this.head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (head == null) {
            throw new IllegalStateException("Cannot pop from an empty list");
        }
        int poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    public void display() {
        Node current = head;
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }

    public void delete(int key) {
        Node current = head;
        Node prev = null;
        Node temp = head;
        for (; temp != null;) {
            if (temp.data == key) {
                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next
        }
        System.out.println("Key not found in the list.");
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        for (int i = 1; i <= 5; i++) {
            list.push(i);
        }

        System.out.println("Initial List:");
        list.display();

        for (int i = 1; i <= 3; i++) {
            int popped = list.pop();
            System.out.println("Popped element: " + popped);
        }

        System.out.println("List after popping:");
        list.display();
    }
}
