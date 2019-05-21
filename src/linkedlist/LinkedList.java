package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    public Node head;
    public Node head2;
    int len = 0;

    public void append(int data) {

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {

            current = current.next;

        }
        current.next = new Node(data);
        len++;
    }

    public void appendHead2(int data) {

        if (head2 == null) {
            head2 = new Node(data);
            return;
        }
        Node current = head2;
        while (current.next != null) {

            current = current.next;

        }
        current.next = new Node(data);
        len++;
    }

    public void makeCircle(Node head, Node node) {

        while (head != null) {
            if (head.next == null) {
                head.next = node;
                break;
            }
            head = head.next;
        }


    }

    public void prepend(int data) {

        Node newhead = new Node(data);
        newhead.next = head;
        head = newhead;
    }

    public void deleteWithValue(int data) {

        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {

                current.next = current.next.next;
                return;
            }

            current = current.next;

        }
    }

    public void deleteNode(Node deletedNode) {

        Node temp = deletedNode.next;

        deletedNode.data = temp.data;
        deletedNode.next = temp.next;

    }

    public void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }

    public void deleteDups1(Node head) {

        Set<Object> s = new HashSet<>();

        Node current = head;
        Node prev = null;
        while (current != null) {
            int val = current.data;

            if (s.contains(val)) {
                prev.next = current.next;

            } else {
                s.add(current.data);
                prev = current;
            }
            current = current.next;
        }

    }


    public void deleteDups2(Node head) {
        if (head == null) return;
        Node previous = head;
        Node current = previous.next;
        while (current != null) {
            Node runner = head;
            while (runner != current) { // Check for earlier dups
                if (runner.data == current.data) {
                    Node tmp = current.next; // remove current
                    previous.next = tmp;
                    current = tmp; // update current to next node
                    break; // all other dups have already been removed
                }
                runner = runner.next;
            }
            if (runner == current) { // current not updated - update now
                previous = current;
                current = current.next;
            }
        }
    }

    Node invert(Node list, Node acc) {
        if (list == null)
            return acc;
        Node next = list.next;
        list.next = acc;
        return invert(next, list);
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.append(0);
        linkedList.append(5);
        linkedList.append(7);
        linkedList.append(3);
        linkedList.append(5);
        linkedList.append(4);


        linkedList.printList(linkedList.invert(linkedList.head, null));

    }
}
