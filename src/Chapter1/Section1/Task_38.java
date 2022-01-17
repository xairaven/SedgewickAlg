package Chapter1.Section1;
import java.util.Arrays;
import edu.princeton.cs.introcs.In;
//15.01.2022
//Ex. 1.1.38
public class Task_38 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.38 --");
        if(args.length < 1) {
            System.out.println("Main -> Edit configurations -> Program Arguments -> resources/largeW.txt");
            System.exit(0);
        }
        int key = 785481;
        In in = new In(args[0]);
        int[] array = in.readAllInts();
        Arrays.sort(array);
        long startTime = System.nanoTime();
        System.out.printf("Bruteforce: %d\n", bruteForceSearch(key, array));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.printf("Duration: %d nanoseconds.\n", duration);
        startTime = System.nanoTime();
        System.out.printf("BinarySearch: %d\n", binarySearch(key, array, 0, array.length - 1));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.printf("Duration: %d nanoseconds.\n\n", duration);
        System.out.println("You can check results in largeWSorted.txt");
        System.out.println("Main -> Edit configurations -> Program Arguments -> resources/largeW.txt");
        System.out.println("\n");
    }

    public static int bruteForceSearch(int key, int[] array) {
        if (array == null) throw new IllegalArgumentException();
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                result = i;
            }
        }
        return result;
    }

    public static int binarySearch(int key, int[] arr, int lo, int hi) {
        if (arr == null) throw new IllegalArgumentException();
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
