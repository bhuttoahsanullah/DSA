
public class Task4QueueUsingLinkedList {
    
    class Node{

        int data; // integer data
        Node next; // pointer to the next node
       
        public Node(int data){
        // set the data in allocated node and return the node
        this.data = data;
        this.next = null;
        }
    }

    private static Node rear = null, front = null;

    // Utility function to remove front element from the queue and check for Queue Underflow
    
    public int dequeue() {// delete at the beginning
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1; // or you can throw an exception
        }

        int data = front.data;
        front = front.next;
    
        if (front == null) {
            rear = null; // if queue becomes empty
        }

        return data;
    }    

    // Utility function to add an item in the queue
    // insertion at the end
    public void enqueue(int data) {
        Node node = new Node(data);

        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        System.out.println("Inserting : "+data);
    }

    // Utility function to return top element in a queue
     public int peek() {
        if (!isEmpty()) {
            return front.data;
        } else {
            System.out.println("Queue is empty");
            return -1; // or you can throw an exception
        }
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args){

        Task4QueueUsingLinkedList q = new Task4QueueUsingLinkedList();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("Front element is : "+ q.peek());
        
        System.out.println("Removing  : "+q.dequeue() );
        System.out.println("Removing  : "+q.dequeue() );
        System.out.println("Removing  : "+q.dequeue() );
        System.out.println("Removing  : "+q.dequeue() );
        
        if (q.isEmpty()) {
        System.out.println("Queue is empty");
        } else {
        System.out.println("Queue is not empty");
        }
    }

}
