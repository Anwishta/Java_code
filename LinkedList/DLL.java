class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DLL{
    Node head = null;
    Node tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }
    public void delete(int k){
        if(head == null || head.next == null){
            return;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                break;
            }
            temp = temp.next;
        }
        Node front = temp.prev;
        Node rear = temp.next;
        if (front == null && rear == null) {
            return;
        }
        else if (front == null) {
            head = temp.next;
            temp.next.prev = null;
            temp.next = null;

        }
        else if (rear == null) {
            front.next = null;
            front = null;
        }
        else{
            temp.next.prev = front;
            front.next = temp.next;
            temp.next = null;
            front = null;
        }

    }
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        DLL l = new DLL();
        l.add(12);
        l.add(13);
        l.add(13);
        l.add(13);
        l.add(14);
        l.print();
        System.err.println();
        l.delete(1);
        l.print();
    }
}