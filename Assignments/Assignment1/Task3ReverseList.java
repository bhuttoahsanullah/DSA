public class Task3ReverseList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head, tail;    
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

    
     public void reverseList(){
        if(head==null)
      {
          System.out.println("LIST_EMPTY");
          return;
      }
  

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
     }

     public static void main(String[] args) {
        Task3ReverseList t3 = new Task3ReverseList();

        t3.addToFront(50);
        t3.addToFront(40);
        t3.addToFront(30);
        t3.addToFront(20);
        t3.addToFront(10);
        t3.PrintList();

        t3.reverseList();
        t3.PrintList();
    
     }
}
