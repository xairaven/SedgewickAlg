package Chapter1.Section1;
import java.util.Arrays;
//14.01.2022
//Ex. 1.1.28
public class Task_28 {
    public static void main() {
        System.out.println("-- Task 1.1.28 --");
        int[] arr = {1, 2, 1, 3, 4, 5, 2, 3, 4, 4, 5, 6, 7}; //Array should be sorted
        int key = 5;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
               arr = deleteElem(arr, i);
               i--;
            }
        }
        int resultIndex = Task_22.rank(key, arr, 0, arr.length-1, 0);
        System.out.printf("\nResult index = %d", resultIndex);
        System.out.print("\n\n");
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
}
