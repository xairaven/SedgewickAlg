package Chapter1.Section2;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.algs4.Interval1D;
//27.01.2022
//Ex. 1.2.2
public class Task_02 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.2.2 --");
        if (args.length < 1 || Integer.parseInt(args[0]) < 2) {
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input (int value > 1)");
            return;
        }
        int N = Integer.parseInt(args[0]);
        In in = new In();
        Interval1D[] intervals = new Interval1D[N];
        double d1; double d2;
        for(int i = 0; i < N; i++) {
            System.out.printf("Interval %d:\n", i + 1);
            d1 = in.readDouble();
            d2 = in.readDouble();
            if (d2 < d1) {
                double temp = d1;
                d1 = d2;
                d2 = temp;
            }
            intervals[i] = new Interval1D(d1, d2);
        }
        System.out.print("\n");
        boolean intersects = false;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(intervals[i].intersects(intervals[j])) {
                    intersects = true;
                    System.out.printf("\nInterval %d intersects Interval %d\n", i + 1, j + 1);
                    System.out.printf("Interval %d: %.2f - %.2f\n", i + 1, intervals[i].min(), intervals[i].max());
                    System.out.printf("Interval %d: %.2f - %.2f\n", j + 1, intervals[j].min(), intervals[j].max());
                }
            }
        }
        if (!intersects) System.out.println("Intervals don't intersect");
        System.out.print("\n\n");
    }
}
