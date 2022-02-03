package Chapter1.Section3;
import StructAlgsXai.Stack;
//03.02.2022
//Ex. 1.3.4
public class Task_04 {
    public static void main() {
        System.out.println("-- Task 1.3.4 --");
        String str;
        str = "[()]{}{[()()]()}";
        System.out.printf("%s -> %b\n", str, isBalanced(str));
        str = "[(])";
        System.out.printf("%s -> %b\n", str, isBalanced(str));
        System.out.print("\n\n");
    }

    private static boolean isBalanced(String input) {
        char[] parentheses = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char parenthesis : parentheses) {
            if (parenthesis == '(' || parenthesis == '[' || parenthesis == '{') {
                stack.push(parenthesis);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char firstItem = stack.pop();
                if (parenthesis == ')' && firstItem != '('
                        || parenthesis == ']' && firstItem != '['
                        || parenthesis == '}' && firstItem != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

