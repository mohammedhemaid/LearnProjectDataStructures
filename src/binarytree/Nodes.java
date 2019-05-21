package binarytree;

class Nodes {

    Nodes left, right;
    int data;

    public Nodes(int data) {

        this.data = data;
    }


    public void insert(int value) {

        if (value <= data) {
            if (left == null) {

                left = new Nodes(value);
            } else {
                left.insert(value);
            }

        } else {
            if (right == null) {
                right = new Nodes(value);
            } else {
                right.insert(value);
            }
        }
    }


    public boolean contains(int value) {

        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }

        } else {
            if (right == null) {

                return false;
            } else {
                return right.contains(value);
            }
        }


    }

    public void printInOrder() {

        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);

        if (right != null) {
            right.printInOrder();
        }
    }

    public static void main(String[] args) {
        Nodes binaryTree = new Nodes(5);

        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(7);
        binaryTree.insert(8);


        binaryTree.printInOrder();
        System.out.println(binaryTree.contains(2));

    }
}


