import java.util.Stack;

public class PostfixToPrefix{
    public static String preToIn(String s){
        int i = 0;
        // String ans = "";
        Stack<String> st = new Stack<>();

        while(i < s.length()){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String ans = t2 + t1 + s.charAt(i);
                st.push(ans);
            }
            i--;
        }
        return st.pop();
    }
    public static void main(String[] args){

    }
}