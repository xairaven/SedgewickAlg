package Chapter1.Section3;
import Chapter1.Section3.Structures.FixedCapacityStackOfStrings;

/**
 * Ex. 1.3.1 <br>
 * {@link FixedCapacityStackOfStrings} structure located in Chapter1.Section3.Structures <br>
 * 02.02.2022
 * @author xairaven
 */
public class Task_01 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.1 --");
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(3);
        System.out.printf("Full stack? Answer: %b, Expected: false\n", stack.isFull());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.printf("Full stack? Answer: %b, Expected: true", stack.isFull());
    }
}

