public class StackInLinkedList {

    class Node{
        int data;
        Node Next;
        
        Node(int data){
        this.data = data;
        this.Next = null;
        }
    }

    private Node top;
    
    public StackInLinkedList(){
    this.top = null;
    }

    public void push(int data){
    
        Node newNode = new Node(data);
        
        if (top == null){
            top = newNode;
            return;
        }
        newNode.Next = top;
        top = newNode;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int top(){
        return top.data;
    }

    public int pop(){
        if (top == null){
        System.out.println("Stack is Empty");
        return 0;
        }
        int temp = top.data;
        top = top.Next;
        return temp;
    }

    public static void main(String[] args) {
    
        StackInLinkedList s1 = new StackInLinkedList();
        
        s1.push(1);
        s1.push(2);
        s1.push(3);
        
        System.out.println("Top Element is "+ s1.top());
        
        s1.pop();
        s1.pop();
        s1.pop();
        
        if (s1.isEmpty()){
        System.out.println("Stack is Empty");
        }
        else{
        System.out.println("Stack is Not Empty ");
        }
    }
}