public class QueueUsingStacks  extends StackInLinkedList{

    private StackInLinkedList s1, s2;

    QueueUsingStacks(){
        s1 = new StackInLinkedList();
        s2 = new StackInLinkedList();
    }

    public void enqueue(int data){
        s1.push(data);
    }

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

        // Return the top element from s2
        return s2.pop();
    }

    public static void main(String[] args) {
        
        QueueUsingStacks q1 = new QueueUsingStacks();
        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
            
    }
}
