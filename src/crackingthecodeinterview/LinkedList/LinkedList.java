package crackingthecodeinterview.LinkedList;


public class LinkedList {

    Node head;


    void append(int data) {

        if (head == null) {
            head = new Node(data);
            return;
        } else {
            Node current = head;
            while (current.next != null) {

                current = current.next;
            }
            current.next = new Node(data);

        }
    }

     void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println("");

    }

}
