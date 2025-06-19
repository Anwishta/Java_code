import java.util.Stack;
public class MinStack {
    static Stack<int[]> st = new Stack<>();
    public static void push(int data){
        if (st.isEmpty()) {
            st.push(new int[]{data, data});
        }else{
            st.push(new int[]{data, Math.min(data, st.peek()[1])});
        }
    }

    public static void main(String[] args) {
        
    }
}
