package Labs.Lab9Programs;

public class Task2MinAndMax {
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

    Task2MinAndMax(int data){
         root = new Node(data);
    }

    Task2MinAndMax(){
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

        // Min and Max Numbers
    // Method to find the minimum value in the binary tree
    public int minNumber() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return minNumberRecursive(root);
    }

    private int minNumberRecursive(Node node) {
        if (node.left == null) {
            return node.data;
        }
        return minNumberRecursive(node.left);
    }

    // Method to find the maximum value in the binary tree
    public int maxNumber() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return maxNumberRecursive(root);
    }

    private int maxNumberRecursive(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return maxNumberRecursive(node.right);
    }

    public static void main(String[] args) {
        Task2MinAndMax t = new Task2MinAndMax();

        t.addNode(10);
        t.addNode(5);
        t.addNode(15);
        t.addNode(3);
        t.addNode(7);

        System.out.println("Minimum Number : "+t.minNumber());
        System.out.println("Maximum Number : "+t.maxNumber());
        
    }
}
