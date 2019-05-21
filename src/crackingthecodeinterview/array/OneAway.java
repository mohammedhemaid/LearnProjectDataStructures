package crackingthecodeinterview.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class OneAway {

    static int count = 0;
    static int totalValue = 0;

    public static void main(String[] args) {
        //System.out.println(checkOneway("palees", "palee"));
        //  System.out.println(checkOneway("pallae", "palle"));
        // System.out.println(checkOneway("pale", "bake"));
        System.out.println(checkOneway("bake", "pale"));
    }

    private static boolean checkOneway(String s, String s1) {


        HashMap<Character, Integer> hashSet = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (hashSet.containsKey(c)) {
                hashSet.put(c, hashSet.get(c) + 1);
            } else hashSet.put(c, 1);
        }

        for (int i = 0; i < s1.length(); i++) {

            char c = s1.charAt(i);

            if (hashSet.containsKey(c)) {
                hashSet.put(c, Math.abs(hashSet.get(c) - 1));
            } else count++;
        }
        for (int val : hashSet.values()) {
            totalValue += val;
        }
        if (count > 1 || totalValue > 1) return false;


        return true;
    }
}
