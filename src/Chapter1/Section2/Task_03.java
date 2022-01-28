package Chapter1.Section2;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
//28.01.2022
//Ex. 1.2.3
public class Task_03 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.2.3 --");
        if (args.length < 3 || Integer.parseInt(args[0]) < 0) {
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input (1 int value > 0, 2 double values");
            return;
        }
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        if (min > max) {
            double temp = min;
            min = max;
            max = temp;
        }
        Interval2D[] intervals = new Interval2D[N];
        Interval1D[][] intervals1D = new Interval1D[N][2];
        DrawIntervals(intervals, intervals1D, min, max);
        int intersects = 0;
        int contains = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if(intervals[i].intersects(intervals[j])) {
                    intersects++;
                }
                if(isContained(intervals1D[i], intervals1D[j])) {
                    contains++;
                }
            }
        }
        System.out.printf("Amount of intersecting intervals: %d\n", intersects);
        System.out.printf("Amount of intervals that contain other in it: %d\n", contains);
        System.out.print("\n\n");
    }

    private static void DrawIntervals(Interval2D[] intervals, Interval1D[][] intervals1D, double min, double max) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        for (int i = 0; i < intervals.length; i++) {
            intervals1D[i][0] = createInterval1D(min,max);
            intervals1D[i][1] = createInterval1D(min,max);
            intervals[i] = new Interval2D(intervals1D[i][0], intervals1D[i][1]);
            intervals[i].draw();
        }
    }

    private static Interval1D createInterval1D(double min, double max) {
        double first = StdRandom.uniform(min, max);
        double second = StdRandom.uniform(min, max);
        if (first > second) {
            double temp = first;
            first = second;
            second = temp;
        }
        Interval1D interval = new Interval1D(first, second);
        return interval;
    }

    private static boolean isContained(Interval1D[] first, Interval1D[] second) {
        return ((first[0].min() <= second[0].min()
                && first[0].max() >= second[0].max()
                && first[1].min() <= second[1].min()
                && first[1].max() >= second[1].max())
                ||
                (first[0].min() >= second[0].min()
                && first[0].max() <= second[0].max()
                && first[1].min() >= second[1].min()
                && first[1].max() <= second[1].max())
        );
    }
}
