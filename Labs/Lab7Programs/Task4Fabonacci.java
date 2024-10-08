import java.util.Scanner;

public class Task4Fabonacci {
    
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

        // Measure time for Recursive Fibonacci (with print)
        long startTimeRecr = System.nanoTime();
        System.out.print("Recursive Fibonacci series: ");
        RecrFiboPrint(n, 0);  // Call the recursive printing method
        long endTimeRecr = System.nanoTime();
        long recrDuration = endTimeRecr - startTimeRecr;
        System.out.println();  

        // Measure time for Iterative Fibonacci
        long startTimeItr = System.nanoTime();
        System.out.print("Iterative Fibonacci series: ");
        ItrFibo(n);
        long endTimeItr = System.nanoTime();
        long itrDuration = endTimeItr - startTimeItr;
        System.out.println();
        
        // Convert nanoseconds to seconds
        double itrDurationSec = itrDuration / 1_000_000_000.0;
        double recrDurationSec = recrDuration / 1_000_000_000.0;

        // Time comparisons
        System.out.println("Recursive Fibonacci time: " + recrDuration + 
        " nanoseconds"+"( "+recrDurationSec+" Seconds)");
        
        System.out.println("Iterative Fibonacci time: " + itrDuration + 
        " nanoseconds"+"( "+itrDurationSec+" Seconds)");

        if (itrDuration < recrDuration) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }
        sc.close();
    }
}
