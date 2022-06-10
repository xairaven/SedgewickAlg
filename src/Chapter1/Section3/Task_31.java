package Chapter1.Section3;
import  Chapter1.Section3.Structures.DoublyLinkedList;

/**
 * Ex. 1.3.31 <br>
 * {@link DoublyLinkedList} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_31 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.31 --");

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.pushFirst(i);
        }
        System.out.println("List - " + list);

        for (int i = 0; i < 5; i++) {
            list.pushLast(i);
        }
        System.out.println("List - " + list);

        for (int i = 0; i < 5; i++) {
            list.deleteFirst();
        }
        System.out.println("List - " + list);

        for (int i = 0; i < 5; i++) {
            list.deleteLast();
        }
        System.out.println("List - " + list);
    }
}

/*
Result example:
List - [4, 3, 2, 1, 0]
List - [4, 3, 2, 1, 0, 0, 1, 2, 3, 4]
List - [0, 1, 2, 3, 4]
List - []
 */
