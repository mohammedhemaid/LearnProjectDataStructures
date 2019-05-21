package crackingthecodeinterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashTables {
    static HashMap<Integer, Integer> map;


    public static void main(String[] args) {

        Student id[] = new Student[5];
        id[0] = new Student(1, 1);
        id[1] = new Student(2, 2);
        id[2] = new Student(3, 3);
        id[3] = new Student(4, 4);
        id[4] = new Student(5, 5);

        List<String> word = new ArrayList<>();
        List<String> more = new ArrayList<>();

        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");
        word.add("1");
        more.add("2");

        map = buildMap(id);
        for (int i = 0; i < id.length; i++) {

        }
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.values());
        }

        merge(word, more);

        System.out.println(findChildren("abbAABB"));
    }



    public static HashMap<Integer, Integer> buildMap(Student[] students) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Student s : students) map.put(s.getId(), students[1].getValues());

        for (int h : map.keySet()) {
            System.out.println(map.get(h));

        }


        return map;
    }

    public static ArrayList<String> merge(List<String> words, List<String> more) {


        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;
    }

    static String findChildren(final String text) {

        char[] c = text.toCharArray();
        Arrays.sort(c);

        for (char ch : c) {
            System.out.println(ch);
        }


        return null;
    }
}
