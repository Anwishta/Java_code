public class SumOfLL {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
         this.val = val; 
        }
      ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; }
  }
 

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to simplify result list creation
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null) {
            // Get the current values, defaulting to 0 if the node is null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum and carry
            int sum = x + y + carry;
            carry = sum / 10;

            // Create a new node for the current digit and move the pointer
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Advance the pointers in l1 and l2 if possible
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Handle the final carry, if any
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node of dummyHead (skipping the dummy node)
        return dummyHead.next;
    }
}


