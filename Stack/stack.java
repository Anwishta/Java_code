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
            return head == null;
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
        public static String pop(){
            if(isEmpty()){
                return "Empty";
            }
            String data = head.data;
            head = head.next;
            return data;
        }
        public static String peek(){
            if(isEmpty()){
                return "Empty";
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        impleStack s = new impleStack();
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }

    }
}
