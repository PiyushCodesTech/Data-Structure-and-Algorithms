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

public class mergeSortOnLL {

    private Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node left, Node right){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (left != null && right != null){
            if (left.data <= right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }

        }
        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    private Node mergeSort(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node mid = findMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    private void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[]args){
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        mergeSortOnLL obj = new mergeSortOnLL();

        System.out.println("Original List:");
        obj.printList(head);

        head = obj.mergeSort(head);

        System.out.println("Sorted List:");
        obj.printList(head);

    }
}
