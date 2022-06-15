package Chapter1.Section4;
import  java.util.Arrays;

/**
 * Ex. 1.4.22 <br>
 * 15.06.2022
 * @author xairaven
 */
public class Task_22 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.22 --");

        int[] arr = {-5, -3, -2, 0, 1, 2, 3, 5, 6, 7, 11, 23, 32};
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.printf("Index of number %d is: %d\n", 0, binarySearchAddSub(0, arr));
        System.out.printf("Index of number %d is: %d\n", 99, binarySearchAddSub(99, arr));
        System.out.printf("Index of number %d is: %d", -3, binarySearchAddSub(-3, arr));
    }

    private static int binarySearchAddSub(int key, int[] arr) {
        int prevN = 0;
        int N = 1;
        int aux;

        while (N < arr.length - 1) {
            aux = N;
            N = prevN + N;
            prevN = aux;
        }

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            while (prevN > 0 && N >= hi - lo) {
                aux = prevN;
                prevN = N - prevN;
                N = aux;
            }

            int mid = lo + prevN;

            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

/*
Result example:

 */