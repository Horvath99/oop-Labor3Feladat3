package Labor8_1;

public class CircularQueue implements IQueue{
        private int CAPACITY;
        private Object items[];
        private int front=-1,rear=-1;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items =new Object[CAPACITY];
    }
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element
    public void enQueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % CAPACITY;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % CAPACITY;
            }
            return (element);
        }
    }

    public void printQueue() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.print("Items -> ");
            for (i = front; i != rear; i = (i + 1) % CAPACITY)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }
}
