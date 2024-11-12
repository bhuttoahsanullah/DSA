package Labs.Lab10Programs;
import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTreeLinkedList {

    // Node class representing each node in the tree
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root; // Root of the tree

    // Constructor
    public CompleteBinaryTreeLinkedList() {
        root = null;
    }

    // Method to add a node to the complete binary tree
    public void addNode(int data) {
        Node newNode = new Node(data);

        // If the tree is empty, make the new node the root
        if (root == null) {
            root = newNode;
            return;
        }

        // Create a Queue to perform level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Level-order traversal to find the first empty position
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // If the left child is empty, add the new node here
            if (current.left == null) {
                current.left = newNode;
                return;
            } 
            // If the right child is empty, add the new node here
            else if (current.right == null) {
                current.right = newNode;
                return;
            }
            
            else {
                queue.add(current.left);
                queue.add(current.right);
            }

        }
    }

    // Pre-Order Traversal
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In-Order Traversal
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Post-Order Traversal
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {
        CompleteBinaryTreeLinkedList tree = new CompleteBinaryTreeLinkedList();

        // Adding nodes to the tree
        tree.addNode(10);
        tree.addNode(20);
        tree.addNode(30);
        tree.addNode(40);
        tree.addNode(50);
        tree.addNode(60);

        System.out.println("Pre-Order Tree Traversal : ");
        tree.preOrder(tree.root);


    }
}