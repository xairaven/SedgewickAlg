package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.18 <br>
 * 14.06.2022
 * @author xairaven
 */
public class Task_18 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.18 --");

        int[] a = {10, -9, 20, 25, 21, 40, 50, -20};

        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Index of local minimum in array: " + localMinimum(a));
    }

    private static int localMinimum(int[] arr) {
        if      (arr.length == 1) return arr[0];
        else if (arr.length == 2) return Math.max(arr[0], arr[1]);

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;   //index

            if (mid == 0)              return (arr[mid] < arr[mid + 1]) ? arr[mid] : -1;
            if (mid == arr.length - 1) return (arr[mid] < arr[mid - 1]) ? arr[mid] : -1;

            if (arr[mid - 1] > arr[mid] && arr[mid] < arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid]) {
                hi = mid - 1;
            } else if (arr[mid + 1] < arr[mid]) {
                lo = mid + 1;
            }
        }
        return -1;
    }
}

/*
Result example:
Array: [10, -9, 20, 25, 21, 40, 50, -20]
Index of local minimum in array: 1
 */