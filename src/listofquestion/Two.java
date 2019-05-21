package listofquestion;


//-	Write code to reverse a C-Style String  (C-String means that “abcd” is represented as five characters, including the null character
public class Two {


    public static void main(String[] args) {

        System.out.println(reverse1("hello"));
        System.out.println(reverse2("hello"));

    }


    public static String reverse1(String s) {

        char[] c = new char[s.length()];
        int y = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            c[y] = s.charAt(i);
            y++;
        }

        return new String(c);
    }


    public static String reverse2(String s) {

        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length()-1;

        while (j>i){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;

        }

        return new String(c);
    }
}
