package crackingthecodeinterview.array;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */
public class IsUnique {


    public static void main(String[] args) {

        System.out.println(isUniqueChars("helo"));
    }

//    static boolean isUniqueChars(String str) {
//        if (str.length() > 128) return false;
//        boolean [] char_set = new boolean [128];
//        for (int i = 0; i < str.length(); i++) {
//            char val = str.charAt(i);
//            if (char_set[val]) {//Already found this char in string
//                return false;
//            }
//            char_set[val] = true;
//        }
//        return true;
//    }

    static boolean isUniqueChars(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);

            if ((total & 1 << val) > 0) {
                return false;
            }
            total = total | 1 << val;
        }
        return true;
    }
}
