// package Stack;
import java.util.Stack;
public class InfixToPostfix {
    public static String infixToPostfix(String s){
        int n = s.length(), i = 0;
        String ans = "";
        Stack<Character> st = new Stack<>();

        while (i < n) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i)) >= 'a' && (s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {     
                ans += s.charAt(i);
            }
            else if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')') {
                while (!st.empty() && st.peek() != '(') {
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            }else {
                while (!st.empty() && priority(s.charAt(i)) <= priority(st.peek())) {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while (!st.isEmpty()) {
            ans += st.peek();
            st.pop();
        }
        return ans;
    }
    public static int priority(char s){
        if (s == '^') {
            return 3;
        }
        else if (s == '*' || s == '/') {
            return 2;
        }else if (s == '+' || s == '-') {
            return 1;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        String ans = infixToPostfix("A+BC*F-D");
        System.out.println(ans);

    }
}
