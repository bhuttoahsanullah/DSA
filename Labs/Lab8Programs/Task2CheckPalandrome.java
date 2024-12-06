package Lab8Programs;
public class Task2CheckPalandrome {
    public static boolean checkPalandrome(String s, int start,  int last){
        if (s.charAt(start)!=s.charAt(last)) {
            return false;
        }
        if (start>= last) {
            return true;
        }
        return checkPalandrome(s, start+1,  last-1);
    }
    public static void main(String[] args) {
    
        String s = "RaccaR";
        int start = 0;
        int last = s.length()-1;
        // int mid = s.length()/2;

        System.out.println(checkPalandrome(s, start,  last));

        
    }
}
