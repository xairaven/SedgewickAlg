package Chapter1.Section1;
import java.util.Arrays;

/**
 * Ex. 1.1.29 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_29 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.29 --");
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9};
        Arrays.sort(arr);
        System.out.printf("Rank(%d) = %d\n", 4, rank(4, arr));
        System.out.printf("Rank(%d) = %d\n", 15, rank(15, arr));
        System.out.printf("Rank(%d) = %d\n", 5, rank(5, arr));

        System.out.println();

        System.out.printf("Count(%d) = %d\n", 4, count(4, arr));
        System.out.printf("Count(%d) = %d\n", 15, count(15, arr));
        System.out.printf("Count(%d) = %d\n", 5, count(5, arr));
    }

    private static int rank(int key, int[] arr) {
        return lessThanKey(key, arr, 0, arr.length - 1);
    }

    private static int count(int key, int[] arr) {
        int lessThanKey = lessThanKey(key, arr, 0, arr.length - 1);
        int greaterThanKey = greaterThanKey(key, arr, 0, arr.length - 1);
        return arr.length - lessThanKey - greaterThanKey;
    }

    private static int lessThanKey(int key, int[] arr, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key > arr[mid]) return lessThanKey(key, arr, mid+1, hi);
            else return lessThanKey(key, arr, lo, mid - 1);

        } else return lo;
    }

    private static int greaterThanKey(int key, int[] arr, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < arr[mid]) return greaterThanKey(key, arr, lo, mid - 1);
            else return greaterThanKey(key, arr, mid + 1, hi);

        } else return arr.length - hi - 1;
    }
}

/*
Input (int array):
1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9

Result:
Rank(4) = 4
Rank(15) = 12
Rank(5) = 5

Count(4) = 1
Count(15) = 0
Count(5) = 3
 */
