class AVLTree {
    class Node {
        int key, height;
        Node left, right;

        Node(int key) {
            this.key = key;
            height = 1;
        }
    }

    private Node root;

    // Get height of the node
    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotation
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a node
    public Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL Rotation
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // RR Rotation
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // LR Rotation
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Rotation
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Find the node with the smallest value
    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Delete a node
    public Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else {
            // Node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = root.left != null ? root.left : root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                // Node with two children: Get inorder successor
                Node temp = minValueNode(root.right);

                // Copy inorder successor's data to this node
                root.key = temp.key;

                // Delete the inorder successor
                root.right = delete(root.right, temp.key);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        // LL Rotation
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // LR Rotation
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR Rotation
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // RL Rotation
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Pre-order traversal
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Driver code
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Pre-order traversal of AVL tree is:");
        tree.preOrder(tree.root);

        tree.root = tree.delete(tree.root, 50);

        System.out.println("\nPre-order traversal after deletion of 50:");
        tree.preOrder(tree.root);
    }
}
