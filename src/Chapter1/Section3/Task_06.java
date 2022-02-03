package Chapter1.Section3;
import StructAlgsXai.Stack;
import StructAlgsXai.Queue;
//03.02.2022
//Ex. 1.3.6
public class Task_06 {
    public static void main() {
        System.out.println("-- Task 1.3.6 --");
        Queue<String> q = new Queue<>();
        for (int i = 0; i < 15; i++) {
            q.enqueue(Integer.toString(i));
        }

        Stack<String> stack = new Stack<String>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());

        System.out.println("Queue: ");
        for(String elem : q) {
            System.out.print(elem + " ");
        }
        System.out.println("\nStack: ");
        for(String elem : stack) {
            System.out.print(elem + " ");
        }
        System.out.println("Stack is empty.\n\nThis code reverses queue.");
        System.out.print("\n\n");
    }
}
