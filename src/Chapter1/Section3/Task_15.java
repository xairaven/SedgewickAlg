package Chapter1.Section3;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

/**
 * Ex. 1.3.15 <br>
 * 06.06.2022
 * @author xairaven
 */
public class Task_15 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.15 --");
        if (args.length < 1) throw new IllegalArgumentException("you should input at least 1 arg");
        int k = Integer.parseInt(args[0]);

        Queue<String> queue = new Queue<>();
        while (!StdIn.isEmpty()) {
            queue.enqueue(StdIn.readString());
        }

        System.out.println("Queue - [ " + queue + "]");
        System.out.println("K = " + k);

        String result = printKthString(k, queue);
        if (result != null) {
            System.out.println("K-th value in queue from the last element - " + printKthString(k, queue));
        } else {
            System.out.println("K greater than queue size");
        }
    }

    private static String printKthString(int k, Queue<String> q) {
        if (q.size() - k < 0) return null;

        int i = 0;

        for (String str : q) {
            if (i == q.size() - k) return str;
            i++;
        }
        return null;
    }
}

/*
Input example (command prompt):
3
^-- Number k, function prints K-th String in Queue from end

Input example (standard input):
A
B
C
D
E
^D

Result example:
Queue - [ A B C D E ]
K = 3
K-th value in queue from the last element - C
 */
