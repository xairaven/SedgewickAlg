package Chapter1.Section3;
import  Chapter1.Section3.Structures.DoublingStackOfStrings;

/**
 * Ex. 1.3.8 <br>
 * 03.02.2022 <br>
 * DoublingStackOfStrings structure located in Chapter1.Section3.Structures
 * @author xairaven
 */
public class Task_08 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.8 --");
        String str = "it was - the best - of times - - - it was - the - -";

        DoublingStackOfStrings stack = new DoublingStackOfStrings();
        String[] arr = str.split(" ");
        for (String item : arr) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.printf("%s ", stack.pop());
            }
        }

        System.out.printf("\nContains: %s", stack);
        System.out.printf("\nSize of array - %d", stack.sizeOfArray());
        System.out.printf("\n(%d left on stack)", stack.size());
    }
}

/*
Result:
was best times of the was the it
Contains: [it]
Size of array - 2
(1 left on stack)
 */