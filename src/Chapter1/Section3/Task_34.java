package Chapter1.Section3;
import  Chapter1.Section3.Structures.RandomBag;

/**
 * Ex. 1.3.34 <br>
 * {@link RandomBag} structure located in Chapter1.Section3.Structures <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_34 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.34 --");

        var bag = new RandomBag<Integer>();
        for (int i = 0; i < 5; i++) {
            bag.add(i);
        }

        System.out.println("Bag: " + bag);

        System.out.println("Bag (iterator):");
        for (int i : bag) {
            System.out.print(i + " ");
        }
    }
}

/*
Result example:
Bag: [4, 3, 2, 1, 0]
Bag (iterator):
0 3 4 1 2
 */