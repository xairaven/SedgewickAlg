package Chapter1.Section2;
import edu.princeton.cs.algs4.In;
//30.01.2022
//Ex. 1.2.15
public class Task_15 {
    public static void main() {
        System.out.println("-- Task 1.2.15 --");
        int[] arr = readInts("./resources/largeW.txt");
        System.out.printf("LargeW length = %d numbers", arr.length);
        System.out.print("\n\n");
    }

    public static int[] readInts(String name)
    {
        In in = new In(name);
        String[] fields = in.readAllStrings();
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Integer.parseInt(fields[i]);
        return vals;
    }
}
