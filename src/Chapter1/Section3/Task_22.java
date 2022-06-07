package Chapter1.Section3;

/**
 * Ex. 1.3.22 <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_22 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.22 --");
        System.out.println("""
                t.next = x.next;
                x.next = t;
                
                Answer: Inserts node t immediately after node x.
                """);
    }
}
