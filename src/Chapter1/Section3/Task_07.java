package Chapter1.Section3;
import  Chapter1.Section3.Structures.Stack;

/**
 * Ex. 1.3.7 <br>
 * {@link Stack} structure located in Chapter1.Section3.Structures <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_07 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.7 --");

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Before peek()");
        for(int i : stack) System.out.printf("%d ", i);

        System.out.printf("\nPeek = %d\n", stack.peek());

        System.out.println("After peek()");
        for(int i : stack) System.out.printf("%d ", i);
    }
}

/*
Result:
Before peek()
9 8 7 6 5 4 3 2 1 0
Peek = 9
After peek()
9 8 7 6 5 4 3 2 1 0
 */