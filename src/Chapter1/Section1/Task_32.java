package Chapter1.Section1;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdIn;
//14.01.2022
//Ex. 1.1.32
public class Task_32 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.32 --");
        if(args.length < 3) {
            System.out.println("Input 3 values in command prompt.\nint N and double l and r.");
            System.out.println("For example: 10 5.5 6.3\n");
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input");
            System.exit(0);
        }
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double intervals = r - l / (double) N;
        System.out.print("\n\n");
    }
}
