package Chapter1.Section3;
import  Chapter1.Section3.Structures.QueueWithFiveStacks;

/**
 * Ex. 1.3.49 <br>
 * {@link QueueWithFiveStacks} structure located in Chapter1.Section3.Structures <br>
 * Five stacks implementation instead three-stacks :(
 * 11.06.2022
 * @author xairaven
 */
public class Task_49 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.49 --");

        var queue = new QueueWithFiveStacks<Integer>();
        queue.enqueue(0);

        queue.dequeue();
        System.out.println("Queue size: " + queue.size());

        for (int i = 1; i <= 3; i++) {
            queue.enqueue(i);
        }

        System.out.println("\nQueue size: " + queue.size());
        System.out.println("Queue: " + queue);

        queue.enqueue(4);
        System.out.println("\nQueue: " + queue);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("\nQueue size: " + queue.size());
        System.out.println("Queue: " + queue);
    }
}

/*
Result example:
Queue size: 0

Queue size: 3
Queue: [ 1 2 3 ]

Queue: [ 1 2 3 4 ]

Queue size: 1
Queue: [ 4 ]
 */