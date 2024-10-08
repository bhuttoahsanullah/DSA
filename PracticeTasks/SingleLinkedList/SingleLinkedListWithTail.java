public class SingleLinkedListWithTail {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size = 0;

    public void addToBack(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;  
        } else {
            tail.next = node;  
            tail = node;  
        }
        size++;
    }

    public void addToFront(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;  
        } else {
            node.next = head;
            head = node; 
        }
        size++;
    }

    public void removeFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;  // If the list is now empty, reset the tail as well
        }
    }

    // Remove from the back (less efficient in singly linked list)
    public void removeFromBack() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;  // If there was only one node, reset both head and tail
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;  // Find the second-last node
            }
            current.next = null;
            tail = current;  // Update the tail to the second-last node
        }
        size--;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SingleLinkedListWithTail sll = new SingleLinkedListWithTail();

        sll.addToFront(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToFront(4);

        sll.printList();  // Output: 4 -> 1 -> 2 -> 3 -> null
        System.out.println("Size : " + sll.getSize());  // Output: Size: 4

        sll.removeFromBack();
        sll.printList();  // Output: 4 -> 1 -> 2 -> null
        sll.removeFromFront();
        sll.printList();  // Output: 1 -> 2 -> null
    }
}
