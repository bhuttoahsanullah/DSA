
public class Task1and2SimpleRecursion {

    public static void NumInAscending(int n){
        if (n >= 1) {
            NumInAscending(n-1);
            System.out.print(n+" ");
        }
    }

    public static void NumInDescending(int n){
        if (n >= 1) {
            System.out.print(n+" ");
            NumInDescending(n-1);
        }
    }

    public static void CharInForward(char[] c, int index){
        if (index < c.length) {

            System.out.print(c[index]+" ");
            CharInForward(c, index+1);
        }
    }

    public static void CharInReverse(char[] c, int index){
        if (index >=0 ) {
            System.out.print(c[index]+" ");
            CharInReverse(c, index-1);
        }
    }

    public static void main(String[] args) {

        NumInAscending(5);
        System.out.println();
        
        NumInDescending(5);
        
        char[] c = {'a','b','c','d'};
        
        System.out.println();
        CharInForward(c, 0);
        System.out.println();

        CharInReverse(c, c.length-1);
        System.out.println();
    
    }
    
}