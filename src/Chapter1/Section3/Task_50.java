package Chapter1.Section3;
import  Chapter1.Section3.Structures.Stack;
import  java.util.ConcurrentModificationException;

/**
 * Ex. 1.3.50 <br>
 * {@link Stack} structure located in Chapter1.Section3.Structures <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_50 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.50 --");

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 3; i++) {
            stack.push(i);
        }

        System.out.println("Stack: " + stack);

        try {
            for (int i : stack) {
                if (i == 1) {
                    System.out.println("Doing push operation to Stack");
                    stack.push(999);
                    System.out.println("Done, exception will be caught in next iteration");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught");
        }
    }
}

/*
Result example:
Stack: [2, 1, 0]
Doing push operation to Stack
Done, exception will be caught in next iteration
ConcurrentModificationException caught
 */
