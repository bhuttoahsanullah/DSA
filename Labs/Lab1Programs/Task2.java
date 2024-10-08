public class Task2 {

    public static void noDup(int TwoDArray[][], int OneDArray[]){

        int size = OneDArray.length;
        int index = 0; // The position to place the next unique element in OneDArray
        
        // Iterate through the 2D array
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                
                // Check if the element is already in OneDArray
                boolean isDuplicate = false;

                for (int k = 0; k < index; k++) {            
                    if (OneDArray[k] == TwoDArray[i][j]) {
                        size--;
                        isDuplicate = true;
                        break;
                    }
                }
                
                // If not a duplicate, add to OneDArray
                if (isDuplicate == false) {    
                        OneDArray[index++] = TwoDArray[i][j];
                }
            }
        }
        
        // Prints the 1D-Array 
        for (int i = 0; i < size; i++) {
            System.out.print(OneDArray[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        
        int TwoDArray[][] ={{1,2,3,4,5},{3,4,5,6,7},{5,6,7,8,9},{2,3,4,5,6}};

        int OneDArray[] = new int[20];

        noDup(TwoDArray, OneDArray);
        
    }
}
