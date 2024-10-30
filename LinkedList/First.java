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
        System.out.println();
        list.deleteBeg();
        list.deleteEnd();
        list.print();
}
}
