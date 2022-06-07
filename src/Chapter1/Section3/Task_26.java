package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.26 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_26 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.26 --");

        String key;
        List<String> list = new List<>();

        list.push("xairaven");
        list.push("Alex");
        list.push("Vlad");
        list.push("Rene"); // :D
        list.push("Vlad");
        list.push("xairaven");

        System.out.println("List - " + list);

        key = "Vlad";
        list.remove(key);
        System.out.printf("List after deleting all strings <%s> - %s\n", key, list);

        key = "xairaven";
        list.remove(key);
        System.out.printf("List after deleting all strings <%s> - %s\n", key, list);
    }
}

/*
Result example:
List - [xairaven, Vlad, Rene, Vlad, Alex, xairaven]
List after deleting all strings <Vlad> - [xairaven, Rene, Alex, xairaven]
List after deleting all strings <xairaven> - [Rene, Alex]
 */