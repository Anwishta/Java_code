public class stack {
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            next = null;
        }
    }
    static Node head = null;
    static class impleStack{
        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
        public static void push(String data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
    }
    public static void main(String[] args) {
        
    }
}
