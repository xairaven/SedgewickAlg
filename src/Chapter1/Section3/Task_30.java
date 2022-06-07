package Chapter1.Section3;
import Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.30 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_30 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.30 --");

        List<Integer> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(i);
        }
        System.out.println("List - " + list);

        list.reverse();
        System.out.println("List (reversed) - " + list);

        list.reverseRecursive();
        System.out.println("List (recursive reversed) - " + list);
    }
}
