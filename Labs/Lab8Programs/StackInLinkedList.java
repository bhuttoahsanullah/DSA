package Lab8Programs;
public class StackInLinkedList {

    class Node{
        String data;
        Node Next;
        
        Node(String data){
        this.data = data;
        this.Next = null;
        }
    }

    private Node top;
    
    public StackInLinkedList(){
    this.top = null;
    }

    public void push(String data){
    
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

    public String top(){
        return top.data;
    }

    public String pop(){
        if (top == null){
        System.out.println("Stack is Empty");
        return null;
        }
        String temp = top.data;
        top = top.Next;
        return temp;
    }

    public  void printStack(){
        Node temp=top;
        while (temp!= null){
            System.out.print(temp.data+" ");
           temp=temp.Next;
        }
    }

    public void clear() {
        top = null;
    }

    public static void main(String[] args) {
    
        StackInLinkedList s1 = new StackInLinkedList();
        
        s1.push("1");
        s1.push("2");
        s1.push("3");
        
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