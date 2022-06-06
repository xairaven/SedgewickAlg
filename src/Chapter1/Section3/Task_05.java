package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * Ex. 1.3.5 <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_05 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.5 --");
        System.out.printf("Number %d in BIN: \n", 50);
        function(50);
    }

    private static void function(int N) {
        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int d : stack) StdOut.print(d);
        StdOut.println();
    }
}

/*
Prints the binary representation of N (110010 when N is 50).

Input: 50

Result ->
Number 50 in BIN:
110010
 */