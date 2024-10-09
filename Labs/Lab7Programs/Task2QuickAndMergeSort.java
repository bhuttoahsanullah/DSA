public class Task2QuickAndMergeSort {

    // Merge Sort Methods
    public static void spilit(int arr[], int stIdx,int endIdx){
        if (stIdx >= endIdx){
            return;
        }

        int mid = (stIdx + endIdx)/2;
        spilit(arr, stIdx, mid);
        spilit(arr, mid+1, endIdx);
        MergeSort(arr, stIdx,mid,endIdx);
    }

    public static void MergeSort(int arr[],int stIdx,int mid,int endIdx){
        int mergeSort[] = new int[endIdx-stIdx+1];
        int idx1 = stIdx;
        int idx2 = mid+1;
        int m = 0;
        
        while (idx1 <= mid && idx2 <= endIdx){
            if (arr[idx1] <= arr[idx2]){
                mergeSort[m++] = arr[idx1++];
            }else{
                mergeSort[m++] = arr[idx2++];
            }
        }

        while (idx1 <= mid){
            mergeSort[m++] = arr[idx1++];
        }

        while (idx2 <= endIdx){
            mergeSort[m++] = arr[idx2++];
        }

        for (int i = 0,j = stIdx; i <mergeSort.length ; i++,j++) {
            arr[j] = mergeSort[i];
        }
    }


    // Quick Sort Methods
    public static int partition(int arr[],int low,int high){
        int piviot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
        if (arr[j] < piviot){
        int temp = arr[++i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
        }
        int temp= arr[++i];
        arr[i] = piviot;
        arr[high] = temp;
        return i;
        }
        public static void quickSOrt(int arr[],int low, int high){
        if (low < high){
        int piidx = partition(arr, low, high);
        quickSOrt(arr, low, piidx-1);
        quickSOrt(arr, piidx+1,high);
        }
        }
    
    public static void main(String[] args) {
    
        // Array for Merge Sort
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length-1;
    
        System.out.println("This is Unsorted Array 1 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("This is Sorted Array 1 Using Merge Sort : ");
        spilit(arr,0,n);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        //Array for Quick Sort
        int arr2[] = {9,3,6,5,2,8};

        System.out.println("This is Unsorted Array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        System.out.println("This is Sorted Array 2 using Quick Sort : ");
        quickSOrt(arr2,0,arr2.length-1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    
}
