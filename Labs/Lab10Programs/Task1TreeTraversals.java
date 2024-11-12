package Labs.Lab10Programs;

import java.util.LinkedList;
import java.util.Queue;

public class Task1TreeTraversals {
    
    public class Node {
    
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
        
    }

    Node root;
    Task1TreeTraversals(int data){
        root = new Node(data);
    }

    Task1TreeTraversals(){
        root = null;
    }
    
    // Method to add a node
    public void addNode(int data) {
        root = addNodeRecursive(root, data);
    }

    private Node addNodeRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addNodeRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addNodeRecursive(current.right, data);
        } // duplicates are ignored

        return current;
    }

    // Pre-Order Traversal
    public void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    // In-Order Traversal
    public void InOrder(Node root){
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");        
        InOrder(root.right);
    }

    public void PostOrder(Node root){
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");        
        
    }

    public void LevelOrder(Node root){
        if (root!=null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node l = q.remove();
                System.out.print(l.data+" ");

                if (l.left!=null) {
                    q.add(l.left);
                }
                if (l.right!=null) {
                    q.add(l.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Task1TreeTraversals tree = new Task1TreeTraversals();

        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(3);
        tree.addNode(7);

        System.out.println("Pre-Order Tree Traversal : ");
        tree.preOrder(tree.root);

        System.out.println("\nIn-Order Tree Traversal : ");
        tree.InOrder(tree.root);
        
        System.out.println("\nPost-Order Tree Traversal : ");
        tree.PostOrder(tree.root);

        System.out.println("\nLevel-Order Tree Traversal : ");
        tree.LevelOrder(tree.root);

    }
}
