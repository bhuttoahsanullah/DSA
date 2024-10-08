package Lab3Programs;

public class Task1DoubleLinkedList {
    
    public class Node {
        String name;
        Node prev, next;

        public Node (String name){

            this.prev = null;
            this.next = null;
            this.name = name;
            }
            
        }

        static  Node head,tail;

        public boolean isEmpty()
        {
            return head==null;
        }
   
        // Add node with name in beginning of linkedlist, name as parameter
        public void insertAtBeginning(String name)
        {
            Node ne=new Node(name);
            if(head==null)
            {
                head=tail=ne;
                return;
            }
            ne.next=head;
            head.prev=ne;
            head=ne;

        }

        // Add node in beginning of linkedlist, node as parameter
        public void insertAtBeginning(Node node) {
            if (head == null) {
                head = tail = node;
                return;
            }
            node.next = head;
            head.prev = node;
            head = node;
        }
   
        // Add node in end of linkedlist, name as parameter
        public void insertAtEnd(String name)
        {
            Node ne=new Node(name);
            if(head==null)
            {
                head=tail=ne;
                return;
            }
            tail.next=ne;
            ne.prev=tail;
            tail=ne;

        }
        // Add node in end of linkedlist, node as parameter
        public void insertAtEnd(Node node) {
            if (head == null) {
                head = tail = node;
                return;
            }
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

          // Add node after a given node name
    public void insertAfterName(String name, Node node) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                node.next = current.next;
                node.prev = current;
                if (current.next != null) {
                    current.next.prev = node;
                } else {
                    tail = node; // Update tail if added at the end
                }
                current.next = node;
                return;
            }
            current = current.next;
        }
    }

    // Add node before a given node name
    public void insertBeforeName(String name, Node node) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                node.next = current;
                node.prev = current.prev;
                if (current.prev != null) {
                    current.prev.next = node;
                } else {
                    head = node; // Update head if added at the beginning
                }
                current.prev = node;
                return;
            }
            current = current.next;
        }
    }

    // Make the linked list circular
    public void makeCircular() {
        if (tail != null) {
            tail.next = head;
            head.prev = tail;
        }
    }

    // Print all nodes in the linked list, handling circular lists
    public void printAll() {
        Node current = head;
        if (current == null) {
            System.out.println("null");
            return;
        }

        do {
            System.out.print(current.name + " ");
            current = current.next;
        } while (current != null && current != head);

        if (tail.next == head) {
            System.out.print("(circular)");
        }

        System.out.println("null");
    }
   

    public static void main(String[] args) {

        Task1DoubleLinkedList dll = new Task1DoubleLinkedList();

        dll.insertAtBeginning("Ahsan");
        dll.printAll();
        System.out.println();

        dll.insertAtEnd("Ullah");
        dll.printAll();
        System.out.println();
        
        dll.insertAtBeginning("Bhutto");
        dll.printAll(); // Output: Bhutto Ahsan Ullah null
        System.out.println();
        
        dll.insertAfterName("Ahsan", dll.new Node("NewNode"));
        dll.printAll(); // Output: Bhutto Ahsan NewNode Ullah null
        System.out.println();
        
        dll.insertBeforeName("Bhutto", dll.new Node("StartNode"));
        dll.printAll(); // Output: StartNode Bhutto Ahsan NewNode Ullah null
        System.out.println();
        
        dll.makeCircular();
        dll.printAll(); // Should indicate circular linkage
        
    }    
}


