public class BubbleSort {


    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    static int[] sort(int a[]) {


        boolean isSorted = false;
        int lastLength = a.length-1;
        while (!isSorted) {

            isSorted = true;
            for (int i = 0; i < lastLength; i++) {

                if (a[i] > a[i + 1]) {

                    swap(a, i, i + 1);
                    isSorted = false;
                }
            }
            lastLength--;
        }

        return a;
    }

    private static void swap(int[] a, int i,int next) {
        int temp = a[i];
        a[i] = a[next] ;
        a[next] = temp;
    }
}
