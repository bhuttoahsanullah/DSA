public class SumofN {
    
    public static int sumofn(int n){
        if (n==1) {
            return n;
        }
        return n+ sumofn(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumofn(4));
    }
}
