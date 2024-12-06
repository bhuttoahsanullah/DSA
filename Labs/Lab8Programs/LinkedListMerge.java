package Lab8Programs;

public class LinkedListMerge {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeTwoSortedLists(Node l1, Node l2) {
        // Dummy node to simplify edge cases
        Node dummy = new Node(0);
        Node current = dummy;

        // Traverse both lists and append the smaller value to the merged list
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of either list (if any)
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Return the merged list, starting from the node after the dummy
        return dummy.next;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(5);

        Node mergedList = mergeTwoSortedLists(l1, l2);
        printList(mergedList); // Output: 1 1 3 3 5 5
    }
}
