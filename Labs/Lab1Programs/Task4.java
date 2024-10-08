public class Task4 {

        public static void extractBoundaries (int arr[][]){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {

                    if (i==0|| j==0 || i==arr.length-1 || j==arr[0].length-1 ) {
                        System.out.print(arr[i][j]+" ");
                    }
                    else{
                        System.out.print("  ");
                    }            
                }
                System.out.println();
            }
        }

        public static void cropCenterPart (int arr[][]){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {

                    if (i==0|| j==0 || i==arr.length-1 || j==arr[0].length-1 ) {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print(arr[i][j]+ " ");
                    }
                    
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        
        int TwoDArray[][] ={{1,2,3,4},{3,4,5,6},{5,6,7,8},{2,3,4,5}};

        System.out.println("Extracting and Printing the Boundaries from the array");
        extractBoundaries(TwoDArray);
        System.out.println();
        System.out.println();

        System.out.println("Extracting and Printing the Center part from the array");
        cropCenterPart(TwoDArray);


    }
}
