import java.util.Arrays;

public class Task4 {

    public static boolean TwoSum(int arr[] , int n ){

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;

        while (left<=right) {
            int sum = arr[left] + arr[right];
            if (sum==n) {
                if (left!=right) {
                    return true;
                }
            }
            else if (sum<n) {
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }

        // // TwoSum function using binary search
        // public static boolean TwoSum(int arr[], int target) {
        //     // Loop through each element in the sorted array
        //     for (int i = 0; i < arr.length; i++) {
        //         int complement = target - arr[i];  // Find the complement
        //         // Perform binary search to find the complement in the 
        //         //subarray arr[i + 1] to arr[length - 1]
        //         if (binarySearch(arr, complement, i + 1, arr.length - 1)) {
        //             return true;  // If found, return true
        //         }
        //     }
        //     return false;  // Return false if no valid pair is found
        // }
    
        // // Binary search function to find a value in a sorted array between 
        // //the given left and right indices
        // public static boolean binarySearch(int[] arr, int target, int left, int right){
        //     while (left <= right) {
        //         int mid = (left + right)/2;
        //         // int mid = left + (right - left) / 2;
                
        //         // Check if the target is present at mid
        //         if (arr[mid] == target) {
        //             return true;  // Return true if the target is found
        //         }
        //         // If target is greater, ignore the left half
        //         else if (arr[mid] < target) {
        //             left = mid + 1;
        //         }
        //         // If target is smaller, ignore the right half
        //         else {
        //             right = mid - 1;
        //         }
        //     }
        //     return false;  // Return false if the target is not found
        // }
    
    
    public static void main(String[] args) {
        int arr [] ={2,3,4,5,6,7};
        int n = 10;
        System.out.println("Array : "+Arrays.toString(arr));

        System.out.println("Result : "+ TwoSum(arr, n));
    }
}



