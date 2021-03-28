package Labor6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private int capacity;

    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }
    public boolean isFull(){
        if(capacity==size()-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(Object elem){
        if(isFull()==false){
            add(elem);
        }
        else{
            return;
        }
    }
    public void pop(){
        if(isEmpty()==false){
            remove(size()-1);
        }
        else{
            return;
        }
    }
    public Object top(){
        if(isEmpty()==false){
            return get(size()-1);
        }
        else{
            return null;
        }
    }
    public int getSize(){
        return size();
    }
}
