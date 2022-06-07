package Chapter1.Section3;
import  Chapter1.Section3.Structures.List;

/**
 * Ex. 1.3.21 <br>
 * {@link List} structure located in Chapter1.Section3.Structures <br>
 * 07.06.2022
 * @author xairaven
 */
public class Task_21 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.21 --");

        List<String> list = new List<>();
        for (int i = 0; i < 5; i++) {
            list.push(String.valueOf(i));
        }
        System.out.println("List - " + list);

        System.out.printf("Is string <%s> on the list?\n - %b\n\n", "0", find("0", list));
        System.out.printf("Is string <%s> on the list?\n - %b", "20", find("20", list));
    }

    private static boolean find(String key, List<String> list) {
        for (String str : list) {
            if (str.equals(key)) return true;
        }
        return false;
    }
}

/*
Result example:
List - [4, 3, 2, 1, 0]
Is string <4> on the list?
 - true

Is string <20> on the list?
 - false
 */