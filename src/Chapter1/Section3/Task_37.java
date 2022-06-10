package Chapter1.Section3;
import  edu.princeton.cs.algs4.Queue;

/**
 * Ex. 1.3.37 <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_37 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.37 --");

        if (args.length < 2) throw new IllegalArgumentException("you should input at least 2 args");

        int numberOfPeople = Integer.parseInt(args[0]);
        int modulus = Integer.parseInt(args[1]);

        System.out.println("Order in which people are eliminated:");
        josephusProblem(numberOfPeople, modulus);
    }

    private static void josephusProblem(int numberOfPeople, int modulus) {
        var q = new Queue<Integer>();
        for (int i = 0; i < numberOfPeople; i++) {
            q.enqueue(i);
        }
        while (numberOfPeople > 0) {
            for (int i = 1; i < modulus; i++) {
                q.enqueue(q.dequeue());
            }
            System.out.print(q.dequeue() + " ");
            numberOfPeople--;
        }
    }
}

/*
Input example (command prompt):
7 2

Result example:
Order in which people are eliminated:
1 3 5 0 4 2 6
 */