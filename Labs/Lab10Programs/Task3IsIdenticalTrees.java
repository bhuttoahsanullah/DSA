package Lab10Programs;

public class Task3IsIdenticalTrees {
    
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

 
    public static boolean isIdentical(Node x, Node y) {
        if (x == null && y == null) {
            return true;
        }

        if (x == null || y == null) {
            return false;
        }

        if (x.data!=y.data) {
            return false;
        }

        return  isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
    }

    public static void main(String[] args) {

        // Create tree1
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        // Create tree2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        boolean result = isIdentical(root, root2);
        System.out.println("Are trees identical? " + result);
    }
}

