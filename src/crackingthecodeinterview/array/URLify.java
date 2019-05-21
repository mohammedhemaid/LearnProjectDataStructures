package crackingthecodeinterview.array;

public class URLify {

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
       // System.out.println(makeURLify(s, 13));
     char ch[] = s.toCharArray();
        replaceSpaces(ch , 13 );
        for (char c : ch){
            System.out.print(c);
        }
    }


    static String makeURLify(String s, int len) {

        int temp = -1;

        char[] c = new char[s.toCharArray().length];
        String t = s.trim();

        for (int i = 0; i < len; i++) {

            if (t.charAt(i) == ' ') {
                int index = ++temp;
                c[index] = '%';
                index = temp + 1;
                c[index] = '2';
                index = temp + 2;
                c[index] = '0';
                temp = index;
            } else {

                temp++;
                c[temp] = t.charAt(i);
            }

        }

        return new String(c);
    }


   static void replaceSpaces(char str[], int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';

                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
