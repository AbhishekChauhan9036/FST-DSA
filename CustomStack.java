import java.util.*;
public class CustomStack{
    private Stack<Integer>items;
    public CustomStack(){
        this.items=new Stack<>();
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public void push(int element){
        items.push(element);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return items.pop();
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return items.peek();
    }

    public int size(){
        return items.size();
    }

    public void print(){
        System.out.println(items.toString());
    }

    public static void main(String... args){
            CustomStack stack=new CustomStack();
            // System.out.println(stack.isEmpty());
            stack.push(10);
            stack.push(20);
            // stack.print();
            // stack.pop();
            System.out.println(stack.peek());
             System.out.println(stack.size());
            stack.print();
    }
}