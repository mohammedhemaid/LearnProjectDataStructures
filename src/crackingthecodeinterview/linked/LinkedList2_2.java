package crackingthecodeinterview.linked;

import linkedlist.LinkedList;
import linkedlist.Node;

public class LinkedList2_2 {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);


        LinkedList2_2 linkedList22 = new LinkedList2_2();
        System.out.println(linkedList22.nthToLast(linkedList.head , 4).data);

    }
    Node nthToLast(Node head, int n) {
        if (head == null || n < 1) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        for (int j = 0; j < n - 1; ++j) { // skip n-1 steps ahead
            if (p2 == null) {
                return null; // not found since list size < n
            }
            p2 = p2.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}

