package Labor10_4;

import java.util.ArrayList;

public class Stack {
    private int capacity;
    private ArrayList<Object> items=new ArrayList<>();

    public Stack(int capacity) {
        this.capacity = capacity;
    }
    public boolean isFull(){
        if(capacity==items.size()-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(items.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(Object elem) throws StackException {
        if(isFull()==true){
            throw new StackException("Stack is full");
        }
        items.add(elem);

    }
    public void pop() throws StackException {
        if(isEmpty()==true){
            throw new StackException("Stack is empty");
        }
        items.remove(items.size()-1);
    }
    public Object top() throws StackException {
        if(isEmpty()==false){
            return items.get(items.size()-1);
        }
        else{

            throw new StackException("Stack is empty");
        }
    }
    public int getSize(){
        return items.size();
    }
}
