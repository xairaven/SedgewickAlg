package Chapter1.Section4;
import  edu.princeton.cs.algs4.*;
import  java.awt.*;
import  java.util.ArrayList;
import  java.util.List;

/**
 * Ex. 1.4.3 <br>
 * 12.06.2022
 * @author xairaven
 */
public class Task_03 {
    private static int currentXScale = 50;
    private static int currentYScale = 5;

    private static ArrayList<Point2D> stdPoints;
    private static ArrayList<Point2D> lgLgPoints;

    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.3 --");

        stdPoints =  new ArrayList<>(5);
        lgLgPoints = new ArrayList<>(5);

        canvasInit(currentXScale, currentYScale);

        for (int N = 250; true; N += N) {
            double time = timeTrial(N);

            rescale(N, time);

            draw(N, time, stdPoints, true, false);
            draw(Math.log(N), Math.log(time), lgLgPoints, false, false);

            StdOut.printf("%7d %5.1f\n", N, time);
        }
    }

    private static double timeTrial(int N) {
        int MAX = 1_000_000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }

    private static void canvasInit(int scaleX, int scaleY) {
        final int CANVAS_WIDTH  = 500;
        final int CANVAS_HEIGHT = 500;

        StdDraw.setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);

        StdDraw.setXscale(0, scaleX);
        StdDraw.setYscale(0, scaleY);

        StdDraw.setPenRadius(.005);
    }

    private static void rescale(int N, double time) {
        boolean isRescaled = false;

        if (N > currentXScale) {
            currentXScale = (N < currentXScale * 2) ? currentXScale*2 : (int) (1.5 * N);
            isRescaled = true;
        }

        if (time > currentYScale) {
            currentYScale *= 2;
            isRescaled = true;
        }

        if (!isRescaled) return;

        StdDraw.clear();

        StdDraw.setXscale(0, currentXScale);
        StdDraw.setYscale(0, currentYScale);

        for (Point2D p : stdPoints) {
            draw(p.x(), p.y(), stdPoints, true, true);
        }

        for (Point2D p : lgLgPoints) {
            draw(p.x(), p.y(), lgLgPoints, false, true);
        }
    }

    private static void draw(double x, double y, List<Point2D> list, boolean isStandard, boolean isRescale) {
        if (y == Double.NEGATIVE_INFINITY) y = 0;

        var point = new Point2D(x, y);
        if (!isRescale) list.add(point);

        if (isStandard) StdDraw.setPenColor(Color.BLUE);
        else            StdDraw.setPenColor(Color.RED);

        if (list.size() > 1) {
            Point2D prevPoint = list.get(list.size() - 2);
            StdDraw.line(prevPoint.x(), prevPoint.y(), point.x(), point.y());
        }

        StdDraw.point(x, y);
    }
}
