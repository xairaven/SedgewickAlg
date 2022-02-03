package Chapter1.Section3;
//03.02.2022
//Ex. 1.3.3
public class Task_03 {
    public static void main() {
        System.out.println("-- Task 1.3.3 --");
        int[] arr = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
        System.out.printf("A) 4 3 2 1 0 9 8 7 6 5 -> %b\n", checkSequence(arr));

        arr = new int[]{4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        System.out.printf("B) 4 6 8 7 5 3 2 9 0 1 -> %b\n", checkSequence(arr));

        arr = new int[]{2, 5, 6, 7, 4, 8, 9, 3, 1, 0};
        System.out.printf("C) 2 5 6 7 4 8 9 3 1 0 -> %b\n", checkSequence(arr));

        arr = new int[]{4, 3, 2, 1, 0, 5, 6, 7, 8, 9};
        System.out.printf("D) 4 3 2 1 0 5 6 7 8 9 -> %b\n", checkSequence(arr));

        arr = new int[]{1, 2, 3, 4, 5, 6, 9, 8, 7, 0};
        System.out.printf("E) 1 2 3 4 5 6 9 8 7 0 -> %b\n", checkSequence(arr));

        arr = new int[]{0, 4, 6, 5, 3, 8, 1, 7, 2, 9};
        System.out.printf("F) 0 4 6 5 3 8 1 7 2 9 -> %b\n", checkSequence(arr));

        arr = new int[]{1, 4, 7, 9, 8, 6, 5, 3, 0, 2};
        System.out.printf("G) 1 4 7 9 8 6 5 3 0 2 -> %b\n", checkSequence(arr));

        arr = new int[]{2, 1, 4, 3, 6, 5, 8, 7, 9, 0};
        System.out.printf("H) 2 1 4 3 6 5 8 7 9 0 -> %b\n", checkSequence(arr));
        System.out.print("\n\n");
    }

    private static boolean checkSequence(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] - arr[i] >= 2) {
                return false;
            }
        }
        return true;
    }
}
