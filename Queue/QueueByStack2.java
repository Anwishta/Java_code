package Queue;

import java.util.Stack;

public class QueueByStack2 {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void push(int data){
        s1.push(data);
    }
    public static int deque(){
        if (!s2.isEmpty()) {
            return s2.pop();
        }
        else{
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
        }
       
    }
    public static int top(){
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        else{
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }
    public static void main(String[] args) {
        push(34);
        push(44);
        push(55);
        push(66);
        int size = s1.size();
        for (int i = 0; i < size; i++) {
            System.out.println(top());
            deque();
        }
    }
}
