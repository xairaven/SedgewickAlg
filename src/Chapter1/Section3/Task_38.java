package Chapter1.Section3;
import  Chapter1.Section3.Structures.GeneralizedQueue;
import  Chapter1.Section3.Structures.GeneralizedQueueArray;

/**
 * Ex. 1.3.38 <br>
 * {@link GeneralizedQueue} & {@link GeneralizedQueueArray} structures located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_38 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.38 --");

        System.out.println("-- Generalized Queue (Array) --");
        var queueArray = new GeneralizedQueueArray<Integer>();
        for (int i = 0; i < 8; i++) {
            queueArray.insert(i);
        }

        System.out.println("Array-queue: " + queueArray);

        System.out.printf("Queue after deleting %dth element (%d): \n%s\n\n",
                1, queueArray.delete(1), queueArray);

        System.out.printf("Queue after deleting %dth element (%d): \n%s\n\n",
                3, queueArray.delete(3), queueArray);

        System.out.printf("Queue after deleting %dth element (%d): \n%s\n\n",
                5, queueArray.delete(5), queueArray);

        System.out.println("-- Generalized Queue --");
        var queue = new GeneralizedQueue<Integer>();

        for (int i = 0; i < 8; i++) {
            queue.insert(i);
        }

        System.out.println("Array-queue: " + queue);

        System.out.printf("Queue after deleting %dth element (%d): \n%s\n\n",
                1, queue.delete(1), queue);

        System.out.printf("Queue after deleting %dth element (%d): \n%s\n\n",
                3, queue.delete(3), queue);

        System.out.printf("Queue after deleting %dth element (%d): \n%s",
                5, queue.delete(5), queue);
    }
}

/*
Result example:
-- Generalized Queue (Array) --
Array-queue: [0, 1, 2, 3, 4, 5, 6, 7]
Queue after deleting 1th element (0):
[1, 2, 3, 4, 5, 6, 7]

Queue after deleting 3th element (3):
[1, 2, 4, 5, 6, 7]

Queue after deleting 5th element (6):
[1, 2, 4, 5, 7]

-- Generalized Queue --
Array-queue: [7, 6, 5, 4, 3, 2, 1, 0]
Queue after deleting 1th element (0):
[7, 6, 5, 4, 3, 2, 1]

Queue after deleting 3th element (3):
[7, 6, 5, 4, 2, 1]

Queue after deleting 5th element (6):
[7, 5, 4, 2, 1]
 */
