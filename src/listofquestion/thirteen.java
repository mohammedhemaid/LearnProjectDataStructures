package listofquestion;

import static java.lang.StrictMath.sqrt;

public class thirteen {

    public static void main(String[] args) {

        System.out.println(getMax(5, 10));
        System.out.println(getm(5, 10));
        System.out.println(getmx(5, 10));
    }

    static int getMax(int a, int b) {
        int c = a - b;
        int k = (c >> 31) & 0x1;
        int max = a - k * c;
        return max;
    }

    static double getm(int a, int b) {
        return (sqrt(a * a + b * b - 2 * a * b) + a + b) / 2;
    }

    static int getmx(int a, int b) {
        return (a + b + Math.abs(a - b))/2;
    }
}
