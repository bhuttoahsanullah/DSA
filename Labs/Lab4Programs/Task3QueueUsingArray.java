
public class Task3QueueUsingArray {
    
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;
 
    // Constructor to initialize queue
    Task3QueueUsingArray(int size){

        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }

    // Utility function to remove front element from the queue and check for Queue Underflow
    public int dequeue()
    {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int val = arr[rear++];
        count--;
        return val;
    }

    // Utility function to add an item to the queue and check for queue overflow
    public void enqueue(int data)
    {
        if (count<arr.length) {
            System.out.println("Inserting : "+data);
            arr[front++]= data;
            count++;
        }
    }

    // Utility function to return front element in the queue and check for Queue Underflow
    public int peek(){
        return arr[rear];
    }

    // Utility function to return the size of the queue
    public int size(){
        return count;
    }
    // Utility function to check if the queue is empty or not
    public Boolean isEmpty(){
        return count==0;
    }

    // Utility function to check if the queue is empty or not
    public Boolean isFull(){
        return count==arr.length;
    }

    public static void main (String[] args){

    // create a queue of capacity 5
        Task3QueueUsingArray q = new Task3QueueUsingArray(5);
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front element is : " + q.peek());
        System.out.println("Removing  : "+q.dequeue() );
        
        System.out.println("Front element is : " + q.peek());
        System.out.println("Queue size is    : " + q.size());
        
        System.out.println("Removing  : "+q.dequeue() );
        System.out.println("Removing  : "+q.dequeue() );
        
        if (q.isEmpty()){
            System.out.println("Queue Is Empty");
        }
        else{
            System.out.println("Queue Is Not Empty");
        }
    }
    
}