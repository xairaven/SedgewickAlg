package Chapter1.Section2;
import java.util.Arrays;
import edu.princeton.cs.algs4.Counter;

/**
 * Ex. 1.2.9 <br>
 * 29.01.2022
 * @author xairaven
 */
public class Task_09 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.9 --");

        int[] keys = {3, 9, 0};
        int[] whitelist = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(whitelist);

        Counter count = new Counter("iterations");

        for (int key : keys) {
            binarySearch(key, whitelist, count);
        }
        System.out.println(count);
    }

    private static int binarySearch(int key, int[] arr, Counter counter) {
        return rank(key, arr, counter, 0, arr.length - 1);
    }

    private static int rank(int key, int[] arr, Counter counter, int lo, int hi) {
        counter.increment();
        if (lo <= hi) {
            int middle = lo + (hi - lo) / 2;
            if (key < arr[middle]) return rank(key, arr, counter, lo, middle - 1);
            else if (key > arr[middle]) return rank(key, arr, counter, middle + 1, hi);
            else return middle;
        } else {
            return -1;
        }
    }
}
