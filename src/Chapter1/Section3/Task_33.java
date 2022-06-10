package Chapter1.Section3;
import  Chapter1.Section3.Structures.Deque;
import  Chapter1.Section3.Structures.ResizingArrayDeque;

/**
 * Ex. 1.3.33 <br>
 * {@link Deque} & {@link ResizingArrayDeque} structures located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_33 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.33 --");

        System.out.println("Deque");
        var deque = new Deque<Integer>();

        System.out.printf("Is deque empty? - %b\n", deque.isEmpty());

        deque.pushRight(2);
        deque.pushLeft(1);

        System.out.println("Deque: " + deque);

        deque.popLeft();
        deque.popRight();
        System.out.printf("Is deque empty (after deleting elements)? - %b\n\n", deque.isEmpty());

        // --------------------------------------------------------------- //

        System.out.println("Resizing array Deque");
        var arrDeque = new ResizingArrayDeque<Integer>();

        System.out.printf("Is deque empty? - %b\n", arrDeque.isEmpty());

        arrDeque.pushRight(2);
        arrDeque.pushLeft(1);

        System.out.println("Deque: " + arrDeque);

        arrDeque.popLeft();
        arrDeque.popRight();
        System.out.printf("Is deque empty (after deleting elements)? - %b", deque.isEmpty());
    }
}

/*
Result example:
Deque
Is deque empty? - true
Deque: [1, 2]
Is deque empty (after deleting elements)? - true

Resizing array Deque
Is deque empty? - true
Deque: [1, 2]
Is deque empty (after deleting elements)? - true
 */