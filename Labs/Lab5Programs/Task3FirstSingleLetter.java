public class Task3FirstSingleLetter {
    
    public static char firstSingleLetter (char ch[], int size){
        
        for (int i = 0; i < size-1; i++) {
            int count = 1;
            for (int j = i+1; j < size; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count==1) {
                return ch[i];
            }
        }
        return ','; 
    } 
  
        
    public static void main(String[] args) {
        char ch[] ={'A','h','s','a','n'};
        System.out.println(firstSingleLetter(ch, ch.length));
    }
}
