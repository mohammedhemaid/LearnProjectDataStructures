package bytebybyte;

import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
    Set<Integer> set;
    int[] n;


    public static void main(String[] args) {

        int[] numbers = {-1, 0, 1, 2, -1, -4};

        ThreeSum threeSum = new ThreeSum();
        threeSum.addComp(numbers,0,numbers.length);
        threeSum.arrayOfNumbers(numbers, 0);





    }


    void arrayOfNumbers(int[] n, int v) {

        for (int i = 0; i < n.length; i++) {
            int comp = v - n[i];
            addToHash(comp);
        }

    }

    int[] addComp(int[] num, int val, int len) {

        n = new int[len];

        for (int i = 0; i < n.length; i++) {
            int comp = val - num[i];
            n[i] = comp;
        }


        return n;
    }

    Set<Integer> addToHash(int num) {

        set = new HashSet<>();

        set.add(num);
        return set;
    }


}
