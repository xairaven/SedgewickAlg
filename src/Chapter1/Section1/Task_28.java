package Chapter1.Section1;
import java.util.Arrays;

/**
 * Ex. 1.1.28 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_28 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.28 --");
        int[] whitelist = {1, 2, 1, 3, 4, 5, 2, 3, 4, 4, 5, 6, 7}; //Array should be sorted
        int key = 5;
        Arrays.sort(whitelist );
        for(int i = 1; i < whitelist .length; i++) {
            if (whitelist [i] == whitelist [i - 1]) {
                whitelist  = deleteElem(whitelist , i);
               i--;
            }
        }
        int resultIndex = rank(key, whitelist, 0, whitelist.length-1, 0);
        System.out.printf("\nResult index = %d", resultIndex);
    }

    public static int[] deleteElem(int[] arr, int index) {
        int[] resultArray = new int[arr.length - 1];
        for (int i = 0; i < resultArray.length; i++) {
            if(i < index) {
                resultArray[i] = arr[i];
            } else {
                resultArray[i] = arr[i + 1];
            }
        }
        return resultArray;
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
