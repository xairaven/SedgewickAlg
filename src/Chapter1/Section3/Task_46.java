package Chapter1.Section3;

/**
 * Ex. 1.3.46 <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_46 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.46 --");
        System.out.println("""
                Suppose that there is a forbidden triple (a, b, c).
                Item c is popped before a and b, but a and b are pushed before c.
                Thus, when c is pushed, both a and b are on the stack.
                Therefore, a cannot be popped before b.
                
                When pushing items in the order 0, 1, ..., N-1,
                all items are above smaller items on the stack because they are pushed after smaller items.
                If a < b, "a" cannot be above "b" on the stack.
                Therefore, a permutation would not exist when a forbidden triple exists.
                """);
    }
}
