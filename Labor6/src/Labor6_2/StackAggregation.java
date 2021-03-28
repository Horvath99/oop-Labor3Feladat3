package Labor6_2;

import java.util.ArrayList;

public class StackAggregation  {
    private int capacity;
    private ArrayList<Object> items=new ArrayList<>();

    public StackAggregation(int capacity) {
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

    public void push(Object elem){
        if(isFull()==false){
            items.add(elem);
        }
        else{
            return;
        }
    }
    public void pop(){
        if(isEmpty()==false){
            items.remove(items.size()-1);
        }
        else{
            return;
        }
    }
    public Object top(){
        if(isEmpty()==false){
            return items.get(items.size()-1);
        }
        else{
            return null;
        }
    }
    public int getSize(){
        return items.size();
    }
}
