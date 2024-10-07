package Lab3Programs;

public class Task3LLCycleDetection {

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

    // Add node to the end (back) of the list
    public void addToBack(int data) {
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
    }

    // Add node to the front (beginning) of the list
    public void addToFront(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    // Add node at a specific index
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            addToFront(data);
            return;
        }

        Node node = new Node(data);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        node.next = current.next;
        current.next = node;
        size++;
    }

    // Remove node from the front (beginning) of the list
    public void removeFromFront() {
        if (head == null) return;

        head = head.next;
        size--;
    }

    // Remove node from the back (end) of the list
    public void removeFromBack() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    // Remove node at a specific index
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0) {
            removeFromFront();
        } else {
            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
            size--;
        }
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get the length of the list
    public int length() {
        return size;
    }

    // Search for a node with a specific data value
    public int search(int data) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Data not found
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Cycle detection method using Floyd's Cycle-Finding Algorithm
    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false; // No cycle in an empty list or a single-node list
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one step
            fast = fast.next.next;  // Move fast by two steps

            // If they meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        return false; // No cycle detected
    }

    public static void main(String[] args) {
        Task3LLCycleDetection sll = new Task3LLCycleDetection();

        // Add elements to the list
        sll.addToFront(1);
        sll.addToBack(2);
        sll.addToBack(3);
        sll.addToFront(4);

        // Print the list
        sll.printList();

        // Check if the list has a cycle (expected: false)
        System.out.println("Cycle detected? " + sll.hasCycle());

        // Create a cycle for testing
        sll.head.next.next.next = sll.head.next;  // Create a cycle

        // Check if the list has a cycle (expected: true)
        System.out.println("Cycle detected? " + sll.hasCycle());
    }
}
