package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
//10.02.2022
//Ex. 1.3.11
public class Task_11 {
    public static void main(String[] postfixExp) {
        System.out.println("-- Task 1.3.11 --");
        if (postfixExp.length < 1) {
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input");
            return;
        }
        System.out.printf("Result: %d", evaluatePostfix(postfixExp[0]));
        System.out.print("\n\n");
    }

    private static int evaluatePostfix(String postfixExp) {
        Stack<Integer> operands = new Stack<>();
        String[] values = postfixExp.split("\\s");
        for (String s : values) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int result = 0;
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                if (s.equals("+")) {
                    result = operand1 + operand2;
                } else if (s.equals("-")) {
                    result = operand1 - operand2;
                } else if (s.equals("*")) {
                    result = operand1 * operand2;
                } else if (s.equals("/")) {
                    result = operand1 / operand2;
                }
                operands.push(result);
            } else {
                operands.push(Integer.parseInt(s));
            }
        }
        return operands.pop();
    }
}
