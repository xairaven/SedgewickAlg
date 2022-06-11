package Chapter1.Section3;
import  Chapter1.Section3.Structures.Stack;
import  Chapter1.Section3.Structures.Queue;
import  Chapter1.Section3.Structures.Steque;
import  Chapter1.Section3.Structures.CircularList;

/**
 * Ex. 1.3.47 <br>
 * {@link Stack}, {@link Queue}, {@link Steque}, {@link CircularList} structures located in Chapter1.Section3.Structures <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_47 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.47 --");

        System.out.println("// --- Stack tests -- //");
        Stack<Integer> fStack = new Stack<>();
        Stack<Integer> sStack = new Stack<>();
        for (int i = 0; i < 3; i++) fStack.push(i);
        for (int i = 3; i < 6; i++) sStack.push(i);

        System.out.println("Before concatenation:");
        System.out.println("First stack: " + fStack);
        System.out.println("Second stack: " + sStack);

        fStack.catenation(sStack);

        System.out.println("After concatenation:");
        System.out.println("First stack: " + fStack);
        System.out.println("Second stack: " + sStack);

        System.out.println();

        System.out.println("// --- Queue tests -- //");
        Queue<Integer> fQueue = new Queue<>();
        Queue<Integer> sQueue = new Queue<>();
        for (int i = 0; i < 3; i++) fQueue.enqueue(i);
        for (int i = 3; i < 6; i++) sQueue.enqueue(i);

        System.out.println("Before concatenation:");
        System.out.println("First queue: " + fQueue);
        System.out.println("Second queue: " + sQueue);

        fQueue.catenation(sQueue);

        System.out.println("After concatenation:");
        System.out.println("First queue: " + fQueue);
        System.out.println("Second queue: " + sQueue);

        System.out.println();

        System.out.println("// --- Steque tests -- //");
        Steque<Integer> fSteque = new Steque<>();
        Steque<Integer> sSteque = new Steque<>();
        for (int i = 0; i < 3; i++) fSteque.push(i);
        for (int i = 3; i < 6; i++) sSteque.push(i);

        System.out.println("Before concatenation:");
        System.out.println("First steque: " + fSteque);
        System.out.println("Second steque: " + sSteque);

        fSteque.catenation(sSteque);

        System.out.println("After concatenation:");
        System.out.println("First steque: " + fSteque);
        System.out.println("Second steque: " + sSteque);
    }
}

/*
Result example:
// --- Stack tests -- //
Before concatenation:
First stack: [2, 1, 0]
Second stack: [5, 4, 3]
After concatenation:
First stack: [2, 1, 0, 5, 4, 3]
Second stack: []

// --- Queue tests -- //
Before concatenation:
First queue: [0, 1, 2]
Second queue: [3, 4, 5]
After concatenation:
First queue: [0, 1, 2, 3, 4, 5]
Second queue: []

// --- Steque tests -- //
Before concatenation:
First steque: [2, 1, 0]
Second steque: [5, 4, 3]
After concatenation:
First steque: [2, 1, 0, 5, 4, 3]
Second steque: []
 */
