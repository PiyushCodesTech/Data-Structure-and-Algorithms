/*
Modify the values of the first half of nodes such that 1st node's value is equal to the value of the
last nodes minus the first nodes current value. Then replace the second half of nodes with the initial
values of the first half nodes.
*/



// Defining the node class (This class is defined in traversalOnSinglyLL already)

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


public class modifyContentOfSinglyLL {

    // To print the linked list
    private void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }



    private Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private Node modifyList(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node secondHalf = mid.next;
        mid.next = null;

        secondHalf = reverse(secondHalf);

        Node curr1 = head;
        Node curr2 = secondHalf;

        while (curr2 != null){
            int x = curr1.data;
            curr1.data = curr2.data - x;
            curr2.data = x;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        mid.next = reverse(secondHalf);
        return head;
    }

    public static void main(String[]args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        modifyContentOfSinglyLL obj = new modifyContentOfSinglyLL();

        System.out.println("Original List:");
        obj.printList(head);

        head = obj.modifyList(head);

        System.out.println("Modified List:");
        obj.printList(head);

    }
}
