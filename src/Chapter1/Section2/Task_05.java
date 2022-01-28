package Chapter1.Section2;
import edu.princeton.cs.algs4.StdOut;
//29.01.2022
//Ex. 1.2.5
public class Task_05 {
    public static void main() {
        System.out.println("-- Task 1.2.5 --");
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
        //Result = "Hello World" because String objects are immutable
        System.out.print("\n\n");
    }
}
