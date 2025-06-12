import java.util.Stack;
public class InfixToPrefix {
    public static String infixToPrefix(String sr) {
        int n = sr.length()-1; 
        String ans = "";
        int i = 0;
        String s = reverse(sr);
        Stack<Character> st = new Stack<>();
        while (i < n) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                ans += s.charAt(i);
            }
            else if (s.charAt(i) == '(') { //brackets should be converted (bug in this code)
                st.push(s.charAt(i));   
            }
            else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else if (s.charAt(i) == '^') {
                while (!st.isEmpty() && priority(s.charAt(i)) < priority(st.peek())) {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            else {
                while (!st.isEmpty() && priority(s.charAt(i)) < priority(st.peek())) {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        return reverse(ans);

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
    public static String reverse(String s){
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return new String(arr);
        
    }    public static void main(String[] args) {
        String ans = infixToPrefix("A+BC*F-D");
        System.out.println(ans);
    }
}
