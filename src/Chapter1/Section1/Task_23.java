package Chapter1.Section1;
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

/**
 * Ex. 1.1.23 <br>
 * 13.01.2022
 * @author xairaven
 */
public class Task_23 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.23 --");

        if (args.length < 2) throw new ArrayIndexOutOfBoundsException("you must to input 2 args. Check examples");

        final String path = "src/Chapter1/Section1/" + args[0];
        int[] whitelist = (new In(path)).readAllInts();
        Arrays.sort(whitelist);

        char operation = args[1].charAt(0);
        if (operation != '-' && operation != '+') throw new IllegalArgumentException("operation must be + or -");

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = binarySearch(key, whitelist);

            if (index != -1 && operation == '-') {
                System.out.println("Number in whitelist: " + key);
            } else if (index == -1 && operation == '+') {
                System.out.println("Number not in whitelist: " + key);
            }
        }
    }

    private static int binarySearch(int key, int[] arr) {
        return rank(key, arr, 0, arr.length - 1);
    }

    private static int rank(int key, int[] arr, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < arr[mid]) {
                return rank(key, arr, lo, mid-1);
            } else if (key > arr[mid]) {
                return rank(key, arr, mid+1, hi);
            } else return mid;
        } else return -1;
    }
}

/*
Example of input:
- Command line
Task_23.txt +

Example of result:
5
-5
Number not in whitelist: -5
3
56
Number not in whitelist: 56

Example of input:
- Command line
Task_23.txt -

Example of result:
3
Number in whitelist: 3
4
Number in whitelist: 4
-5
11
Number in whitelist: 11
 */