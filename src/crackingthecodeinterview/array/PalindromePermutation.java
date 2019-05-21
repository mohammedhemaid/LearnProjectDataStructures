package crackingthecodeinterview.array;

public class PalindromePermutation {

    static int MAXNUMBER = 256;

    public static void main(String[] args) {

        System.out.println(Character.getNumericValue('a'));
        System.out.println(checkPalindrome("tacod cat"));
    }


    public static boolean checkPalindrome(String s) {
        int count = 0;
        int a[] = new int[MAXNUMBER];

        for (int i = 0; i < s.length(); i++) {

            int val = s.charAt(i);
            a[val]++;
        }

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            int c = ' ';
            if (a[val] % 2 > 0 && val != c) {
                count++;
            }


            if (count > 1) return false;
        }


        return true;
    }
}
