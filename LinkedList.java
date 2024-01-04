import java.io.*;
import java.util.*;
class Node{
    int value;
    Node next;
    public Node(int value){
        this.value=value;
        this.next=null;
    }
}

public class LinkedList{
    private Node head;
    private int size;

    public LinkedList(){
        this.head=null;
        this.size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public void prepend(int value){
        Node node=new Node(value);
        if(isEmpty()){
            head=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }

    public void append(int value){
        Node node=new Node(value);
        if(isEmpty()){
            head=node;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=node;
        }
        size++;
    }

    public int removeValue(int value){
        if(isEmpty()){
            return -1;
        }

        if(head.value==value){
            head=head.next;
            size--;
            return value;
        }else{
            Node prev=head;
            while(prev.next!=null && prev.next.value!=value){
                prev=prev.next;
            }
            if(prev.next!=null){
                Node removeNode=prev.next;
                prev.next=removeNode.next;
                size--;
                return value;
            }
            return -1;
        }

    }

    public int search(int value){
        if(isEmpty()){
            return -1;
        }
        int i=0;
        Node curr=head;
        while(curr!=null){
            if(curr.value==value){
                return i;
            }
            curr=curr.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=prev;
        }
        head=prev;
    }

    public void insert(int value,int index){
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            prepend(value);
        }else{
            Node node = new Node(value);
            Node prev=head;
            for(int i=0;i<index-1;i++){
                prev=prev.next;
            }
            node.next=prev.next;
            prev.next=node;
            size++;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            Node curr=head;
            StringBuilder list=new StringBuilder();
            while(curr!=null){
                list.append(curr.value).append("->");
                curr= curr.next;
            }
            System.out.println(list);
        }
    }

    public static void main(String... args){
        LinkedList l1=new LinkedList();
        l1.prepend(1);
        l1.prepend(2);
        l1.append(3);
        l1.append(4);
        // System.out.println(l1.search(8));
        // l1.print();
        // l1.removeValue(3);
        // l1.print();
        // l1.reverse();
        l1.print();
        l1.insert(10,2);
        l1.print();
        System.out.println(l1.getSize());

    }
}