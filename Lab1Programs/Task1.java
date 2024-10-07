public class Task1 {

    public static void EvenOdd(int arr[]){
        
        int arr2[] = new int[arr.length];
        int j = -1;

        // To Store the Odd Numbers from the left side of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
            arr2[++j] = arr[i];
            }
        }

        // To Store the Even Numbers from the Right side of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                arr2[++j] = arr[i];
            }
        }

        // To print the final array in Even odd Format
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9 };

        EvenOdd(arr);
        
    }
}