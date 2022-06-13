package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.10 <br>
 * 13.06.2022
 * @author xairaven
 */
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.10 --");

        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 9, 9, 9, 10};
        Arrays.sort(arr);

        System.out.printf("Index of %d: %d\n", 2, binarySearch(2, arr));
        System.out.printf("Index of %d: %d\n", 0, binarySearch(11, arr));
        System.out.printf("Index of %d: %d\n", 9, binarySearch(9, arr));
    }

    public static int binarySearch(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid])  return rank(key, a, lo, mid - 1);
        else if (key > a[mid])  return rank(key, a, mid + 1, hi);
        else {
            int id = rank(key, a, lo, mid - 1);
            return (id == -1) ? mid : id;
        }
    }
}

/*
Result example:
Index of 2:   1
Index of 0:  -1
Index of 9:   8
 */