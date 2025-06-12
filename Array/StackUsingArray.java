package Array;

public class StackUsingArray {
    static int stack[] = new int[5];
    static int top = -1;
    public static void push(int data){
        if (size() <= top) {
            System.out.println("Stack overflow!!");
            return;
        }
        top++;
        stack[top] = data;
    }
    public static void pop(){
        if (top == -1) {
            System.out.println("Stack underflow!!");
        }
        top--;
    }
    public static int size(){
        return top+1;
    }
    public static int peek(){
        if (top == -1) {
            System.out.println("Stack Underflow!!");
            return -1;
        }
        return stack[top];
    }
    public static void main(String[] args) {
        push(10);
        push(11);
        push(23);
        push(12);
        
        // System.out.println(size());
        // System.out.println(peek());
        // for(int i=0; i<stack.length; i++){
        //     System.out.println(stack[i]);
        // }
        pop();
        pop();
        push(44);
        push(55);
          for(int i=0; i<stack.length; i++){
            System.out.println(stack[i]);
        }
        System.out.println(size());

    }

}
