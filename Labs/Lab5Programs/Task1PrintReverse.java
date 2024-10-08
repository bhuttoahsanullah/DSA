/*1. Print in reverse order: You are asked to design a method in linked list to 
print data in reverse order. You don’t need to reverse linked list permanently.
Public void printReverse()
 */
public class Task1PrintReverse {
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
    

        public void printReverse(){
            if(head==null){
              System.out.println("LIST_EMPTY");
              return;
            }

            Task1PrintReverse T = new Task1PrintReverse();
            Node temp= head;

            while (temp!=null) {
                T.addToFront(temp.data);
                temp = temp.next;
            }
            T.PrintList();
        }

    
         public static void main(String[] args) {
            Task1PrintReverse t1 = new Task1PrintReverse();
    
            t1.addToFront(50);
            t1.addToFront(40);
            t1.addToFront(30);
            t1.addToFront(20);
            t1.addToFront(10);
            t1.PrintList();

            t1.printReverse();
            t1.PrintList();
    }
}
    
