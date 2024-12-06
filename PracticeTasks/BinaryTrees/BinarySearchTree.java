package BinaryTrees;

public class BinarySearchTree {

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Pre-Order Traversal
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In-Order Traversal
    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    // Post-Order Traversal
    public static void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static boolean search(Node root, int key) {
        // O(Height) or O(H) >- Time Complexity
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }

    }

    // public static boolean delete(Node root, int key){
    // if (root == null) {
    // return false;
    // }
    // if (key < root.data) {
    // return delete(root.left, key);
    // }
    // else if (key > root.data) {
    // return delete(root.right, key);
    // }
    // else{
    // if (root.left!= null && root.right == null) {
    // root = root.left;
    // root.left =null;
    // return true;
    // }
    // else if (root.left== null && root.right != null) {
    // root = root.right;
    // root.right = null;
    // return true;
    // }
    // else{
    // int small = smallest(root.right);
    // root.data = small;
    // return delete(root.right, small);

    // }
    // }
    // }

    public static Node delete(Node root, int key) {
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            }

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static int smallest(Node root) {
        if (root.left == null) {
            return root.data;
        }
        return smallest(root.left);
    }

    public static int greatest(Node root) {
        if (root.right == null) {
            return root.data;
        }
        return smallest(root.right);
    }

    public static void main(String[] args) {

        Node root = null;
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 7);

        InOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println(search(root, 5));

        System.out.println(smallest(root));
        System.out.println(greatest(root));

        Node root1 = null;
        root1 = insert(root1, 8);
        root1 = insert(root1, 5);
        root1 = insert(root1, 3);
        root1 = insert(root1, 1);
        root1 = insert(root1, 4);
        root1 = insert(root1, 6);
        root1 = insert(root1, 10);
        root1 = insert(root1, 11);
        root1 = insert(root1, 14);

        InOrder(root1);
        System.out.println();
        root1 = delete(root1, 5);
        System.out.println();
        InOrder(root1);
    }
}
