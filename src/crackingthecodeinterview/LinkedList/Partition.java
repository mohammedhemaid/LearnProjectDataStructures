package crackingthecodeinterview.LinkedList;

public class Partition {

    static Node headPartion;
    static Node headPartion1;
    static Node tail;
    static Node tail1;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);

        System.out.println();
        list.printList(partition(list.head, 5));
    }


    static Node partition(Node head, int x) {
        Node current = head;
        Node current1 = head;


        while (current != null) {

            if (current.data < x) {

                if (headPartion == null) {
                    tail = headPartion = current;
                } else {

                    tail.next = current;
                    tail = current;
                }

            }

            current = current.next;
        }

        while (current1 != null) {

            if (!(current1.data < x)) {

                if (headPartion1 == null) {
                    tail1 = headPartion1 = current1;
                } else {

                    tail1.next = current1;
                    tail1 = current1;
                }
            }
            current1 = current1.next;
        }

        if (current1 == null) {
            tail1.next = current1;
        }
        tail.next = headPartion1;
        return headPartion;
    }


}
