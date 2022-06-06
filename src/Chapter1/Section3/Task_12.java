package Chapter1.Section3;
import  Chapter1.Section3.Structures.Stack;

/**
 * Ex. 1.3.12 <br>
 * 10.02.2022  <br>
 * Stack structure located in Chapter1.Section3.Structures
 * @author xairaven
 */
public class Task_12 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.12 --");

        Stack<String> stack = new Stack<>();
        stack.push("1st");
        stack.push("2nd");
        stack.push("3rd");

        Stack<String> copy = stack.copy();

        System.out.println("Initial stack:");
        for (String s : copy) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Copy:");
        for (String s : copy) {
            System.out.println(s);
        }
    }
}
