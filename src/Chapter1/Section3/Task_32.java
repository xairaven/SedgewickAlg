package Chapter1.Section3;
import Chapter1.Section3.Structures.Steque;

/**
 * Ex. 1.3.32 <br>
 * {@link Steque} structure located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_32 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.32 --");

        var steque = new Steque<Integer>();
        for (int i = 0; i < 5; i++) {
            steque.push(i);
        }
        System.out.println("Steque after pushing 5 elems (stack operation):\n" + steque);

        for (int i = 0; i < 5; i++) {
            steque.enqueue(i);
        }
        System.out.println("Steque after enqueuing 5 elems (queue operation):\n" + steque);

        System.out.println("Popping 5 elems from start (stack operation)");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Popping element %d\n", steque.pop());
        }
        System.out.println("Steque: " + steque);
    }
}

/*
Steque API:
void push(T item)
- stack-like push operation (push at the start)

T pop()
- stack-like pop operation (pop element from the start)

void enqueue(T item)
- queue-like push operation (push at the end)

T peek()
- return value from the start without popping

boolean isEmpty()
- is steque empty?

int size()
- size getter

@Override String toString()
- return String

implements Iterable<T>
 */

/*
Result example:
Steque after pushing 5 elems (stack operation):
[4, 3, 2, 1, 0]
Steque after enqueuing 5 elems (queue operation):
[4, 3, 2, 1, 0, 0, 1, 2, 3, 4]
Popping 5 elems from start (stack operation)
Popping element 4
Popping element 3
Popping element 2
Popping element 1
Popping element 0
Steque: [0, 1, 2, 3, 4]
 */
