package Chapter1.Section3;

/**
 * Ex. 1.3.23 <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_23 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.23 --");
        System.out.println("""
                Why does the following code fragment not do the same thing as in the previous question?
                
                x.next = t;
                t.next = x.next;
                
                Answer: When it comes time to update t.next,
                x.next is no longer the original node following x,
                but is instead t itself!
                """);
    }
}
