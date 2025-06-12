import java.util.Stack;
public class PostfixToInfix {
    public static String postfixToInfix(String s){
        Stack<String> st = new Stack<>();
        int i = 0;
        int n = s.length();

        while (i < n) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                st.push(String.valueOf(s.charAt(i)));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                String res = "(" + t2 + s.charAt(i) + t1 + ")";
                st.push(res);
            }
            i++;
        }
        return st.pop();
    }
    public static void main(String[] args) {
        
    }
}
