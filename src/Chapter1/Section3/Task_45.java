package Chapter1.Section3;
import  edu.princeton.cs.algs4.Stack;
import  java.util.Arrays;

/**
 * Ex. 1.3.45 <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_45 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.45 --");

        int[] data;
        String[] input;

        System.out.println("// ==================== Underflow tests ==================== //");
        input = "0 1 2 - - -".split("\\s++");
        System.out.printf("A) %s -> %b\n", Arrays.toString(input), stackUnderflow(input));

        input = "0 1 2 - - - 3 4 5 - - 6 - - -".split("\\s++");
        System.out.printf("B) %s -> %b\n", Arrays.toString(input), stackUnderflow(input));

        input = "0 - - 1 2 -".split("\\s++");
        System.out.printf("C) %s -> %b\n", Arrays.toString(input), stackUnderflow(input));

        System.out.println("// ==================== \"Can permutation be generated\" tests ==================== //");
        data = new int[] {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
        System.out.printf("A) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        System.out.printf("B) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {2, 5, 6, 7, 4, 8, 9, 3, 1, 0};
        System.out.printf("C) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {4, 3, 2, 1, 0, 5, 6, 7, 8, 9};
        System.out.printf("D) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {1, 2, 3, 4, 5, 6, 9, 8, 7, 0};
        System.out.printf("E) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {0, 4, 6, 5, 3, 8, 1, 7, 2, 9};
        System.out.printf("F) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {1, 4, 7, 9, 8, 6, 5, 3, 0, 2};
        System.out.printf("G) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {2, 1, 4, 3, 6, 5, 8, 7, 9, 0};
        System.out.printf("H) %s -> %b\n", Arrays.toString(data), permutation(data));

        data = new int[] {4, 3, 2, 1, 0, 5, 9, 7, 8, 6};
        System.out.printf("I) %s -> %b", Arrays.toString(data), permutation(data));
    }

    private static boolean stackUnderflow(String[] data) {
        int count = 0;

        for (String s : data) {
            count = (s.equals("-")) ? count - 1 : count + 1;
            if (count < 0) return true;
        }
        return false;
    }

    private static boolean permutation(int[] data) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i <= data.length; i++) {
            if (!stack.isEmpty() && stack.peek() == data[index]) {
                stack.pop();
                index++;
                i--;
                continue;
            }
            stack.push(i);
        }
        return index >= data.length;
    }
}

/*
Result example:
// ==================== Underflow tests ==================== //
A) [0, 1, 2, -, -, -] -> false
B) [0, 1, 2, -, -, -, 3, 4, 5, -, -, 6, -, -, -] -> true
C) [0, -, -, 1, 2, -] -> true
// ==================== "Can permutation be generated" tests ==================== //
A) [4, 3, 2, 1, 0, 9, 8, 7, 6, 5] -> true
B) [4, 6, 8, 7, 5, 3, 2, 9, 0, 1] -> false
C) [2, 5, 6, 7, 4, 8, 9, 3, 1, 0] -> true
D) [4, 3, 2, 1, 0, 5, 6, 7, 8, 9] -> true
E) [1, 2, 3, 4, 5, 6, 9, 8, 7, 0] -> true
F) [0, 4, 6, 5, 3, 8, 1, 7, 2, 9] -> false
G) [1, 4, 7, 9, 8, 6, 5, 3, 0, 2] -> false
H) [2, 1, 4, 3, 6, 5, 8, 7, 9, 0] -> true
I) [4, 3, 2, 1, 0, 5, 9, 7, 8, 6] -> false
 */