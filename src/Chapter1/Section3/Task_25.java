package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.25 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_25 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.25 --");

        String x, afterX;
        List<String> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(String.valueOf(i));
        }
        System.out.println("List - " + list);

        x = "0";
        afterX = "5";
        list.insertAfterTest(x, afterX);
        System.out.printf("List after inserting Node with elem %s after Node %s - %s\n", afterX, x, list);

        x = "4";
        afterX = "5";
        list.insertAfterTest(x, afterX);
        System.out.printf("List after inserting Node with elem %s after Node %s - %s\n", afterX, x, list);
    }
}

/*
Result example:
List - [4, 3, 2, 1, 0]
List after inserting Node with elem 5 after Node 0 - [4, 3, 2, 1, 0, 5]
List after inserting Node with elem 5 after Node 4 - [4, 5, 3, 2, 1, 0, 5]
 */