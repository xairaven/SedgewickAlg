package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.20 <br>
 * 15.06.2022
 * @author xairaven
 */
public class Task_20 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.20 --");

        int[] arr = {2, 5, 6, 8, 1, -5, 3};
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.printf("Index of number %d is: %d\n", 6, bitonicSearch(6, arr));
        System.out.printf("Index of number %d is: %d\n", 7, bitonicSearch(7, arr));
        System.out.printf("Index of number %d is: %d", -5, bitonicSearch(-5, arr));
    }

    private static int bitonicSearch(int key, int[] arr) {
        if (arr == null || arr.length == 0)
            throw new ArrayIndexOutOfBoundsException("array must to have at least 1 elem");

        int point = findPoint(arr, 0, arr.length - 1);

        int index = ascendingRank(key, arr, 0, point);
        if (index != -1) return index;

        return descendingRank(key, arr, point + 1, arr.length - 1);
    }

    private static int ascendingRank(int key, int[] arr, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] < key) {
                lo = mid + 1;
            } else if (arr[mid] > key) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static int descendingRank(int key, int[] arr, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > key) {
                lo = mid + 1;
            } else if (arr[mid] < key) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static int findPoint(int[] arr, int lo, int hi) {
        if (lo > hi)  return arr.length - 1;
        if (hi == lo) return hi;

        int mid = lo + (hi - lo) / 2;

        if (mid == 0 && arr[mid] < arr[mid + 1]) {
            return findPoint(arr, mid + 1, hi);
        }
        else if (mid == 0) return 0;
        else if (mid == arr.length - 1) return arr.length - 1;

        if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])
            return findPoint(arr, lo, mid - 1);
        else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1])
            return findPoint(arr, mid + 1, hi);
        else return mid;
    }
}

/*
Result example:
Array: [2, 5, 6, 8, 1, -5, 3]
Index of number 6 is: 2
Index of number 7 is: -1
Index of number -5 is: 5
 */