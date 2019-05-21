package listofquestion;


import java.lang.reflect.Array;
import java.util.Arrays;

//Implement an algorithm to determine if a string has all unique characters  What if you can not use additional data structures?
public class one {
    final static int MAX_CHAR = 256;

    public static void main(String[] args) {
        System.out.println(checkString("helo"));
        System.out.println(uniqueCharacters("hello"));
    }

    public static boolean checkString(String s) {

        int count[] = new int[MAX_CHAR];

        if (s.length() > MAX_CHAR)
            return false;

        Arrays.fill(count, 0);

        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i)] > 0) {
                return false;
            }
            count[s.charAt(i)]++;
        }

        return true;
    }


   static boolean uniqueCharacters(String str) {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';

            // if that bit is already set in checker,
            // return false
            System.out.println(checker);
            if ((checker & (1 << bitAtIndex)) > 0)
                return false;


            // otherwise update and continue by
            // setting that bit in the checker

            checker = checker | (1 << bitAtIndex);

        }

        // no duplicates encountered, return true
        return true;
    }

}
