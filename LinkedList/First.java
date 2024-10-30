public class First{
    private int size;
    First(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    public void insertFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertEnd(String data){
        Node currNode = head;
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
        }
        while(currNode.next != null){
            currNode = currNode.next;
        }
       currNode.next = newNode;

    }
    public void deleteBeg(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
    }
    public void deleteEnd(){
        Node lastNode = head.next;
        Node secondLast = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public void print(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is Empty!");
        }
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");

    }

    public static void main(String[] args) {
        First list = new First();
        list.insertFirst("this");
        list.insertEnd("is");
        list.insertFirst("Hi");
        list.insertEnd("list");
        list.print();
        System.out.println(list.getSize());
        list.deleteBeg();
        list.deleteEnd();
        list.print();
        System.out.println();
        System.out.println(list.getSize());
}
}
