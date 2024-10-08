
public class Task5QueueUsingTwoStacks extends StackInLinkedList {
    
    private StackInLinkedList s1, s2;
    
    Task5QueueUsingTwoStacks(){
        s1 = new StackInLinkedList();
        s2 = new StackInLinkedList();
    }

    // Enqueue an item to the queue
    public void enqueue(int data) {
        s1.push(data);
    }   

    // Dequeue an item from the queue
    public int dequeue() {
        // If both stacks are empty, the queue is empty
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;  // or throw an exception
        }
        
        // If s2 is empty, move all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop the top element from s2
        return s2.pop();
    }

    public static void main(String[] args) {
        Task5QueueUsingTwoStacks q = new Task5QueueUsingTwoStacks();

        q.enqueue(1);
        q.enqueue(2);

        System.out.println(q.dequeue()); // prints 1
        System.out.println(q.dequeue()); // prints 2

        // Test dequeue on empty queue
        System.out.println(q.dequeue()); // prints "Queue is empty" and returns -1
    }
}
