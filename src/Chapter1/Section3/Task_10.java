package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;

/**
 * Ex. 1.3.10 <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.10 --");

        String infixExpression = "( ( 1 + 3 ) * ( 9 / 3 ) )";
        String postfixExpression = infixToPostfix(infixExpression);

        System.out.println("Postfix: " + postfixExpression);
    }

    private static String infixToPostfix(String infixExpression) {
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        String[] inputValues = infixExpression.split("\\s");

        for (String value : inputValues) {
            switch (value) {
                case "+", "-", "*", "/" -> operators.push(value);
                case "(" -> {}
                case ")" -> {
                    String value2 = operands.pop();
                    String value1 = operands.pop();
                    String operator = operators.pop();
                    String newExpression = value1 + " " + value2 + " " + operator;
                    operands.push(newExpression);
                }
                default -> operands.push(value);
            }
        }
        return operands.pop();
    }
}

/*
Input example:
( ( 1 + 3 ) * ( 9 / 3 ) )

Result:
Postfix: 1 3 + 9 3 / *
 */