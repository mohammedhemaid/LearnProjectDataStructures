public class ArrayMerge {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 7, 6, 7, 7};
        merge(a, b, 8, b.length);

        for (int i : a) {
            System.out.println(i);

        }
    }

    private static void merge(int[] a, int[] b, int aLength, int bLength) {
        int lastIndexMerge = aLength + bLength - 1;
        int bLastIndex = bLength - 1;
        int aLastIndex = aLength - 1;


        while (bLastIndex >= 0) {

            if (aLastIndex >= 0 && a[aLastIndex] > b[bLastIndex]) {

                a[lastIndexMerge] = a[aLastIndex];
                aLastIndex--;

            } else {
                a[lastIndexMerge] = b[bLastIndex];
                bLastIndex--;
            }

            lastIndexMerge--;
        }

    }
}
