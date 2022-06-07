package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.2.24 <br>
 * {@link List} structure located in Chapter1.Section2.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_24 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.24 --");

        String str;
        List<String> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(String.valueOf(i));
        }
        System.out.println("List - " + list);

        str = "0";
        list.removeAfterTest(str);
        System.out.printf("List after deleting Node after %s - %s\n", str, list);

        str = "4";
        list.removeAfterTest(str);
        System.out.printf("List after deleting Node after %s - %s", str, list);
    }
}

/*
Result example:
List - [4, 3, 2, 1, 0]
List after deleting Node after 0 - [4, 3, 2, 1, 0]
List after deleting Node after 4 - [4, 2, 1, 0]
 */
