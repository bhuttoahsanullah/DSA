public class Task6PrintLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int size = 0;

    public Node add(Node head, int data){
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
        return head;  // Returning the updated head
    }

    // Using Iteration 
    public void PrintList(Node head){
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Using recursive 
    public void RecrPrintList(Node head){
        Node temp = head;
        if (temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            RecrPrintList(temp);
        }else{
            System.out.println("null");            
        }
        
    }

    public static void main(String[] args) {
        Task6PrintLinkedList list = new Task6PrintLinkedList();

        Node head = null;  // Initial head is null

        // Pass the head and get the updated head back
        head = list.add(head, 3);
        head = list.add(head, 4);
        head = list.add(head, 5);
        head = list.add(head, 6);

        
        // Measure time for Recursive Print LinkedList 
        long startTimeRecr = System.nanoTime();
        list.RecrPrintList(head);
        long endTimeRecr = System.nanoTime();
        long recrDuration = endTimeRecr - startTimeRecr;
        System.out.println();  

        // Measure time for Iterative Print LinkedList
        long startTimeItr = System.nanoTime();
        list.PrintList(head);  // Print the list starting from the head
        long endTimeItr = System.nanoTime();
        long itrDuration = endTimeItr - startTimeItr;
        System.out.println();

        // Convert nanoseconds to seconds
        double itrDurationSec = itrDuration / 1_000_000_000.0;
        double recrDurationSec = recrDuration / 1_000_000_000.0;

        // Time comparisons
        System.out.println("Recursive Print LinkedList time: " + recrDuration + 
        " nanoseconds"+"( "+recrDurationSec+" Seconds)");
        
        System.out.println("Iterative Print LinkedList time: " + itrDuration + 
        " nanoseconds"+"( "+itrDurationSec+" Seconds)");

        System.out.println();
        if (itrDuration < recrDuration) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }

    }
}
