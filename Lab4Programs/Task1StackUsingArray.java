
public class Task1StackUsingArray {
    
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Task1StackUsingArray(int size){

        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack and check for stack overflow
    public void push(int data)
    {
        if (top==capacity) {
            System.out.println("Stack is Full");
            return;
        }
        System.out.println("Inserting : "+ data);
        arr[++top] = data;
    }
    
    // Utility function to pop top element from the stack and check for stack underflow
    public int pop()
    {
        if (top==-1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        capacity--;
        return arr[top--];

    }

    // Utility function to return top element in a stack
    public int top()
    {
        return arr[top];
    }
    
    // Utility function to return the size of the stack
    public int size()
    {
        return capacity;
    }

    // Utility function to check if the stack is empty or not 
    public Boolean isEmpty()
    {
        if (top==-1) {
            return true;
        }
        return false;
    }
    
    // Utility function to check if the stack is full or not
    public Boolean isFull()
    {
        if (top==capacity) {
            return true;
        }
        return false;
    }

    public static void main (String[] args)
    {
        Task1StackUsingArray stack = new Task1StackUsingArray(3);

        stack.push(1); // Inserting 1 in the stack
        stack.push(2); // Inserting 2 in the stack
        System.out.println("Removing  : "+stack.pop() ); // removing the top 2
        System.out.println("Removing  : "+stack.pop() ); // removing the top 1
        stack.push(3); // Inserting 3 in the stack 

        System.out.println("Top element is : " + stack.top());
        System.out.println("Stack size is  : " + stack.size());

        System.out.println("Removing   : "+stack.pop() ); // removing the top 3 

        // check if stack is empty
        if (stack.isEmpty()){
            System.out.println("Stack Is Empty");
        }
        else{
            System.out.println("Stack Is Not Empty");
        }
 
    }


}
