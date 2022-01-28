package Chapter1.Section2;
import edu.princeton.cs.algs4.StdOut;
//28.01.2022
//Ex. 1.2.4
public class Task_04 {
    public static void main() {
        System.out.println("-- Task 1.2.4 --");
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
        System.out.print("\n\n");
        //object string2 == object string1
        //string1 = "world" //string1 = new String("hello")
    }
}
