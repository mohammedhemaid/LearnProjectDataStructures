package linkedlist;

public class LinkedList1 {

        Node head; // head of the list

        /* Linked List node */
        class Node
        {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        /* Function to get the nth node from the last of a
           linked list */
        void printNthFromLast(int n)
        {
            int len = 0;
            Node temp = head;

            // 1) count the number of nodes in Linked List
            while (temp != null)
            {
                temp = temp.next;
                len++;
            }

            // check if value of n is not more than length of
            // the linked list
            if (len < n)
                return;

            temp = head;

            // 2) get the (len-n+1)th node from the begining
            for (int i = 1; i < len-n+1; i++)
                temp = temp.next;
            System.out.println(len-n+1);

            System.out.println(temp.data);
        }

        /* Inserts a new BinaryTree at front of the list. */
        public void push(int new_data)
        {
        /* 1 & 2: Allocate the BinaryTree &
                  Put in the data*/
            Node new_node = new Node(new_data);

            /* 3. Make next of new BinaryTree as head */
            new_node.next = head;

            /* 4. Move the head to point to new BinaryTree */
            head = new_node;
        }

    public   Node find_nth_to_last( int n )
    {
        Node point1 = head;
        for( int i = 0; i < n; i++ )
        {
            point1 = point1.next;
        }
        Node point2 = head;
        while( point1.next != null )
        {
            point1 = point1.next;
            point2 = point2.next;
        }
        return point2;
    }

        /*Drier program to test above methods */
        public static void main(String [] args)
        {
            LinkedList1 llist = new LinkedList1();
            llist.push(20);
            llist.push(4);
            llist.push(15);
            llist.push(35);
            llist.push(55);
            llist.push(5);
            llist.push(3);

            llist.printNthFromLast(6);
            System.out.println(llist.find_nth_to_last(2));
        }
    }// This code is contrib

