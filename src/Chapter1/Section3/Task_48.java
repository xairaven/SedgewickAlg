package Chapter1.Section3;
import  Chapter1.Section3.Structures.TwoStacksDeque;

/**
 * Ex. 1.3.48 <br>
 * {@link TwoStacksDeque} structure located in Chapter1.Section3.Structures <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_48 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.48 --");

        TwoStacksDeque<Integer> stacks = new TwoStacksDeque<>();
        System.out.println(stacks);

        for (int i = 0; i < 8; i += 2) {
            stacks.firstStackPush(i);
            stacks.secondStackPush(i + 1);
        }

        System.out.println(stacks);

        for (int i = 0; i < 4; i++) {
            stacks.firstStackPop();
            stacks.secondStackPop();
        }

        System.out.println(stacks);
    }
}

/*
Result example:
Stacks are empty
First stack: 6 4 2 0
Second stack: 1 3 5 7
Stacks are empty
 */