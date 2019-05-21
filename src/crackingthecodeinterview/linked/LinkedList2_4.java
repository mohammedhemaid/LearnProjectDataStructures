package crackingthecodeinterview.linked;

import linkedlist.LinkedList;
import linkedlist.Node;

public class LinkedList2_4 {

    Node res = null; // res is head node of the resultant list
    Node prev = null;
    Node temp = null;
    int sum, carry = 0;


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(7);
        linkedList.head.next = new Node(5);
        linkedList.head.next.next = new Node(9);
        linkedList.head.next.next.next = new Node(4);
        linkedList.head.next.next.next.next = new Node(6);

        linkedList.head2 = new Node(8);
        linkedList.head2.next = new Node(4);

        linkedList.printList(linkedList.head);
        linkedList.printList(linkedList.head2);

        LinkedList2_4 linkedList24 = new LinkedList2_4();
        linkedList.printList(linkedList24.addTwoLists(linkedList.head, linkedList.head2));

        System.out.println(linkedList24.trythis());
    }


    Node addTwoLists(Node first, Node second) {

        while (first != null || second != null) {

            sum = sum + (first != null ? first.data : 0) + (second != null ? second.data : 0);

            if (sum > 9) {

                carry = sum % 10;

                temp = new Node(carry);
                if (res == null) {
                    res = temp;
                } else // If this is not the first node then connect it to the rest.
                {
                    prev.next = temp;
                }
                prev = temp;
                sum = sum / 10;

            } else {

                temp = new Node(sum);
                if (res == null) {
                    res = temp;
                } else // If this is not the first node then connect it to the rest.
                {
                    prev.next = temp;
                }
                prev = temp;

            }

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }

        return res;
    }


    Node addTwoListsGFG(Node first, Node second) {
        Node res = null; // res is head node of the resultant list
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        while (first != null || second != null) //while both lists exist
        {
            // Calculate value of next digit in resultant list.
            // The next digit is sum of following things
            // (i)  Carry
            // (ii) Next digit of first list (if there is a next digit)
            // (ii) Next digit of second list (if there is a next digit)
            sum = carry + (first != null ? first.data : 0)
                    + (second != null ? second.data : 0);

            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            temp = new Node(sum);

            // if this is the first node then set it as head of
            // the resultant list
            if (res == null) {
                res = temp;
            } else // If this is not the first node then connect it to the rest.
            {
                prev.next = temp;
            }

            // Set prev for next insertion
            prev = temp;

            // Move first and second pointers to next nodes
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }

        if (carry > 0) {
            temp.next = new Node(carry);
        }

        // return head of the resultant list
        return res;
    }


    int trythis() {

        int i = 0;
        try {
            i = 5;
            return i;
        } catch (Exception e) {

        } finally {

            return i + 1;
        }
    }
}
