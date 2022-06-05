package Chapter1.Section2;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.2.3 <br>
 * 28.01.2022
 * @author xairaven
 */
public class Task_03 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.3 --");
        if (args.length != 3 || Integer.parseInt(args[0]) < 0)
            throw new IllegalArgumentException("must input int value (that greater than 1) and 2 double values");

        int N = Integer.parseInt(args[0]);

        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        if (min > max) {
            double temp = min;
            min = max;
            max = temp;
        }

        Interval1D[][] intervals1D = new Interval1D[N][2];
        Interval2D[] intervals = createIntervals(N, intervals1D, min, max);
        drawIntervals(intervals, min, max);
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
    }

    private static void drawIntervals(Interval2D[] intervals, double min, double max) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        for (Interval2D interval : intervals) {
            interval.draw();
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
        return new Interval1D(first, second);
    }

    private static Interval2D[] createIntervals(int N, Interval1D[][] intervals1D, double min, double max) {
        Interval2D[] intervals = new Interval2D[N];
        for (int i = 0; i < intervals.length; i++) {
            intervals1D[i][0] = createInterval1D(min,max);
            intervals1D[i][1] = createInterval1D(min,max);
            intervals[i] = new Interval2D(intervals1D[i][0], intervals1D[i][1]);
        }
        return intervals;
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

/*
Input (command prompt) example:
6 3.3 6.1

Result example:
Amount of intersecting intervals: 7
Amount of intervals that contain other in it: 1
*/