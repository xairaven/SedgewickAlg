package Chapter1.Section3;
import  Chapter1.Section3.Structures.Queue;

/**
 * Ex. 1.3.41 <br>
 * {@link Queue} structure located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_41 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.41 --");

        Queue<Integer> q = new Queue<>();
        for (int i = 0; i < 5; i++) {
            q.enqueue(i);
        }
        System.out.println("Original queue: " + q);

        Queue<Integer> r = new Queue<>(q);
        System.out.println("Copied queue: " + r);
    }
}

/*
Result example:
Original queue: [0, 1, 2, 3, 4]
Copied queue: [0, 1, 2, 3, 4]
 */