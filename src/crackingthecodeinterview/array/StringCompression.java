package crackingthecodeinterview.array;

public class StringCompression {
    static int index = 0;
    static int count = 0;

    public static void main(String[] args) {

        System.out.println(stringCompression("aabcccccaaae"));
    }

    static String stringCompression(String s) {
        String compressed = "";

        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressed += "" + s.charAt(i) + count;
                count = 0;

            }

        }
        return compressed.length() < s.length() ? compressed : s;

    }


}
