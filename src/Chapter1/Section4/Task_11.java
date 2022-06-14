package Chapter1.Section4;
import  Chapter1.Section4.Structures.StaticSETofInts;
import  java.util.Arrays;

/**
 * Ex. 1.4.11 <br>
 * {@link StaticSETofInts} structure located in Chapter1.Section4.Structures <br>
 * 13.06.2022
 * @author xairaven
 */
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.11 --");

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4};
        var set = new StaticSETofInts(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.printf("How many numbers %d in set: %d\n", 1, set.howMany(1));
        System.out.printf("How many numbers %d in set: %d\n", 2, set.howMany(2));
        System.out.printf("How many numbers %d in set: %d\n", 3, set.howMany(3));
        System.out.printf("How many numbers %d in set: %d\n", 4, set.howMany(4));
    }
}

/*
Result example:
Array: [1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4]
How many numbers 1 in set: 3
How many numbers 2 in set: 2
How many numbers 3 in set: 4
How many numbers 4 in set: 4
 */