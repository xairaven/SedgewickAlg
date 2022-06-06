package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;

/**
 * Ex. 1.3.11 <br>
 * 10.02.2022
 * @author xairaven
 */
public class Task_11 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.11 --");
        if (args.length < 1) throw new IllegalArgumentException("you have to input 1 arg");

        String postfixExp = args[0];
        System.out.printf("Postfix expression: %s\n", postfixExp);
        System.out.printf("Result: %d", evaluatePostfix(postfixExp));
    }

    private static int evaluatePostfix(String postfixExp) {
        Stack<Integer> operands = new Stack<>();
        String[] values = postfixExp.split("\\s");

        for (String value : values) {
            switch (value) {
                case "+", "-", "*", "/" -> {
                    int result = 0;
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    switch (value) {
                        case "+" -> result = operand1 + operand2;
                        case "-" -> result = operand1 - operand2;
                        case "*" -> result = operand1 * operand2;
                        case "/" -> result = operand1 / operand2;
                    }
                    operands.push(result);
                }
                default -> operands.push(Integer.parseInt(value));
            }
        }
        return operands.pop();
    }
}

/*
Input (command prompt) example:
"4 4 + 3 1 - /"

Example of result:
Postfix expression: 4 4 + 3 1 - /
Result: 4
 */
