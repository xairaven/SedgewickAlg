package Chapter1.Section3;
import  Chapter1.Section3.Structures.RandomQueue;

/**
 * Ex. 1.3.36 <br>
 * {@link RandomQueue} structure located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_36 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.36 --");

        var q = new RandomQueue<Integer>();
        for (int i = 0; i < 8; i++) {
            q.enqueue(i);
        }

        System.out.println("Queue:");
        for (int i : q) {
            System.out.print(i + " ");
        }

        System.out.println("\nSame queue:");
        for (int i : q) {
            System.out.print(i + " ");
        }
    }
}

/*
Result example:
Queue:
0 2 4 3 5 1 6 7
Same queue:
6 1 4 3 7 0 2 5
 */
