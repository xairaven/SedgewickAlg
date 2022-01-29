package Chapter1.Section2;
import java.util.Arrays;
import edu.princeton.cs.algs4.Counter;
//29.01.2022
//Ex. 1.2.9
public class Task_09 {
    public static void main() {
        System.out.println("-- Task 1.2.9 --");
        int[] keys = {7, 11, 5};
        int[] whitelist = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Counter count = new Counter("iterations");
        Arrays.sort(whitelist);
        for (int i = 0; i < keys.length; i++) {
            binarySearch(keys[i], whitelist, count);
        }
        System.out.println(count);
        System.out.print("\n\n");
    }

    private static int binarySearch(int key, int[] arr, Counter count) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            count.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < arr[mid]) hi = mid - 1;
            else if (key > arr[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
