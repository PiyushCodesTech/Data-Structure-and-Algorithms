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

public class reverseSinglyLL {

    private void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    private Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void  main(String[]args){
        Node head = new Node(11);
        head.next = new Node(21);
        head.next.next = new Node(31);
        head.next.next.next = new Node(41);
        head.next.next.next.next = new Node(51);
        head.next.next.next.next.next = new Node(61);

        reverseSinglyLL obj = new reverseSinglyLL();

        head = obj.reverseList(head);
        obj.printList(head);
    }
}
