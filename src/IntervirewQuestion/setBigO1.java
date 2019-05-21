package IntervirewQuestion;

import java.util.HashMap;

public class setBigO1 {


    public static void main(String[] args) {
        setBigO1 s = new setBigO1();
        s.set(20, 2);
        System.out.println(s.get(20));
        s.setAll(30);


    }

    int id = 0;
    boolean setAllBoolean = false;
    Value v;
    HashMap<Integer, Value> hash = new HashMap<>(100);

    void set(int index, int value) {

        hash.put(index, new Value(id++, value));
    }

    Value setAll(int value) {
        setAllBoolean = true;
        v = new Value(id++, value);
        return v;
    }

    int get(int index) {

        if (!hash.containsKey(index)) {
            if (setAllBoolean) {
                return v.val;
            }
        } else if (v != null && v.id > hash.get(index).id) {
            return v.val;

        } else{
            return hash.get(index).val;
        }
        return -1;
    }

}

class Value {
    int val;
    int id;

    public Value(int id, int val) {
        this.val = val;
        this.id = id;

    }


}
