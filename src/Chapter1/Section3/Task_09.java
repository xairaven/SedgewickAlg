package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Ex. 1.3.9 <br>
 * 03.02.2022
 * @author xairaven
 */
public class Task_09 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.9 --");
        while (!StdIn.isEmpty()) {
            String str = StdIn.readLine();
            System.out.println("Result string: " + getExpression(str) + "\n");
        }
    }

    private static String getExpression(String input) {
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        String[] inputValues = input.split("\\s");

        for (String value : inputValues) {
            switch (value) {
                case "+", "-", "*", "/" -> operators.push(value);
                case "(" -> {}
                case ")" -> {
                    String operator = operators.pop();
                    String value2 = operands.pop();
                    String value1 = operands.pop();
                    String subExpression = "( " + value1 + " " + operator + " " + value2 + " )";
                    operands.push(subExpression);
                }
                default -> operands.push(value);
            }
        }
        return operands.pop();
    }
}

/*
Input example:
1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )

Result example:
Result string: ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )
 */
