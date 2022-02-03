package Chapter1.Section3;
import StructAlgsXai.FixedCapacityStackOfStrings;
//02.02.2022
//Ex. 1.3.1
public class Task_01 {
    public static void main() {
        System.out.println("-- Task 1.3.1 --");
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(3);
        System.out.printf("Full stack? Answer: %b, Expected: false\n", stack.isFull());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.printf("Full stack? Answer: %b, Expected: true", stack.isFull());
        System.out.print("\n\n");
    }
}

