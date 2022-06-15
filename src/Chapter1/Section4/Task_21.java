package Chapter1.Section4;
import  Chapter1.Section4.Structures.StaticSETofInts;
import  java.util.Arrays;

/**
 * Ex. 1.4.21 <br>
 * {@link StaticSETofInts} structure located in Chapter1.Section4.Structures <br>
 * 15.06.2022
 * @author xairaven
 */
public class Task_21 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.21 --");

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        var set = new StaticSETofInts(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.printf("Is Set contains %d? %b\n", 3, set.contains(3));
        System.out.printf("Is Set contains %d? %b\n", 5, set.contains(5));
        System.out.printf("Is Set contains %d? %b", 1, set.contains(1));
    }
}

/*
Result example:
Array: [1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4]
Is Set contains 3? true
Is Set contains 5? false
Is Set contains 1? true
 */