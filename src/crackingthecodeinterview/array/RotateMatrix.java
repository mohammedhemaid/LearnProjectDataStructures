package crackingthecodeinterview.array;

public class RotateMatrix {

    public static void main(String[] args) {

        int arr[][] = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

       // rotateClockWise(arr);
        rotateCounterClockWise(arr);
        printMatrix(arr);

    }

    private static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j]);
                System.out.print("  ");

            }
            System.out.println(" ");
        }
    }


    void rotateMatrix(int[][] matrix) {


    }


    static boolean rotateClockWise(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {

                int offset = i - first;

                int top = matrix[first][i];
                // save top
                // left ->top
                matrix[first][i] = matrix[last - offset][first];
                // bottom ->left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right ->bottom
                matrix[last][last - offset] = matrix[i][last];
                // top ->right
                matrix[i][last] = top;
                // right<-saved top
            }
        }
        return true;
    }


    static boolean rotateCounterClockWise(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {

                int offset = last -i;

                int top = matrix[first][last - i];
                // save top
                // left ->top
                matrix[first][last-i] = matrix[last-i][last];
                // bottom ->left
                matrix[last-i][last] = matrix[last][first+i];
                // right ->bottom
                matrix[last][first+i] = matrix[first+i][first];
                // top ->right
                matrix[first+i][first] = top;
                // right<-saved top
            }
        }
        return true;
    }
}