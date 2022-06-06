package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Ex. 1.3.4 <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_04 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.4 --");
        while (!StdIn.isEmpty()) {
            String str = StdIn.readLine();
            System.out.printf("%s -> %b\n", str, isBalanced(str));
        }
    }

    private static boolean isBalanced(String input) {
        char[] parentheses = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char parenthesis : parentheses) {
            if (parenthesis == '(' || parenthesis == '[' || parenthesis == '{') {
                stack.push(parenthesis);
            } else {
                if (stack.isEmpty()) return false;
                char symbol = stack.pop();
                if ((parenthesis == ')' && symbol != '(')
                        || (parenthesis == ']' && symbol != '[')
                        || (parenthesis == '}' && symbol != '{'))
                {return false;}
            }
        }
        return stack.isEmpty();
    }
}

/*
Input/Result example (Standard input):
Input:  [()]{}{[()()]()}
Prints: [()]{}{[()()]()} -> true
Input:  [(])
Prints: [(]) -> false
Ctrl+D
 */

