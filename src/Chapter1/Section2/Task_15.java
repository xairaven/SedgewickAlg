package Chapter1.Section2;
import edu.princeton.cs.algs4.In;

/**
 * Ex. 1.2.15 <br>
 * 30.01.2022
 * @author xairaven
 */
public class Task_15 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.15 --");
        int[] arr = readInts("./resources/largeW.txt");
        System.out.printf("LargeW length = %d numbers", arr.length);
    }

    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll();
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++)
            ints[i] = Integer.parseInt(words[i]);
        return ints;
    }
}
