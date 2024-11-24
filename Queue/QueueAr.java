package Queue;

public class QueueAr {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear =  -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == arr.length-1;
        }
        public static void enqueue(int data){
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int deque(){
            if (isEmpty()) {
                System.out.println("Queue is empty!! Nothing to remove...");
                return -1;
            }
            int front = arr[0];
            
            for(int i =0; i<rear; i++){
                arr[i] =arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.deque();
        }
    }

}
