package hackerrank;

public class MinSwap{


    public static void main(String[] args) {
        int arr[] = {2,4,5,1,6,3};
        System.out.println(minimumSwap(arr));

        for (int a : arr){
            System.out.print(a);
        }
    }

    private static int minimumSwap(int[] arr) {

        int swap = 0;
        for (int i = 0; i<arr.length; i++){
                int index = arr[i] -1;
            while (index!= i){
                swap(arr,index , i);
                index = arr[i] -1;
                swap++;
            }

        }
        return swap;

    }

    private static void swap(int []arr,int index, int i) {


        int tem = arr[index];
        arr[index] = arr[i];
        arr[i] = tem;
    }
}
