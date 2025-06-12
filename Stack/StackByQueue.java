import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
    static Queue<Integer> s = new LinkedList<>();
    public static void push(int data){
        int n =  s.size(); //0, 1, 2
        s.add(data); //   55, 33, 22
        for (int i = 0; i < n; i++) {
            s.add(s.remove());
        }
    }
    public static int pop(){
        if (s.size() == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return s.remove();
    }
    public static void main(String[] args) {
        push(34);
        push(55);
        push(44);
        push(77);
        int size = s.size();
        for (int i = 0; i < size; i++) {
            System.out.println(pop());
            
        }
        // System.out.println(pop());
        // push(45);
        // for (int i = 0; i < size; i++) {
        //     System.out.println(pop());
            
        // }
        
        // System.out.println(pop());
    }
}
