class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        size++;
    }

    public void insert(int value, int index) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            prepend(value);
        } else {
            Node node = new Node(value);
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    public int removeFrom(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            removedNode = prev.next;
            prev.next = removedNode.next;
        }
        size--;
        return removedNode.value;
    }

    public int removeValue(int value) {
        if (isEmpty()) {
            return -1;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return value;
        } else {
            Node prev = head;
            while (prev.next != null && prev.next.value != value) {
                prev = prev.next;
            }
            if (prev.next != null) {
                Node removedNode = prev.next;
                prev.next = removedNode.next;
                size--;
                return value;
            }
            return -1;
        }
    }

    public int search(int value) {
        if (isEmpty()) {
            return -1;
        }
        int i = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.value == value) {
                return i;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node curr = head;
            StringBuilder list = new StringBuilder();
            while (curr != null) {
                list.append(curr.value).append("->");
                curr = curr.next;
            }
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        System.out.println(l.isEmpty());
        l.append(50);
        l.prepend(20);
        l.append(80);
        l.insert(60, 2);
        System.out.println(l.getSize());
        l.print();
        l.reverse();
        l.print();
        System.out.println(l.search(60));
        l.removeFrom(4);
        System.out.println(l.getSize());
        l.print();
        l.removeValue(80);
        l.print();
        System.out.println(l.getSize());
        l.print();
    }
}
