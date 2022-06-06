package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;

/**
 * Ex. 1.3.2 <br>
 * 03.02.2022 <br>
 * FixedCapacityStackOfStrings structure located in Chapter1.Section3.Structures
 * @author xairaven
 */
public class Task_02 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.2 --");
        Stack<String> stack = new Stack<>();
        String input = "it was - the best - of times - - - it was - the - -";
        String[] arr = input.split(" ");
        for(String item: arr) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
        System.out.printf("\n(%d element left on stack)", stack.size());
    }
}

/*
Result:
was best times of the was the it
(1 element left on stack)
 */