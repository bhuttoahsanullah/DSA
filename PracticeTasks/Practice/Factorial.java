public class Factorial {

    // Recursive Factorial
    public static int RecrFact(int n){
        if (n==0 || n==1) {
            return 1;
        }else{
            return n*RecrFact(n-1);
        }
    }

    // Iterative Factorial
    public static int itrFact(int n){
        int result = 1;
        while (n>0) {
            result*=n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
    
        System.out.println("Iterative Factorial : "+ itrFact(4));
        System.out.println("Recursive Factorial : "+RecrFact(4));
    
    }
    
}