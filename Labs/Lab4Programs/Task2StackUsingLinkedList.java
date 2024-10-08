
public class Task2StackUsingLinkedList {
    
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top; //head

    public Task2StackUsingLinkedList() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int data){
        Node node = new Node(data);

        if(top==null)
        {
            top=node;
        } // insert at the beginning
    
        System.out.println("Inserting : "+data);
        node.next = top; //head
        top = node;

    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty(){
        return top==null;
    }

    // Utility function to return top element in a stack
    public int top(){
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Utility function to pop top element from the stack and check for Stack underflow
    public int pop(){
        if(top==null)
        {
            return -1;
        } // remove at the beginning

        int k =top.data;
        top = top.next;

        return k;
    }

    public static void main(String[] args)
    {
        Task2StackUsingLinkedList stack = new Task2StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.top());
        System.out.println("Removing  : "+stack.pop() );
        System.out.println("Removing  : "+stack.pop() );
        System.out.println("Removing  : "+stack.pop() );
        
        if (stack.isEmpty()) {
        System.out.print("Stack is empty");
        } else {
        System.out.print("Stack is not empty");
        }
    }

}
