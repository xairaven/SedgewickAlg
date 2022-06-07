package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.19 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_20 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.20 --");

        int k, item;
        List<Integer> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(i);
        }
        System.out.println("List - " + list);

        k = 1;
        item = list.delete(k);
        System.out.printf("List after deleting %dth element - %s, deleted int = %d\n", k, list, item);

        k = 2;
        item = list.delete(k);
        System.out.printf("List after deleting %dth element - %s, deleted int = %d\n", k, list, item);

        k = 3;
        item = list.delete(k);
        System.out.printf("List after deleting %dth element - %s, deleted int = %d\n", k, list, item);
    }
}

/*
Result:
List - [4, 3, 2, 1, 0]
List after deleting 1th element - [3, 2, 1, 0], deleted int = 4
List after deleting 2th element - [3, 1, 0], deleted int = 2
List after deleting 3th element - [3, 1], deleted int = 0
 */