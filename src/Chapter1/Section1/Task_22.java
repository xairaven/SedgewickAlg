package Chapter1.Section1;
import edu.princeton.cs.introcs.StdOut;
import java.util.Arrays;
//13.01.2022
//Ex. 1.1.22
public class Task_22 {
    public static void main() {
        System.out.println("-- Task 1.1.22 --");
        int[] arr = {1, 2, 4, 5, 6, 7}; //Array should be sorted
        int key = 5;
        Arrays.sort(arr);
        int resultIndex = rank(key, arr, 0, arr.length-1, 0);
        StdOut.printf("\nResult index = %d", resultIndex);
        System.out.print("\n\n");
    }

    public static int rank(int key, int[] arr, int lo, int hi, int indexDepth) {
        if (indexDepth != 0) {
            StdOut.println();
        }
        for(int i = 0; i < indexDepth; i++) {
            StdOut.print(" ");
        }
        StdOut.printf("lo: %d    hi: %d", lo, hi);
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) {
                return rank(key, arr, lo, mid-1, ++indexDepth);
            } else if (key > arr[mid]) {
                return rank(key, arr, mid+1, hi, ++indexDepth);
            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }
}