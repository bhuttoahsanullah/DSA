public class PrintLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Class-level size
    public int size = 0;

    // Modified add method that returns the updated head
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

    // PrintList method
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
        }
        
    }

    public static void main(String[] args) {
        PrintLinkedList list = new PrintLinkedList();

        Node head = null;  // Initial head is null

        // Pass the head and get the updated head back
        head = list.add(head, 3);
        head = list.add(head, 4);
        head = list.add(head, 5);
        head = list.add(head, 6);

        list.PrintList(head);  // Print the list starting from the head

        list.RecrPrintList(head);

    }
}
