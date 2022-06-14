package Chapter1.Section4;
import  java.util.ArrayList;
import  java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.12 --");
        int[] arr1 = {0, 1, 1, 1, 2, 5, 8};
        int[] arr2 = {-3, 2, 0, 8, 7};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        ArrayList<Integer> list = intersection(arr1, arr2);

        System.out.println("\nList:");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> intersection(int[] array1, int[] array2){
        int[] arr1 = new int[array1.length];
        System.arraycopy(array1, 0, arr1, 0, array1.length);

        int[] arr2 = new int[array2.length];
        System.arraycopy(array2, 0, arr2, 0, array2.length);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();

        int id1 = 0;
        int id2 = 0;
        int value = (int) Double.POSITIVE_INFINITY;

        while (id1 < arr1.length && id2 < arr2.length) {
            if      (arr1[id1] < arr2[id2]) id1++;
            else if (arr1[id1] > arr2[id2]) id2++;
            else {
                if (value != arr1[id1]) {
                    value = arr1[id1];
                    list.add(value);
                }
                id1++;
                id2++;
            }
        }

        return list;
    }
}

/*
Result example:
Array 1: [0, 1, 1, 1, 2, 5, 8]
Array 2: [-3, 2, 0, 8, 7]

List:
0 2 8
 */