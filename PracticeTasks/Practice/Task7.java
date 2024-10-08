import java.util.Scanner;

public class Task7 {

    // Search in Array Using Iteration
    public static boolean itrSearch(int arr[],int num){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) {
                return true;
            }
        }
        return false;
    }

    // Search in Array Using Recursion
    public static boolean RecrSearch(int arr[], int num, int index){
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == num) {
            return true;
        }
        return RecrSearch(arr, num, index+1);
    }
    
    public static void main(String[] args) {
    
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();
        // int size =5;
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() *100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter any number to find : ");
        int numFind = sc.nextInt();
        System.out.println("Iterative Search : "+itrSearch(arr,numFind));
        System.out.println();
        System.out.println("Recursive Search : "+RecrSearch(arr, numFind, 0));

        sc.close();
 
    }
}
