public class DeleteFromLastNPos {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertFirst(){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertEnd(String data){
        Node currNode = head;
        Node newNode = new Node(data);
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void deleteEnd(int n){
        Node curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int indexToDelete = size - n;
        curr = head;
        while(i<size){
            curr = curr.next;

        }
        curr.next = curr.next.next;
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
        
    }
}
