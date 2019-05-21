package listofquestion;

public class fibonacci {


    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Fibonacci Series using
// memoized Recursion
    static int fibMemo(int n) {
        int[] term = new int[1000];

        // base case
        if (n <= 1)
            return n;

        // if fib(n) has already
        // been computed we do not
        // do further recursive
        // calls and hence reduce
        // the number of repeated
        // work
        if (term[n] != 0)
            return term[n];

        else {

            // store the computed value
            // of fib(n) in an array
            // term at index n to so that
            // it does not needs to be
            // precomputed again
            term[n] = fibMemo(n - 1) +
                    fibMemo(n - 2);

            return term[n];
        }
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(fibMemo(6));
    }
}
