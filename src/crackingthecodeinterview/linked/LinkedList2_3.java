package crackingthecodeinterview.linked;


import linkedlist.LinkedList;
import linkedlist.Node;

/*Implement an algorithm to delete a node in the middle of a single linked list, given
only access to that node
EXAMPLE
Input: the node ‘c’ from the linked list a->b->c->d->e
Result: nothing is returned, but the new linked list looks like a->b->d->e
*/
public class LinkedList2_3 {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        LinkedList2_3  linkedList2_3 = new LinkedList2_3();
        System.out.println(linkedList2_3.deleteNode(linkedList.head.next.next.next));
        linkedList.printList(linkedList.head);

    }

    Node deleteNode(Node node) {

        node.data = node.next.data;
        node.next = node.next.next;


        return node;
    }
}
