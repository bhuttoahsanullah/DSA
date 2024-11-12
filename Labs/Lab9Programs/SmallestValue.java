package Labs.Lab9Programs;

public class SmallestValue {
    
    public int smallest(Node root){
        if (root.left==null ) {
            return root.data;
        }
        return smallest(root.left);
    }

    public static void main(String[] args) {
        
    }
}
