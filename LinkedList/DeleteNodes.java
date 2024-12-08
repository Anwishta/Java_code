public class DeleteNodes {
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
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
    public static void delete(String val){
        while(head != null && head.data == val){
            head = head.next;
        }
        if(head == null){
            return ;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            if (curr.data == val) {
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }

    }
   public static void main(String[] args) {
    DeleteNodes list = new DeleteNodes();
    list.insertFirst("7");
    list.insertFirst("9");
    list.insertFirst("7");
    list.insertFirst("7");
    list.insertFirst("9");
    Node temp = head;
    while (temp != null) {
        System.out.println(temp.data + " ");
        temp = temp.next;
    }
    list.delete("9");
    Node pointer = head;

    while (pointer != null) {
        System.out.println(pointer.data + " ");
        pointer = pointer.next;
    }
   } 
}
