package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.28 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_28 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.28 --");

        List<Integer> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(i);
        }
        for (int i = 5; i > 0; i--) {
            list.push(i);
        }
        System.out.println("List - " + list);

        System.out.printf("Maximum number at the list %s is %d\n", list, list.maxRecursive());

        list.remove(list.maxRecursive());

        System.out.printf("Maximum number at the list %s is %d", list, list.maxRecursive());
    }
}
