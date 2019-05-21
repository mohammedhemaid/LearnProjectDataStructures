import java.util.*;

public class Main {
    static int c[] = {1, 6, 5, 4, 2, 3};

    public static void main(String[] args) {
        int[][] a = {

                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12},
        };
        //System.out.println(diagonalDifference(a));
        //   System.out.println(minimumSwaps(c));
        char[] c = {'a', 'a', 'a'};
        removeDuplicatesEff(c);
        System.out.println(contain("waterbottlewaterbottle", "erbottlewi"));

        String s = "hello";
        System.out.println(reverseString(s));

        System.out.println("Admin"+Type.ADMIN);

        String str[] = {"a", "b", "a", "a"};
        ArrayList<Integer> arrivals = new ArrayList<>();
        arrivals.add(1);
        arrivals.add(3);
        arrivals.add(5);
        ArrayList<Integer> departures = new ArrayList<>();
        departures.add(2);
        departures.add(6);
        departures.add(10);

        System.out.println(new Main().hotel(arrivals, departures, 2));

        String st = new String("geeks");
        printRotatedString(st);

        Queue<Integer> q = new LinkedList<>();
        q.add(9);
        int arr[] = {2,4,3,5,1};
        System.out.println(minimumSwap(arr));
    }

    static int minimumSwap(int[] arr) {
        int swap=0;
        boolean visited[]=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            int j=i,cycle=0;

            while(!visited[j]){
                visited[j]=true;
                j=arr[j]-1;
                cycle++;
            }

            if(cycle!=0)
                swap+=cycle-1;
        }
        return swap;
    }

    static void printRotatedString(String str) {
        int n = str.length();

        StringBuffer sb = new StringBuffer(str);
        // Concatenate str with itself
        sb.append(str);

        // Print all substrings of size n.
        // Note that size of sb is 2n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j != n; j++) {
                System.out.print(sb.charAt(i + j));
                System.out.print(i + j);
            }
            System.out.println();
        }
    }


    public String kthMostFrequent(String[] strings, int k){
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            Integer x = map.get(s);
            if (x == null) x = 0;
            map.put(s, ++x);
        }

        List list = new ArrayList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer v1 = (Integer) ((Map.Entry) o1).getValue();
                Integer v2 = (Integer) ((Map.Entry) o2).getValue();
                return v1.compareTo(v2);
            }
        });
        list.get(k);

        if (list.size() > k) return (String) (list.get(k));
        return null;
    }

    static String reverseString(String s) {

        if (s.isEmpty()) {
            return s;

        }
        return reverseString(s.substring(1)) + s.charAt(0);


    }


    public static void removeDuplicatesEff(char[] str) {
        if (str == null) return;
        int len = str.length;
        if (len < 2) return;
        boolean[] hit = new boolean[256];
        for (int i = 0; i < 256; ++i) {
            hit[i] = false;
        }
        hit[str[0]] = true;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            if (!hit[str[i]]) {
                str[tail] = str[i];
                ++tail;
                hit[str[i]] = true;
            }
        }
        str[tail] = 0;
    }


    static boolean contain(String s1s1, String s2) {

        return s1s1.contains(s2);

    }

    static int minimumSwaps(int[] arr) {
        int first = 0, last = arr.length - 1;
        int swaps = 0;
        while (first < last) {
            while (arr[first] == first + 1 && first < last)
                first++;
            if (first < last) {
                int temp = arr[arr[first] - 1];
                arr[arr[first] - 1] = arr[first];
                arr[first] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    static int jumpingOnClouds(int[] c) {
        int minPath = 0;
        int i = 0;
        while (i < c.length) {

            if (i + 2 < c.length && c[i + 2] != 1) {
                i = i + 2;
                minPath++;

            }
            if (i + 2 >= c.length && i + 1 < c.length && c[i + 1] == 0) {
                i++;
                minPath++;
            } else if (i + 2 < c.length && c[i + 1] == 1) {
                {
                    i = i + 2;
                    minPath++;
                }
            }

            if (i + 2 < c.length && c[i + 2] == 1) {
                i++;
                minPath++;
            }


            if (i + 1 == c.length) {
                return minPath;
            }
        }
        return minPath;
    }

    static int jumpingOnClouds1(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length - 1; i++) {
            jumps++;
            if (i + 2 < c.length && c[i + 2] == 0) {
                i++;
            }
        }
        return jumps;
    }

    static long repeatedString(String s, long n) {
        double r = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                r++;
            }
        }
        r = (r * (n / s.length()));
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                r++;
            }
        }
        int inum = (int) Math.round(r);
        return inum;
    }

    static int diagonalDifference(int[][] arr) {
        int a = 0;
        int b = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {

            a += arr[i][i];
            System.out.println(i + "" + i);
            b += arr[i][size - i - 1];
            System.out.println(i + "" + (size - i - 1));
        }

        return Math.abs(a - b);

    }

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n - (i + 1));
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }

            for (int z = 0; z <= i; z++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }

    public boolean hotel(ArrayList<Integer> arrivals, ArrayList<Integer> departures, int k) {
        // Collection of events
        Map<Integer, Integer> events = new HashMap<>();

        // Number of rooms
        int n = arrivals.size();

        for (int i = 0; i < n; i++) {
            int arrival = arrivals.get(i);
            int departure = departures.get(i);

            // Add one during an arrival
            Integer current = events.get(arrival);
            events.put(arrival, current == null ? 1 : current + 1);

            // Remove one during a departure
            current = events.get(departure);
            events.put(departure, current == null ? -1 : current - 1);
        }

        // Sort the map
        Map<Integer, Integer> sortedEvents = new TreeMap<>(events);

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : sortedEvents.entrySet()) {
            count += entry.getValue();

            // If the current count exceeds the maximum number of rooms
            if (count > k) {
                return false;
            }
        }

        return true;
    }
}
