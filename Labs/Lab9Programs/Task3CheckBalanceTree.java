package Labs.Lab9Programs;

public class Task3CheckBalanceTree {
    
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

    Task3CheckBalanceTree(int data){
         root = new Node(data);
    }

    Task3CheckBalanceTree(){
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

        // Method to calculate the height of the tree
        public int height(Node root) {
            if (root == null) {
                return -1; // height of an empty tree is -1
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
    
            return 1 + Math.max(leftHeight, rightHeight);
        }
    
        public boolean balancedTree(Node root){
            if (root == null){
                return false;
            }
            int left = height(root.left);
            int right = height(root.right);
            if ((left - right) == 1 || (left - right) == -1 || (left - right) == 0){
                return true;
            }else {
                return false;
            }
        }
    public static void main(String[] args) {
        Task3CheckBalanceTree t = new Task3CheckBalanceTree();
        
        t.addNode(10);
        t.addNode(5);
        t.addNode(15);
        t.addNode(3);
        t.addNode(7);

        System.out.println("Is tree is Balance : "+t.balancedTree(t.root));

    }
}
