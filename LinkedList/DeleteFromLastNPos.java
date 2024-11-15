//count the position from end to delete the node

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
    public void insertFirst(String data){
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
    public Node deleteEnd(int n){
        Node curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int indexToDelete = size - n;
        curr = head;
        int i=1;
        while(i<indexToDelete){
            curr = curr.next;
            i++;

        }
        curr.next = curr.next.next;
        return head;
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
        DeleteFromLastNPos del = new DeleteFromLastNPos();
        del.insertFirst("1");
        del.insertEnd("2");
        del.insertEnd("3");
        del.insertEnd("4");
        del.print();
        del.deleteEnd(1);
        System.out.println();
        del.print();

        
    }
}
