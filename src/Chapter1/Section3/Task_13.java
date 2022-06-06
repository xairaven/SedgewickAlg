package Chapter1.Section3;
import java.util.Arrays;
import edu.princeton.cs.algs4.Queue;

/**
 * Ex. 1.3.13 <br>
 * 10.02.2022
 * @author xairaven
 */
public class Task_13 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.13 --");

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("A) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        System.out.printf("B) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {2, 5, 6, 7, 4, 8, 9, 3, 1, 0};
        System.out.printf("C) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {4, 3, 2, 1, 0, 5, 6, 7, 8, 9};
        System.out.printf("D) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));
    }

    private static boolean checkSequence(int[] arr) {
        Queue<Integer> q = new Queue<>();
        int index = 0;
        for (int i = 0; i <= 9; i++) {
            q.enqueue(i);
            if (q.dequeue() != arr[index]) return false;
            index++;
        }
        return true;
    }
}

/*
Result:
Sequences that can occur -> true, that could not occur -> false
A) [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] -> true
B) [4, 6, 8, 7, 5, 3, 2, 9, 0, 1] -> false
C) [2, 5, 6, 7, 4, 8, 9, 3, 1, 0] -> false
D) [4, 3, 2, 1, 0, 5, 6, 7, 8, 9] -> false

The sequences that could not occur are: B, C, D
 */
