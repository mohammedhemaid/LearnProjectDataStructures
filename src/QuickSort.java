public class QuickSort {

    public static void main(String[] args) {


        int a[] = {5, 3, 2, 6, 7, 4, 1};
        quickSort(a, 0, a.length-1);

        for (int i : a) {
            System.out.println(i);
        }
    }


    static void quickSort(int[] a, int l, int h) {

        if (l < h) {

            int j = partition(a, l, h);

            quickSort(a, l, j);
            quickSort(a, j + 1, h);

        }

    }


    static int partition(int[] a, int l, int h) {

        int pivot = a[l];
        int i = l;
        int j = h;

        while (i < j) {

            while (a[i] <= pivot && i < h) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, l, j);

        return j;
    }

    static private void swap(int[] a, int i, int j) {

        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;

    }
}
