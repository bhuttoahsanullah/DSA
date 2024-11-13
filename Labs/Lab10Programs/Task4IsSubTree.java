package Labs.Lab10Programs;

public class Task4IsSubTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public  Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     public static boolean isIdentical(Node x, Node y) {
        if (x == null && y == null) {
            return true;
        }

        if (x == null || y == null ||x.data!=y.data) {
            return false;
        }

        // if (x.data!=y.data) {
        //     return false;
        // }

        return  isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
    }

    public static boolean isSubTree(Node x, Node y){
        if (x == null) {
            return false;
        }
        if (x.data == y.data) {
            if (isIdentical(x, y)) {
                return true;
            }
        }

        return isSubTree(x.left, y) || isSubTree(x.right, y);
    }
    
    public static void main(String[] args) {
        
        // Create Tree 1
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);

        // Create tree2
        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5);
        
        System.out.println("IsSubTree : "+ isSubTree(root, root2));

    }
}