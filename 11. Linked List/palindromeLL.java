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


    public class palindromeLL {
        private Node getMidNode(Node head){
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }


        private boolean checkPalindrome(Node head){
            if (head == null || head.next == null){
                return true;
            }

            // Step 1:- Find the mid
            Node mid = getMidNode(head);

            // Step 2:- Reverse the linked list
            Node curr = mid;
            Node prev = null;
            Node next;

            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;
            Node left = head;

            while (right != null){
                if (left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        public static void  main(String[]args){
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);

            palindromeLL obj = new palindromeLL();

            boolean result = obj.checkPalindrome(head);

            if(result){
                System.out.println("The linked list is a palindrome.");
            } else {
                System.out.println("The linked list is NOT a palindrome.");
            }

        }
    }
