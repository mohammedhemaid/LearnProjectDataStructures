package crackingthecodeinterview.linked;


import linkedlist.LinkedList;
import linkedlist.Node;

/*Given a circular linked list, implement an algorithm which returns node at the beginning
        of the loop
        DEFINITION
        Circular linked list: A (corrupt) linked list in which a node’s next pointer points to an
        earlier node, so as to make a loop in the linked list
        EXAMPLE
        Input: A -> B -> C -> D -> E -> C [the same C as earlier]
        Output: C
*/
public class LinkedList2_5 {


    public static void main(String[] args) {

        LinkedList2_5 linkedList25 = new LinkedList2_5();

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        linkedList.append(10);

        linkedList.makeCircle(linkedList.head, linkedList.head.next.next.next);
        System.out.println(linkedList.head.data + "" + linkedList.head.next.next.data);

        System.out.println(linkedList25.findBeginning(linkedList.head).data);
    }

    Node findcollide(Node head) {

        Node n1 = head;
        Node n2 = head;

        while (n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1 == n2)
                break;

        }

        if (n2.next == null) {
            return null;
        }


        return n2;
    }

    Node findBeginning(Node head) {


        Node n1 = head;
        Node n2 = findcollide(head);

        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n2;
    }
}
