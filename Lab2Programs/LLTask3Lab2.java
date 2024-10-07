public class LLTask3Lab2 implements List {

    class Node {
        int data;
        Node next;

        // Constructor for data node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        // Constructor for dummy node
        public Node(Node next) {
              // Dummy node has default value
            this.next = null;
        }
    }

    public Node head;
    public int size;

    public LLTask3Lab2() {
        head = new Node(null);  // Dummy node as the head
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addToFront(int data) {
        Node node = new Node(data);

        node.next = head.next; // Insert after dummy node
        head.next = node;
        size++;
    }

    public void addToBack(int data) {
        Node newNode = new Node(data);
        
        Node temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        size++;
    }

    public void addAt(int index, int data) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void removeAt(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    public void remove(int data) {
        Node temp = head;

        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
    }

    public LLTask3Lab2 duplicate() {
        LLTask3Lab2 newList = new LLTask3Lab2();
        Node temp = head.next;  // Skip dummy node

        while (temp != null) {
            newList.addToBack(temp.data);
            temp = temp.next;
        }

        return newList;
    }

    public LLTask3Lab2 duplicateReversed() {
        LLTask3Lab2 reversedList = new LLTask3Lab2();
        Node temp = head.next;  // Skip dummy node

        while (temp != null) {
            reversedList.addToFront(temp.data);
            temp = temp.next;
        }

        return reversedList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ size: ").append(size).append(" - ");
        Node temp = head.next;  // Skip dummy node

        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }

        sb.append(" ]");
        return sb.toString();
    }

    public static void main(String[] args) {
        LLTask3Lab2 ll = new LLTask3Lab2();

        ll.addToBack(5);
        ll.addToBack(9);
        System.out.println(ll);  // Should print: [ size: 2 - 5, 9 ]

        ll.addAt(1, 2);
        ll.addAt(1, 3);
        System.out.println(ll);  // Should print: [ size: 4 - 3, 2, 5, 9 ]

        ll.removeAt(2);
        System.out.println(ll);  // Should print: [ size: 3 - 3, 5, 9 ]

        LLTask3Lab2 duplicatedList = ll.duplicate();
        System.out.println(duplicatedList);  // Should print the same list

        LLTask3Lab2 reversedList = ll.duplicateReversed();
        System.out.println(reversedList);  // Should print reversed list
    }
}
