import java.util.Arrays;

public class Arrayrotation {


    // Driver program to test above functions
    public static void main(String[] args) {
        Arrayrotation rotate = new Arrayrotation();
        int arr[] = {1,2,3,4,5};
      //  rotate.leftRotate(arr, 3, 10);
      //  rotate.printArray(arr, 10);
        rotLeft(arr,4);


    }

    void leftRotate(int arr[], int d, int n) {
        int i, j, k, temp;
        for (i = 0; i < gcd(d,n); i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i)
                    break;
                //
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }




    /*Function to left rotate arr[] of size n by d*   O(n^2)*/
//    void leftRotate(int arr[], int d, int n)
//    {
//        for (int i = 0; i < d; i++)
//            leftRotatebyOne(arr, n);
//    }
//
//    void leftRotatebyOne(int arr[], int n)
//    {
//        int i, temp;
//        temp = arr[0];
//        for (i = 0; i < n - 1; i++){
//            arr[i] = arr[i + 1];
//        }
//        arr[i] = temp;
//    }
//
//    /* utility function to print an array */
//    void printArray(int arr[], int n)
//    {
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }
//

    static int[] rotLeft(int[] a, int d) {
        int offset = a.length-d;
        int firstLoopSize = offset/d;
        int secondLoopSize = offset%d;
        int rotation = 0;
        while (d>rotation){

            int i ;
            int indexNext  = rotation;
            int nextIx = rotation;
            for( i = 0; i<firstLoopSize; i++){

                int currentIndex =  nextIx;
                 nextIx = currentIndex +d;
                int current = a[currentIndex];
                int next = a[nextIx];

                a[currentIndex] = next;
                a[nextIx] = current;
                indexNext = nextIx;

            }

            if (secondLoopSize>0) {

                for (int j = 0; j < 1; j++) {
                    int temp = a[indexNext];

                    int next = a[a.length-1];
                    a[indexNext] = next;
                    a[a.length-1] = temp;

                }
            }
            rotation++;


        }


        return a;
    }

}
