public class Task2SingleLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public Task2SingleLinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void sort() {
        // Case-1: If list is empty, return
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }

        // Case-2: Sort the list by swapping nodes
        boolean swapped;
        Node current;
        Node prev = null;

        // Outer loop to control the number of passes
        do {
            swapped = false;
            current = head;

            // Inner loop to compare and swap nodes
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swapping nodes
                    Node temp = current.next;
                    current.next = temp.next;
                    temp.next = current;

                    // Update the previous node's next to point to the new first node
                    if (prev == null) {
                        head = temp;
                    } else {
                        prev.next = temp;
                    }

                    // Mark that a swap has been done
                    swapped = true;

                    // Update prev to the current node
                    prev = temp;
                } else {
                    // Move to the next node
                    prev = current;
                    current = current.next;
                }
            }
            // Reset prev to null for the next pass
            prev = null;
        } while (swapped);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Task2SingleLinkedList list = new Task2SingleLinkedList();
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);

        System.out.println("Original list:");
        list.printList();

        list.sort();

        System.out.println("Sorted list:");
        list.printList();
    }
}
