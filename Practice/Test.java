// Recursion Example 1
public class Test {
    public static void test(int n){
        if(n>0){
            System.out.println(n);
            test(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        
        test(4);
    }
}
