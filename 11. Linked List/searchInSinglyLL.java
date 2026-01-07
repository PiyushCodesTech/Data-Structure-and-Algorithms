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

public class searchInSinglyLL {

    //To check if the key is present in the linked list
    private boolean searchKey(Node head, int key){
        // We will be using a recursive approach

        if (head == null){
            return false;
        }

        if (head.data == key){
            return true;
        }
        return searchKey(head.next, key);
    }

    // To get the index of the key in the linked list
    private int getIndex(Node head, int key, int idx){
        if (head == null){
            return -1; // Key does not exist
        }

        if (head.data == key){
            return idx;
        }

        return getIndex(head.next, key, idx+1);
    }

    public static void main(String []args){

        // Create linked list: 2 -> 4 -> 6 -> 8 -> 10
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(10);

        searchInSinglyLL obj = new searchInSinglyLL();

        int key = 8;
        boolean found = obj.searchKey(head, key);
        int res = obj.getIndex(head, key, 1);

        if (found) {
            System.out.println("Key: " + key + " found in the list at index " + res);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
}
