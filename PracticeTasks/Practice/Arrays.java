public class Arrays {

    //1. Find the sum of all elements in an array.
    public static void Sum(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of All Elements in Array: "+sum);
    }

    //2. Find the largest element in an array.
    public static void largest(int arr[]){
        int larg = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>larg) {
                larg = arr[i];
            }
        }
        System.out.println("Largest Element : "+larg);
    }

    //3. Find the smallest element in an array.
    public static void Smallest(int arr[]){
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest Element : "+small);
    }

    //4. Reverse the elements of an array.
    public static void reverse(int arr[]){
        int last = arr.length-1;
        int mid = last/2;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last--] =temp;
        }
    }

    // Print Array
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    //5. Check if an array is sorted in ascending order.
    public static boolean checkSort(int arr[]){
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (small<arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] ={2,3,1,5,7,8,9};
        int arr1[] ={1,2,3,4,5};

        Sum(arr);

        largest(arr);
        Smallest(arr);

        reverse(arr);
        printArray(arr);

        System.out.println("Check Sort : "+ checkSort(arr1));
    }
}