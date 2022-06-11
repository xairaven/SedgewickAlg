package Chapter1.Section3;
import  Chapter1.Section3.Structures.Stack;

/**
 * Ex. 1.3.42 <br>
 * {@link Stack} structure located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_42 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.42 --");

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 5; i++) {
            s.push(i);
        }
        System.out.println("Original stack: " + s);

        Stack<Integer> t = new Stack<>(s);
        System.out.println("Copied stack: " + t);
    }
}

/*
Result example:
Original stack: [4, 3, 2, 1, 0]
Copied stack: [4, 3, 2, 1, 0]
 */