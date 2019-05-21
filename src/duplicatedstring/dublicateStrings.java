package duplicatedstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class dublicateStrings {


    private static boolean d(String s) {

        Set<Character> characterHashSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            characterHashSet.add(c);
        }
        return characterHashSet.size() < s.length();

    }
//Write an efficient function to return maximum occurring character in the input string e.g.,
// if input string is “test” then function should return ‘t’.


    private static char getMaxOccuringChar1(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 0);
            }


        }
        char max = ' ';

        for (int c = 0; c < hashMap.size(); c++) {

            if (hashMap.get(s.charAt(c)) > max) {
                max = s.charAt(c);
            }
        }
        return max;
    }

    static final int ASCII_SIZE = 256;

    static char getMaxOccuringChar(String str) {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        char count[] = new char[256];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;


        }
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        //  System.out.println(getMaxOccuringChar1("helloo"));
        System.out.println(getMaxOccuringChar("hello"));
        System.out.println(practice("geeksforgeeks", "forgeeksgeeks"));
    }


    static boolean practice(String s1, String s2) {

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {

                if (hashMap1.containsKey(s1.charAt(i))) {
                    hashMap1.put(s1.charAt(i), hashMap1.get(s1.charAt(i)) + 1);
                } else {
                    hashMap1.put(s1.charAt(i), 0);

                }
                if (hashMap2.containsKey(s2.charAt(i))) {
                    hashMap2.put(s2.charAt(i), hashMap2.get(s2.charAt(i)) + 1);
                } else {
                    hashMap2.put(s2.charAt(i), 0);

                }

            }
        }
        boolean flag = false;

        for (int i = 0; i < s1.length(); i++) {
            if (hashMap1.containsKey(s2.charAt(i))) {

                if (hashMap1.get(s2.charAt(i)).equals(hashMap2.get(s2.charAt(i)))) {
                    flag = true;
                }else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return flag;
    }
}




























