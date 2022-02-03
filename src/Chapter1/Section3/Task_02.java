package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
//03.02.2022
//Ex. 1.3.2
public class Task_02 {
    public static void main() {
        System.out.println("-- Task 1.3.2 --");
        Stack<String> stack = new Stack<>();
        String str = "it was - the best - of times - - - it was - the - -";
        String[] arr = str.split(" ");
        for(String item: arr) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
        //was best times of the was the it
        //(1 elem left on stack)
        System.out.printf("\n(%d elem left on stack)", stack.size());
        System.out.print("\n\n");
    }
}