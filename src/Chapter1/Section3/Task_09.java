package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;
//03.02.2022
//Ex. 1.3.9
public class Task_09 {
    public static void main() {
        System.out.println("-- Task 1.3.9 --");
        String str = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        System.out.printf("Start string: %s\nResult string: %s", str, getExpression(str));
        System.out.print("\n\n");
    }

    private static String getExpression(String input) {
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        String[] inputValues = input.split("\\s");
        for (String value : inputValues) {
            if (value.equals("+")
                    || value.equals("-")
                    || value.equals("*")
                    || value.equals("/")) {
                operators.push(value);
            } else if (value.equals(")")) {
                String operator = operators.pop();
                String value2 = operands.pop();
                String value1 = operands.pop();
                String subExpression = "( " + value1 + " " + operator + " " + value2 + " )";
                operands.push(subExpression);
            } else if (value.equals("(")) {
                //pass
            } else {
                operands.push(value);
            }
        }
        return operands.pop();
    }
}
