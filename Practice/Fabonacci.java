import java.util.Scanner;

public class Fabonacci {
    
    // Recursive Fibonacci that prints values
    public static void RecrFiboPrint(int n, int current) {
        if (current >= n) {
            return;
        }
        System.out.print(RecrFibo(current) + " ");

        RecrFiboPrint(n, current + 1);
    }

    // Recursive Fabonacci that gives value
    public static int RecrFibo(int n){
        if (n==0 || n==1) {
            return n;
        }
        return RecrFibo(n-1)+RecrFibo(n-2);        
    }

    // Iterative fabonacci
    public static void ItrFibo(int n){
        int one = 0, two =1;
        // Handle edge cases
        if (n >= 1) {
            System.out.print(one + " ");
        }
        if (n >= 2) {
            System.out.print(two + " ");
        }

        for (int i = 2; i < n; i++) {
            int result = one + two;
            System.out.print(result + " ");
            one = two;
            two = result;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        
        System.out.println("\nRecursive Fibonacci : ");
        RecrFiboPrint(n, 0);
        System.out.println();
        System.out.println("Iterative Fibonacci : ");
        ItrFibo(n);

    }
}
