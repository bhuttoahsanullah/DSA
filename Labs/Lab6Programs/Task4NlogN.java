import java.util.Arrays;

public class Task4NlogN {
    
    public static boolean TwoSum(int arr[], int target) {
    
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];  // Find the complement

            if (binarySearch(arr, complement, i + 1, arr.length - 1)) {
                return true;  // If found, return true
            }
        }
        return false;  // Return false if no valid pair is found
    }

    public static boolean binarySearch(int[] arr, int target, int left, int right){
        while (left <= right) {
            int mid = (left + right)/2;
            
            if (arr[mid] == target) {
                return true;  
            }

            else if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return false;  // Return false if the target is not found
    }

    public static void main(String[] args) {
    
        int arr [] ={2,3,1,5,4,7};
        int n = 10;
        Arrays.sort(arr);
        System.out.println("Array : "+Arrays.toString(arr));

        System.out.println("Result : "+ TwoSum(arr, n));

    }
}
