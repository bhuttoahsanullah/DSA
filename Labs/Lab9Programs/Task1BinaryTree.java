package Labs.Lab9Programs;

public class Task1BinaryTree {

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

    Task1BinaryTree(int data){
         root = new Node(data);
    }

    Task1BinaryTree(){
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

    // Method to search for a node
    public boolean searchNode(int data) {
        return searchNodeRecursive(root, data);
    }

    private boolean searchNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        return data < current.data
                ? searchNodeRecursive(current.left, data)
                : searchNodeRecursive(current.right, data);
    }

    public boolean searchBST(Node root, int data){
        if (root==null){
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (data<root.data) {
         return   searchBST(root.left, data);
        }
        else{
          return  searchBST(root.right, data);
        }
    }

    // Method to count the number of nodes
    public int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countOfNodes(root.left) + countOfNodes(root.right);
    }

    // Method to calculate the height of the tree
    public int height(Node root) {
        if (root == null) {
            return -1; 
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }


    public static void main(String[] args) {
        
        Task1BinaryTree tree = new Task1BinaryTree();
 
        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(3);
        tree.addNode(7);

         // Searching nodes
         System.out.println("Is 7 in the tree? " + tree.searchNode(7));
         System.out.println("Is 20 in the tree? " + tree.searchNode(20));
 
         // Counting nodes
         System.out.println("Number of nodes: " + tree.countOfNodes(tree.root)); 
 
         // Calculating height
         System.out.println("Height of tree: " + tree.height(tree.root)); 
        
    }
}