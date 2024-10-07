import java.util.Scanner;

public class Task5Factorial {

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
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

    
        // Measure time for Recursive Factorial
        long startTimeRecr = System.nanoTime();
        System.out.println("Recursive Factorial : "+RecrFact(n));
        long endTimeRecr = System.nanoTime();
        long recrDuration = endTimeRecr - startTimeRecr;
        System.out.println();  

        // Measure time for Iterative Factorial
        long startTimeItr = System.nanoTime();
        System.out.println("Iterative Factorial : "+ itrFact(n));
        long endTimeItr = System.nanoTime();
        long itrDuration = endTimeItr - startTimeItr;
        System.out.println();
        
        // Convert nanoseconds to seconds
        double itrDurationSec = itrDuration / 1_000_000_000.0;
        double recrDurationSec = recrDuration / 1_000_000_000.0;

        // Time comparisons
        System.out.println("Recursive Factorial time: " + recrDuration + 
        " nanoseconds"+"( "+recrDurationSec+" Seconds)");
        
        System.out.println("Iterative Factorial time: " + itrDuration + 
        " nanoseconds"+"( "+itrDurationSec+" Seconds)");

        if (itrDuration < recrDuration) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }


        sc.close();
    }
    
}