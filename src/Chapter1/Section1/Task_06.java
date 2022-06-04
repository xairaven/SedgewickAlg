package Chapter1.Section1;
import edu.princeton.cs.algs4.StdOut;

/**
 * Ex. 1.1.6 <br>
 * 11.01.2022
 * @author xairaven
 */
public class Task_06 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.6 --");
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}

/*
Result (First 16 members of the Fibonacci sequence):
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
*/
