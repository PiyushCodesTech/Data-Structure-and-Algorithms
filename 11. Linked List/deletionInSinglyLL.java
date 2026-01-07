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

public class deletionInSinglyLL {

    private void printLinkedList(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data);

            if (curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }


    private Node deleteFirst(Node head){
        if (head == null){
            return null;
        }

        Node temp = head; // Store the head in temp variable
        head = head.next; // Make the next node new head
        temp.next = null; // Set the temp variable next to null nd java garbage colletor will delete it

        return head;
    }

    private Node deleteLast(Node head){
        if (head == null){
            return null;
        }

        Node curr = head;

        while(curr.next.next != null){
            curr = curr.next;
        }
        // Now curr have the value of the second last node
        curr.next = null;

        return head;
    }

    // Delete a node at a specific index
    private Node deleteAtIdx(Node head, int pos){
        Node temp = head;
        if (pos == 1){
            head = temp.next;
            return head;
        }

        Node prev =  null;
        for(int i = 1; i < pos; i++){
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return head;
        prev.next = temp.next;
        return head;
    }

    public static void  main(String [] args){
        Node head = new Node(11);
        head.next = new Node(12);
        head.next.next = new Node(13);
        head.next.next.next = new Node(14);
        head.next.next.next.next = new Node(15);
        head.next.next.next.next.next = new Node(16);

        deletionInSinglyLL obj = new deletionInSinglyLL();

        // Initial LL:- 11 → 12 → 13 → 14 → 15 → 16


        head = obj.deleteAtIdx(head, 5); // 11 → 12 → 13 → 14 → 16
        head = obj.deleteFirst(head);        // 12 → 13 → 14 → 16
        head = obj.deleteLast(head);         // 12 → 13 → 14

    }
}
