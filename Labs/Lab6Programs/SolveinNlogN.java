import java.util.Arrays;

public class SolveinNlogN {

    void TwoSum(int[] arr, int k){
        Arrays.sort(arr);         
        
        for(int i=0; i<arr.length;i++){
            int y = (arr.length-i)/2;
            if(arr[i] + arr[y] != k){
                // if middle and first sum is not k then find from left or right
                if(arr[i]+arr[y] < k){//for right
                    for(int j=y; j<arr.length;  j++){
            
                        if (arr[i]+arr[j]==k) {
                            System.out.println("Yes "+ arr[i] + " and "+ arr[j] + " of TwoSum is " + k );
                            return; 
                        }
                    }
                }

                else{ // for left
                    for(int a=0; a<y; a++){
                        if (arr[i]+arr[a]==k) {
                            System.out.println("Yes "+ arr[i] + " and "+arr[ a] + " of TwoSum is " + k );
                        return;      
                        }        
                    }       
                }   
            }

            else{//if middle and first sum is k then find from left or right
                System.out.println("Yes "+ arr[i] + " and "+ arr[y] + " of TwoSum is " + k );
                return ;
            }   
        }
    }                                                                

    
    public static void main(String[] args) {

        SolveinNlogN ln=new SolveinNlogN();

        int[] arr = {3,1,6,8,5,5};
        int k=10;
    
        ln.TwoSum(arr,k);

    }
    
}
