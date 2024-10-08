package Labs.Lab8Programs;

public class Task1DecimalToBinary {

    public static String decimalToBinary(int n){
       
         if (n==1) {
            return "1";
        }
        return decimalToBinary(n/2) + (n%2);
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(4));
        
    }
    
}