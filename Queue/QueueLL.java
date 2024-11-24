package Queue;

import Queue.QueueLL.Node.QueueOps;

public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
        static class QueueOps{
            static Node head = null;
            static Node tail = null;
            public static boolean isEmpty(){
                return tail == null && head == null;
            }
            public static void enqueue(int data){
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = tail = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;
            }

            public static int deque(){
                if(isEmpty()){
                    System.out.println("Empty queue");
                    return -1;
                }
                int data = head.data;
                head = head.next;
                return data;
            }
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
    }
    public static void main(String[] args) {
        QueueOps q = new QueueOps();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.deque();
        }
    }
}
