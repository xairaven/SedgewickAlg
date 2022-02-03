package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
//03.02.2022
//Ex. 1.3.10
public class Task_10 {
    public static void main() {
        System.out.println("-- Task 1.3.10 --");
        String infixExpression = "( ( 1 + 2 ) * ( 4 / 2 ) )";
        String postfixExpression = infixToPostfix(infixExpression);
        if (postfixExpression.equals("1 2 + 4 2 / *")) {
            System.out.printf("Postfix expression: %s\nSame as expected", postfixExpression);
        }
        System.out.print("\n\n");
    }

    private static String infixToPostfix(String infixExpression) {
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        String[] inputValues = infixExpression.split("\\s");
        for (String value : inputValues) {
            if (value.equals("+")
                    || value.equals("-")
                    || value.equals("*")
                    || value.equals("/")) {
                operators.push(value);
            } else if (value.equals(")")) {
                String value2 = operands.pop();
                String value1 = operands.pop();
                String operator = operators.pop();
                String newExpression = value1 + " " + value2 + " " + operator;
                operands.push(newExpression);
            } else if (value.equals("(")) {
                //pass
            } else {
                    operands.push(value);
            }
        }
        return operands.pop();
    }
}
