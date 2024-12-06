package Lab8Programs;
// Complete Single Linked List Code without Tail.
public class SingleLinkedListWOtail {

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public Node head;
    public int size = 0;

    public void addToBack(int data){

        Node node = new Node(data);

        if (head == null) {
           head= node ;
           size++;
        }
        else{
            Node temp = head;

            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;

        }
    }

    public void addToFront(int data){
        Node node = new Node(data);

        node.next = head;
        head = node;
        size++;
    }

    public void addAtIndex(int index, int data){
        if (index < 1 || index > size + 1) {
           throw new IndexOutOfBoundsException("Index out of bounds");
        }
          Node node = new Node(data);
  
          node.data = data;
          node.next = null;
  
          Node n = head;
  
          for (int i = 1; i < index-1; i++) {      
              n = n.next;
          }
  
          node.next = n.next;
          n.next = node;
          size++;
    }
  

    public void removeFromFront(){

        head = head.next;
        size--;
    }

    public void removeFromBack(){

        Node n = head;

        while (n.next!=null) {
            n = n.next;
            n.next = null;
        }
        size--;
    }

    public void removeAt(int index){
        if (index < 1 || index > size) {
           throw new IndexOutOfBoundsException("Index out of bounds");
        }
          if(index ==0){
              removeFromFront();
            }
            else{
              Node n = head;
              Node temp=null;
   
              for(int i=1;i<index-1;i++)
              {
                      n=n.next;
              }
                  temp=n.next;
                  n.next=temp.next;
                  size--;
            }
    }
  

    public boolean isEmpty(){

        return head==null;
    }


    public int Length(){
        return size;
    }

    public int search(int data){
        int index=0;

        if(head.data==data){
            return index;
        }
        else{
            Node node = head;

            while (node.data!=data) {
                node = node.next;
                index++;

            }
        }
        return index;
    }

    public void PrintList(){
        if (head==null) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        
        SingleLinkedListWOtail SLL = new SingleLinkedListWOtail();

        SLL.addToFront(1);
        SLL.addToBack(2);
        SLL.addToBack(3);
        SLL.addToFront(4);
        SLL.PrintList();
        System.out.println("Linked List Size : "+SLL.Length());
        System.out.println();

        SLL.addAtIndex(2, 5);
        SLL.PrintList();
        System.out.println("isEmpty : "+SLL.isEmpty());

        SLL.removeFromBack();
        SLL.PrintList();
        SLL.removeFromFront();
        SLL.PrintList();
        SLL.removeAt(0);
        SLL.PrintList();

        System.out.println("Search Element at index : "+SLL.search(2));
        System.out.println();
        SLL.PrintList();
    }
}
