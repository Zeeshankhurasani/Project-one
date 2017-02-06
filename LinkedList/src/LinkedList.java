
class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node) {
     //intialize prev , current and next to null
       Node prev = null; 
        Node current = node;
        Node next = null; 
     /*
     Below loop proform step as follow:
     
     After the first iteration of the loop, PrevNode points to the node containing element 1 and 
     CurrNode & NextNode points to the node containing element 2.And the node pointed by PrevNode gets unlinked.
     
     After the second iteration of the loop, PrevNode Points to the node containing element 2 and CurrNode &
     NextNode point to the node containing element 3. And the CurrNode next would be pointing to PrevNode.

     By the end of the iteration, PrevNode contains the reverse of the complete list.
     */
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(67);
        list.head.next = new Node(14);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(23);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head); // print given values
        System.out.println("\n");
        System.out.println("Reversed linked list ");
        list.printList(head); // Print reversed Values
    }
}
 
