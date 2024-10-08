
public class Task1 {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public static int size = 0;

    void addToFront(int data){
        Node node = new Node(data);

        node.next = head;
        head = node;
        size++;
     }

     void PrintList(){
        Node node = head;
        
        while (node!=null) {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println(" null ");

     }

   public int nthFromLast(int nth){
     
    if(head==null)
      {
          System.out.println("LIST_EMPTY");
          return -1;
      }

      Node temp = head;
      
      for (int i = 0; i < size-nth; i++) {
         temp = temp.next;
      }
      return temp.data;
  
   }

  

   public static void main(String[] args) {

    Task1 t1 = new Task1();
    
    t1.addToFront(50);
    t1.addToFront(40);
    t1.addToFront(30);
    t1.addToFront(20);
    t1.addToFront(10);
    // 4,3,6,2,1, null

    t1.PrintList();

    // nth node = 2
    int nth = 2;
    System.out.println("nth Node contains the data : "+t1.nthFromLast(nth));
    

    

      
   } 
}