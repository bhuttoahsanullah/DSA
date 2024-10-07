import java.util.Stack;

public class Task4InfixToPostfix {

    public static int prec(char c){
        if (c=='^') {
            return 3;
        }else if (c == '*' || c == '/') {
            return 2;
        }else if (c == '+' || c == '-') {
            return 1;
        }
        return -1;
    }
    
    public static StringBuilder infixToPostfix(String infix){
        Stack<Character> s = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if ( (ch>=0 && ch<=9) || (ch>='a' && ch<='z')|| (ch >='A' && ch <='Z')) {
             
                postfix.append(ch);
            }else{             
                if (s.isEmpty()) {
                   s.push(ch);
                }
                else{
                    while (!s.isEmpty() && prec(s.peek()) >= prec(ch)) {
                        postfix.append(s.pop());
                    }
                    s.push(ch);
                }

            }
        }
        while (!s.isEmpty()){
            postfix.append(s.pop());
            }
            return postfix;
    }
    public static void main(String[] args) {
        String s = "A+B*C+D";
        System.out.println(infixToPostfix(s));

    }
}
