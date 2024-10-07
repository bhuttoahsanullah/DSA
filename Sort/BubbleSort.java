
public class BubbleSort {

    public static int[]  bubbleSort(int arr[]){
        
        boolean b ;

        for (int i = 0; i < arr.length; i++) {
            b = false;  // Reset the flag at the start of each outer loop iteration
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    b = true;  // Set the flag if a swap is made
                }
            }
            // If no swaps were made, the array is already sorted
            if (!b) {
                break;
            }
        }
        return arr;    }
    public static void main(String[] args) {
    
        int arr[] = {2,1,3,4,5};

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}