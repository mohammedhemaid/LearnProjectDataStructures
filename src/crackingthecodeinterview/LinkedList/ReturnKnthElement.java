package crackingthecodeinterview.LinkedList;

public class ReturnKnthElement {


    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(1);
        System.out.println(returnK(list.head , 3));

    }
    static int returnK(Node head, int k) {
        Node faster = head;
        Node slower = head;

        for (int i = 0; i < k-1; i++) {
            faster = faster.next;
        }

        while (faster.next!= null){
            faster = faster.next;
            slower = slower.next;
        }
        return slower.data;
    }


}
