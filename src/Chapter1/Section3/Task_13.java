package Chapter1.Section3;
import java.util.Arrays;
//10.02.2022
//Ex. 1.3.13
public class Task_13 {
    public static void main() {
        System.out.println("-- Task 1.3.13 --");
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("A) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[]{4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        System.out.printf("B) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[]{2, 5, 6, 7, 4, 8, 9, 3, 1, 0};
        System.out.printf("C) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[]{4, 3, 2, 1, 0, 5, 6, 7, 8, 9};
        System.out.printf("D) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        System.out.print("\n\n");
    }

    private static boolean checkSequence(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
