package Chapter1.Section1;
import edu.princeton.cs.algs4.StdOut;
//12.01.2022
//Ex. 1.1.7
public class Task_07 {
    public static void main() {
        System.out.println("-- Task 1.1.7 --");
        System.out.print("\ta)");
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("\t%.5f\n", t);
        System.out.print("\tb)");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.printf("\t%d\n", sum);
        System.out.print("\tc)");/*
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < N; j++) {
                sum++;
            }
        }
        StdOut.printf("\t%d\n", sum);*/
        StdOut.printf("\tError.");
        System.out.print("\n\n");
    }
}
