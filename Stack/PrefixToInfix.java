import java.util.Stack;

public class PrefixToInfix{
    public static String preToIn(String s){
        int i = s.length()-1;
        // String ans = "";
        Stack<String> st = new Stack<>();

        while(i >= 0){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String ans = "(" + t1 + s.charAt(i) + t2 + ")";
                st.push(ans);
            }
            i--;
        }
        return st.pop();
    }
    public static void main(String[] args){

    }
}