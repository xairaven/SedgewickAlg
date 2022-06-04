package Chapter1.Section1;
import java.util.Arrays;

/**
 * Ex. 1.1.22 <br>
 * 13.01.2022
 * @author xairaven
 */
public class Task_22 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.22 --");

        int[] arr = {1, 2, 4, 5, 6, 7}; //Array should be sorted
        Arrays.sort(arr);
        int key = 7;
        int index = binarySearch(key, arr);
        System.out.printf("\nResult index = %d", index);
    }

    private static int binarySearch(int key, int[] arr) {
        return rank(key, arr, 0, arr.length-1, 0);
    }

    private static int rank(int key, int[] arr, int lo, int hi, int depth) {
        if (depth != 0) {
            System.out.println();
        }
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.printf("lo: %d  <->  hi: %d", lo, hi);

        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                return rank(key, arr, lo, mid-1, ++depth);
            } else if (key > arr[mid]) {
                return rank(key, arr, mid+1, hi, ++depth);
            } else return mid;
        } else return -1;
    }
}