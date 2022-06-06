package Chapter1.Section3;
import java.util.Arrays;
import edu.princeton.cs.algs4.Stack;

/**
 * Ex. 1.3.3 <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_03 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.3 --");

        int[] arr = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
        System.out.printf("A) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        System.out.printf("B) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {2, 5, 6, 7, 4, 8, 9, 3, 1, 0};
        System.out.printf("C) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {4, 3, 2, 1, 0, 5, 6, 7, 8, 9};
        System.out.printf("D) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {1, 2, 3, 4, 5, 6, 9, 8, 7, 0};
        System.out.printf("E) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {0, 4, 6, 5, 3, 8, 1, 7, 2, 9};
        System.out.printf("F) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {1, 4, 7, 9, 8, 6, 5, 3, 0, 2};
        System.out.printf("G) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));

        arr = new int[] {2, 1, 4, 3, 6, 5, 8, 7, 9, 0};
        System.out.printf("H) %s -> %b\n", Arrays.toString(arr), checkSequence(arr));
    }

    private static boolean checkSequence(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i <= 10; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[index]) {
                stack.pop();
                index++;
                i--;
                continue;
            }
            stack.push(i);
        }
        return index >= arr.length;
    }
}

/*
Result:
Sequences that can occur -> true, that could not occur -> false
A) [4, 3, 2, 1, 0, 9, 8, 7, 6, 5] -> true
B) [4, 6, 8, 7, 5, 3, 2, 9, 0, 1] -> false
C) [2, 5, 6, 7, 4, 8, 9, 3, 1, 0] -> true
D) [4, 3, 2, 1, 0, 5, 6, 7, 8, 9] -> true
E) [1, 2, 3, 4, 5, 6, 9, 8, 7, 0] -> true
F) [0, 4, 6, 5, 3, 8, 1, 7, 2, 9] -> false
G) [1, 4, 7, 9, 8, 6, 5, 3, 0, 2] -> false
H) [2, 1, 4, 3, 6, 5, 8, 7, 9, 0] -> true

The sequences that could not occur are: B, F, G
 */