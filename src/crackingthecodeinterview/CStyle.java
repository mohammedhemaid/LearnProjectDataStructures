package crackingthecodeinterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CStyle {

    public static void main(String args[]) {
        String s = "this is a demo test!";
        System.out.println(reverse(s));

        List<String> o = new ArrayList<>();
        o.add("i");
        o.add("z");
        o.add("5");
        o.remove("z");
        for (int i = 0; i < o.size(); i++) {
            System.out.println(o.get(i));
        }
        CStyle c = new CStyle();
        System.out.println(c.factorial(1234789));
        System.out.println(c.sum(100));

        int[][] arr = {{1, 2, 3}, {4, 5, 0}, {7, 8, 9}};

        c.setToZero(arr);




        //string to char array
        char[] chars = new char[50];
        chars[0] = 'a';
        chars[1] = 'a';
        chars[2] = 'a';
        chars[3] = ' ';
        chars[4] = 'a';
        chars[5] = 'a';
        chars[6] = 'a';
        chars[7] = 'a';
        chars[8] = ' ';
        chars[9] = 'a';
        chars[10] = 'a';
        chars[11] = 'a';
        //replaceFun(chars,chars.length);

        //

        String str = "455 3245 465";
        String str1 = replaceSpace(str);
        System.out.println(str1);

        System.out.println(c.replaceStringWithSpace(str));

        int [] array = {1, 3, 3, 1, 1};
        System.out.println(countCycles(array));
        System.out.println(countCyclesBurn(array));
        
    }

    int r = 0;

    int factorial(int n) {

        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }

        return r;
    }

    int sum(int n) {

        return n * (n + 1) / 2;


    }

    //Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
    //column is set to 0

    void setToZero(int[][] matrix) {

        System.out.println();
        int row = 0;
        int column = 0;

        // Store the row and column index with value 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row = i;
                    column = j;
                }
            }
        }
        // Set arr[i][j] to 0 if either row i or column j has a 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((row == i || column == j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }


    public static String reverse(String input) {
        char[] data = input.toCharArray();
        int i = 0;
        int j = data.length - 1;
        char temp;

        while (i < j) {
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }

        String s = new String(data);
        return s;


    }

    //Write a method to replace all spaces in a string with ‘%20’

    public static void replaceFun(char[] str, int length) {
        int spaceCount = 0, newLength, i = 0;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + spaceCount * 2;
        str[newLength] = '\0';
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        for (int y = 0; y<newLength; y++){
            System.out.print(str[y]);
        }
    }


    public static String replaceSpace(String str){
        String tokens[] = str.split(" ");
        StringBuffer buffer = new StringBuffer(tokens[0]);
        for(int i = 1; i < tokens.length; i++)
            buffer.append("%20" + tokens[i]);
        return buffer.toString();
    }

    public String replaceStringWithSpace(String str){
        str = str.trim();
        return str.replaceAll("[\\s]", "%20");
    }

    public static int countCycles(int[] data) {
        int[] counters = new int[data.length];
        int index = 0;
        int count = 0;
        while(counters[index] == 0) {
            counters[index] = count++;
            index = data[index];
        }
        return count - counters[index];
    }

    public static int countCyclesBurn(int[] data) {
        int index = 0;
        int count = 0;
        while(data[index] >= 0) {
            int tmp = data[index];
            data[index] = -(++count);
            index = tmp;
        }
        return count + data[index] + 1;
    }
}

