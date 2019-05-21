package MyList;

public class Test {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        System.out.println(list.get(2));
    }
}
