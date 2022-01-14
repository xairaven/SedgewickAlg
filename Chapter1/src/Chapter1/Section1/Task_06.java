package Chapter1.Section1;
import edu.princeton.cs.introcs.StdOut;
//11.01.2022
//Ex. 1.1.6
public class Task_06 {
    public static void main() {
        System.out.println("-- Task 1.1.6 --");
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        System.out.print("\n\n");
    }
}
