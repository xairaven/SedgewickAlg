package Chapter1.Section1;
import java.util.Arrays;
import edu.princeton.cs.algs4.In;

/**
 * Ex. 1.1.38 <br>
 * 15.01.2022
 * @author xairaven
 */
public class Task_38 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.38 --");

        int key = 785481;

        In in = new In("./resources/largeW.txt");

        int[] array = in.readAllInts();
        Arrays.sort(array);

        long startTime = System.nanoTime();
        System.out.printf("Bruteforce: %d\n", bruteForceSearch(key, array));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.printf("Duration: %d nanoseconds.\n", duration);

        System.out.println();

        startTime = System.nanoTime();
        System.out.printf("BinarySearch: %d\n", binarySearch(key, array, 0, array.length - 1));
        endTime = System.nanoTime();

        duration = (endTime - startTime);
        System.out.printf("Duration: %d nanoseconds.\n\n", duration);
    }

    private static int bruteForceSearch(int key, int[] array) {
        if (array == null) throw new IllegalArgumentException("array given to bruteForceSearch() is null");
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static int binarySearch(int key, int[] arr, int lo, int hi) {
        if (arr == null) throw new IllegalArgumentException("array given to binarySearch() is null");
        if (lo <= hi) {
            int middle = lo + (hi - lo) / 2;
            if (key < arr[middle]) return binarySearch(key, arr, lo, middle - 1);
            else if (key > arr[middle]) return binarySearch(key, arr, middle + 1, hi);
            else return middle;
        } else {
            return -1;
        }
    }
}

/*
Results for largeW.txt:

Bruteforce: 785018
Duration: 9063200 nanoseconds.

BinarySearch: 785018
Duration: 115000 nanoseconds.

Bruteforce: 785018
Duration: 24251600 nanoseconds.

BinarySearch: 785018
Duration: 346100 nanoseconds.
 */
