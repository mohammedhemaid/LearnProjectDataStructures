package binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PrintBinartyTreeBottomToTop {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left = g;
        f.right = h;

        printLevelFromBottomToTop(a);
    }


    private static void printLevelFromBottomToTop(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int v = node.value;
            stack.push(node);

            if (node.right != null) {
                int r = node.right.value;
                queue.add(node.right);
            }

            if (node.left != null) {
                int d = node.left.value;

                queue.add(node.left);
            }

        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().value + ", ");
        }
    }

    static class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }


}
