package Chapter1.Section3;
import  Chapter1.Section3.Structures.QueueCircular;

/**
 * Ex. 1.3.29 <br>
 * {@link QueueCircular} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_29 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.29 --");

        QueueCircular<Integer> queue = new QueueCircular<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        System.out.println("Circular Queue - " + queue);

        while (!queue.isEmpty()) {
            System.out.printf("Dequeue | Element - %d, Queue - %s\n", queue.dequeue(), queue);
        }
    }
}

/*
Result:

 */