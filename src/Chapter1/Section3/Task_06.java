package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.Queue;

/**
 * Ex. 1.3.6 <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_06 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.6 --");
        Queue<String> q = new Queue<>();
        for (int i = 0; i < 15; i++) {
            q.enqueue(Integer.toString(i));
        }

        System.out.println("Queue before function: ");
        for(String elem : q) {
            System.out.print(elem + " ");
        }
        System.out.println("\n");

        function(q);

        System.out.println("Queue after: ");
        for(String elem : q) {
            System.out.print(elem + " ");
        }

        System.out.println("""
                \n
                Stack is empty.
                This code reverses queue.""");
    }

    private static void function(Queue<String> q) {
        Stack<String> stack = new Stack<String>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());
    }
}

/*
Code inverts the order of the queue values

Result:
Queue before function:
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14

Queue after:
14 13 12 11 10 9 8 7 6 5 4 3 2 1 0

Stack is empty.
This code reverses queue.
 */
