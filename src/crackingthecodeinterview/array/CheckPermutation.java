package crackingthecodeinterview.array;

/*
 Given two strings, write a method to decide if one is a permutation of the
 other.
 */
public class CheckPermutation {
    private static int MAXSIZE = 26;

    public static void main(String[] args) {

        System.out.println(isPermutation("hllo", "ollh"));
    }

    private static boolean isPermutation(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int[] a1 = new int[MAXSIZE];

        for (int i = 0; i < s1.length(); i++) {
            int val1 = s1.charAt(i);
            int offset1 = val1 - 'a';
            a1[offset1]++;
        }


        for (int i = 0; i < s2.length(); i++) {
            int val2 = s2.charAt(i);
            int offset2 = val2 - 'a';

            a1[offset2]--;

            if (a1[offset2] < 0) return false;

        }



        return true;
    }





}
