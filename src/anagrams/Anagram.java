package anagrams;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


    private final static int NUMBERS_LETTERS = 26;


    public static int getDelta(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return -1;
        }

        int delta = 0;
        for (int i = 0; i < array1.length; i++) {
            int differnt = Math.abs(array1[i] - array2[i]);

            delta += differnt;

        }
        return delta;
    }

    public static int[] getCharCount(String s) {
        int[] charCount = new int[NUMBERS_LETTERS];

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int offset = (int) 'a';
            int code = c - offset;
            charCount[code]++;

        }
        return charCount;
    }

    public static int numberNeeded(String first, String second) {

        int count1[] = getCharCount(first);
        int count2[] = getCharCount(second);

        return getDelta(count1, count2);
    }


    public static int numberNeededHash(String first, String second) {

        HashMap<Character, Integer> count1 = getCharCountHash(first);
        HashMap<Character, Integer> count2 = getCharCountHash(second);

        return getDeltaHash(count1, count2);
    }

    public static int getDeltaHash(HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {

        int delta = 0;

        for ( Map.Entry<Character, Integer> item : h1.entrySet()) {

            if (h2.containsKey(item.getKey())) {
                int different = Math.abs(h1.get(item.getKey()) - h2.get(item.getKey()));
                delta += different;
            } else {
                delta += item.getValue();
            }
        }

        for ( Map.Entry<Character, Integer> item : h2.entrySet()) {

            if (!h1.containsKey(item.getKey())) {

                delta += item.getValue();
            }
        }
        return delta  ;
    }

    public static HashMap<Character, Integer> getCharCountHash(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.containsKey(c)) {
                int count = charCount.get(c) + 1;
                charCount.put(c, count);
            } else {
                charCount.put(c, 1);
            }

        }
        return charCount;
    }

    public static void main(String[] args) {
        System.out.println(numberNeededHash("hello", "billion"));
    }
}
