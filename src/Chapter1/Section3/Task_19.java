package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.19 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_19 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.19 --");

        List<Integer> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(i);
        }
        System.out.println("List - " + list);

        list.deleteLastNode();

        System.out.println("List after deleting last Node - " + list);
    }
}

/*
Result:
List - [4, 3, 2, 1, 0]
List after deleting last Node - [4, 3, 2, 1]
 */
