package crackingthecodeinterview.LinkedList;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);

        printList(list.head);
        deleteMiddleNode(list.head.next.next.next);
        printList(list.head);

    }


    static void deleteMiddleNode(Node current) {

        current.data = current.next.data;
        current.next = current.next.next;

    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println("");

    }

}


