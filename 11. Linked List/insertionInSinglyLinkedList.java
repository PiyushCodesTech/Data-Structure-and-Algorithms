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

public class insertionInSinglyLinkedList {

    // Print the linked list
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

    //Insert the node at the beginning
    private Node insertFirst(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    //Insert the node at last
    private Node insertLast(Node head, int data){
        if (head == null){
            return null;
        }

        Node newNode = new Node(data);
        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    //Insert the node at the specific position
    private Node insertAtIdx(Node head, int data, int pos){
        if(head == null){
            return new Node(data);
        }

        Node newNode = new Node(data);
        Node curr = head;


        for (int i = 1; i<pos-1; i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }


    public static void main(String[] args){
        insertionInSinglyLinkedList ll = new insertionInSinglyLinkedList();
        Node head = new Node(5);

        head = ll.insertFirst(head, 4);
        head = ll.insertFirst(head, 3);
        head = ll.insertFirst(head, 2);
        head = ll.insertFirst(head, 1);

        head = ll.insertLast(head, 6);

        head = ll.insertAtIdx(head, 48, 4);

        ll.printLinkedList(head);
    }
}
