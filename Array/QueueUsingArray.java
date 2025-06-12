package Array;
public class QueueUsingArray {
    static int q[] = new int[5];
    static int front = -1;
    static int rear = -1;

    public static void push(int data){
        if (rear >= size()) {
            return;
        }
        rear = (rear + 1) % q.length;
        q[rear] = data;
    }

    public static void pop(){
        if (front == -1 && rear == -1) {
            return;
        }

        for (int i = 0; i < rear; i++) {
            q[i] = q[i+1];
         }
         rear--;
    }

    public static int size(){
        return (rear+1) % q.length;
    }

    public static void main(String[] args) {
        push(10);
        push(23);
        push(44);
        push(66);
        pop();
        pop();
        System.out.println(size());
          for(int i=0; i<q.length; i++){
            System.out.println(q[i]);
        }
        // push(44);
        // push(55);
        //   for(int i=0; i<q.length; i++){
        //     System.out.println(q[i]);
        // }
        // System.out.println(size());
    }
}
