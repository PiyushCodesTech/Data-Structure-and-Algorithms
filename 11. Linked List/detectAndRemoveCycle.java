/*  ---------------------------------------------------------------------------------------------
   class Node{
       int data;
       Node next;

       public Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   --------------------------------------------------------------------------------------------------------
   */

// This algorithm is also called Floyd's cycle detection algorithm

public class detectAndRemoveCycle {
    private Node removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle){
            slow = head;
            Node prev = null;

            while (slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        detectAndRemoveCycle obj = new detectAndRemoveCycle();
        head = obj.removeCycle(head);

        // Print list after cycle removal
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;

        }
    }
}
