
//Defining a node class
class Node{
    int data;
    Node next;

    //Constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class traversalOnSinglyLL {
    private void printLinkedList(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data);

            if (curr.next != null){
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        traversalOnSinglyLL traverse = new traversalOnSinglyLL();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        traverse.printLinkedList(head);
    }

}
