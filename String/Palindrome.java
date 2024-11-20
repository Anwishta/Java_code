package String;

import java.util.LinkedList;
public class Palindrome {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public Node add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        return head;
    }
    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public Node reverse(Node head) {
        Node prev = head;
        Node curr = head.next;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Boolean palindrome(Node list) {
        if (head == null || head.next == null) {
            return true;
        }
        Node middle = findMiddle(head);
        Node secondHalfFirst = reverse(middle.next);
        Node firstHalfFirst = head;
        middle.next = null;
        while(secondHalfFirst != null){
            if(secondHalfFirst.data != firstHalfFirst.data){
                return false;
            }
            secondHalfFirst = secondHalfFirst.next;
            firstHalfFirst = firstHalfFirst.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome list = new Palindrome();
        list.add("m");
        list.add("a");
        list.add("d");  
        list.add("a");
        list.add("m");
        boolean res1 = list.palindrome(list.head);
        System.out.println(res1);
    }
}
