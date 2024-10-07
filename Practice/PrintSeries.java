public class PrintSeries {

    public static void printSeries(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i - 1 + " ");  // For odd places print odd numbers
            } else {
                System.out.print(i + 1 + " ");  // For even places print even numbers
            }   
        }

    }
    public static void main(String[] args) {
        int n = 10;  // Length of series or number of terms you want to print
        
        printSeries(n);
    }
}
