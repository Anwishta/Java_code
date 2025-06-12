public class StackUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static Node head = null;
    static void push(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    static void pop(){
        if (isEmpty()) {
            System.out.println("Underflow!!");
            return;
        }
        head = head.next;
    }
    static int peek(){
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return head.data;
    }
    static boolean isEmpty(){
        return head == null;
    }
    public static void main(String[] args) {
        
    }
}
