public class RevList{
    private int size;
    RevList(){
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

    public void revListIterative(){
        if (head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            //update the nodes 
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }
    public Node revListRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newNode = revListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }
    public static void main(String[] args) {
        RevList list = new RevList();
        list.insertFirst("1");
        list.insertEnd("2");
        list.insertEnd("3");
        list.insertEnd("4");
        list.print();
        System.out.println();
        list.head = list.revListRecursive(list.head);
        list.print();
}
}

