package Chapter1.Section3;
import StructAlgsXai.Stack;
import edu.princeton.cs.algs4.StdOut;
//03.02.2022
//Ex. 1.3.5
public class Task_05 {
    public static void main(int N) {
        System.out.println("-- Task 1.3.5 --");
        System.out.printf("Number %d in BIN: ", N);
        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0)
        {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int d : stack) StdOut.print(d);
        StdOut.println();
        System.out.print("\n\n");
    }
}
