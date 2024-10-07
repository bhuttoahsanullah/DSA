
public class LinkedList  {
    
   class Node{

      int data;
      Node next;
  
      //Constructor
      public Node(int data){
          this.data = data;
          this.next = null;
          
      }
     
  }


  
   Node head;
  public static int size;

     void addToBack(int data){

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

     void PrintList(){
        Node node = head.next;
        
        while (node!=null) {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println(" null ");

     }


     void addToFront(int data){
        Node node = new Node(data);

        node.next = head;
        head = node;
        size++;
     }


     void addMiddle(int index, int data){
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


     void removeFromFront(){

        head = head.next;
        size--;
     }

     void removeFromBack(){

        Node n = head;

        while (n.next!=null) {
            n = n.next;
            n.next = null;
        }
        size--;
     }


     void removeAt(int index){
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

     boolean isEmpty(){

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

     public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        
        ll.addToBack(5);
        ll.addToBack(9);

        ll.PrintList();
        System.out.println("Size: "+ size);

        ll.addToFront(2);
        ll.addToFront(3);
        ll.PrintList();
        System.out.println("Size: "+ size);

        ll.removeFromFront();
        ll.PrintList();
        System.out.println("Size: "+ size);

        ll.removeFromBack();
        ll.PrintList();


        System.out.println(ll.isEmpty()); 
       
        ll.addMiddle(1, 3);
        ll.PrintList();

        ll.removeAt(1);
        ll.PrintList();

        System.out.println(ll.Length());

        System.out.println("Index: "+ll.search(5));

     }
}
