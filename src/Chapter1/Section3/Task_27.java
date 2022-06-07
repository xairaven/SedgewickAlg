package Chapter1.Section3;
import Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.27 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_27 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.27 --");

        List<Integer> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(i);
        }
        for (int i = 5; i > 0; i--) {
            list.push(i);
        }
        System.out.println("List - " + list);

        System.out.printf("Maximum number at the list %s is %d\n", list, list.max());

        list.remove(list.max());

        System.out.printf("Maximum number at the list %s is %d", list, list.max());
    }
}

/*
Result example:
List - [1, 2, 3, 4, 5, 4, 3, 2, 1, 0]
Maximum number at the list [1, 2, 3, 4, 5, 4, 3, 2, 1, 0] is 5
Maximum number at the list [1, 2, 3, 4, 4, 3, 2, 1, 0] is 4
 */
