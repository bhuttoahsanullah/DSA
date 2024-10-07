import java.util.Arrays;

public class Task1InsertionANDSelectionSort {
    
    // Insertion Sort
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos]>arr[j]) {
                    minPos = j;
                }
            }
            
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        int arr1[] = {5,4,1,3,2};
        int arr2[] = {5,1,6,3,8};

        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
