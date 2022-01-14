package Chapter1.Section1;
import java.util.Arrays;
//14.01.2022
//Ex. 1.1.29
public class Task_29 {
    public static void main() {
        System.out.println("-- Task 1.1.29 --");
        int[] arr = {0, 0, 0, 1, 2, 4, 5, 6, 7}; //Array should be sorted
        int key = 5;
        Arrays.sort(arr);
        int resultIndex = Task_22.rank(key, arr, 0, arr.length-1, 0);
        int equal = rank(key, arr);
        int count = count(key, arr);
        System.out.printf("\nResult index = %d", resultIndex);
        System.out.printf("\nRank = %d", equal);
        System.out.printf("\nCount = %d", count);
        System.out.print("\n\n");
    }

    public static int rank(int key, int[] arr) {
        int equal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < key) equal++;
        }
        return equal;
    }

    public static int count(int key, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
        }
        return count;
    }
}
