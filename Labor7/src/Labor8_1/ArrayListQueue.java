package Labor8_1;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items=new ArrayList<>();
    private int CAPACITY;
    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }
    public boolean isEmpty(){
        if(items.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(items.size()==CAPACITY){
            return true;
        }
        else{
            return false;
        }
    }
    public void enQueue(Object obj){
        if(isFull()==true){
            return;
        }
        items.add(obj);
    }
    public Object deQueue(){
        if(isEmpty()==true){
            System.out.println("Ures");
        }
        Object element;
        element=items.get(items.size()-1);
        items.remove(items.size()-1);
        return element;
    }
    public void printQueue(){
        System.out.print("Queue:");
           for(Object ob:items){
               System.out.print(ob+" ");
           }
        System.out.println();
    }
}
