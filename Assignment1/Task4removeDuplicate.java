public class Task4removeDuplicate {
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

     void removeDuplicate(){
        if(head==null){
            System.out.println("LIST_EMPTY");
            return;
        }

        Node current = head;

        while (current!=null) {
            Node n = current;
            while (n.next!=null) {
                if (n.next.data==current.data) {
                    n.next = n.next.next;
                }
                else{
                    n = n.next;
                }
            }
            current = current.next;
        }
     }

     public static void main(String[] args) {
        Task4removeDuplicate t4 = new Task4removeDuplicate();

        t4.addToFront(3);
        t4.addToFront(5);
        t4.addToFront(4);
        t4.addToFront(1);
        t4.addToFront(2);
        t4.addToFront(5);
        t4.addToFront(4);
        t4.addToFront(3);
        t4.addToFront(5);
    
        t4.PrintList();     //5 -> 3 -> 4 -> 5 -> 2 -> 1 -> 4 -> 5 -> 3

        t4.removeDuplicate();
        t4.PrintList();    //5 -> 3 -> 4 -> 2 -> 1 ->  null 

     }
}
