package QueuePkg;

/**
 *
 * @author Danial
 */
public class Queue<T> {
    private int maxQueueSize = 999,
                front = -1, 
                rear = -1;
    private Object[] queueObj;
    //private int el;
    
    // constructor default
    public Queue() {
        this.queueObj = new Object[this.maxQueueSize];
    }
    
    // constructor if custom size
    public Queue(int size) {
        if (size > 0)
            this.maxQueueSize = size;
        this.queueObj = new Object[this.maxQueueSize];
    }
    
    public void setMaxQueueSize(int mqsInput) {
        this.maxQueueSize = mqsInput;
    }
    
    public void clear() {
        this.front = -1;
        this.rear = -1;
    }
    
    public boolean isEmpty() {
        return this.front == -1;
    }
    
    public boolean isFull() {
        return ((this.rear+1) % this.maxQueueSize) == this.front;
    }
    
    public T enqueue(T el) {
        if (isFull()) {
            System.out.print("Queue is full.");
            return null;
        }
        if (isEmpty())
            this.front = 0;
        this.rear = (this.rear+1) % maxQueueSize;
        this.queueObj[rear] = el;
        return el;
    }
    
    public T dequeue() {
        if (isEmpty()) 
            return null;
        T el = (T) this.queueObj[front];
        if (this.front == this.rear)
            this.clear();
        else
            this.front = (this.front+1) % maxQueueSize;
        return el;
    }
    
    public T peek() {
        if (isEmpty())
            return null;
        else
            return (T) this.queueObj[front];
    }
    
    public void displayQueue() {
        int i = this.front;
        if(this.isEmpty())
            System.out.print("Queue is empty.");
        
        else if(this.front == this.rear)
            System.out.println(this.queueObj[i]);
        
        else {
            do {
                if (this.queueObj[i] != null) {
                    System.out.print(this.queueObj[i] + ", ");
                i = (i+1) % this.maxQueueSize;
                }
            } while (i != this.rear);
            System.out.print(this.queueObj[rear]);
        }
    }
    
    
}
