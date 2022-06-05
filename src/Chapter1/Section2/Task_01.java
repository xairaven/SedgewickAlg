package Chapter1.Section2;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.2.1 <br>
 * 27.01.2022
 * @author xairaven
 */
public class Task_01 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.1 --");
        if (args.length != 1 || Integer.parseInt(args[0]) < 0)
            throw new IllegalArgumentException("must input 1 arg (that > 0)");

        int N = Integer.parseInt(args[0]);
        Point2D[] points = createPoints(N);

        System.out.printf("The shortest distance = %.3f", shortestDistance(points));
        draw(points);
    }

    private static Point2D[] createPoints(int N) {
        Point2D[] points = new Point2D[N];

        for (int i = 0; i < points.length; i++) {
            double x = StdRandom.uniform();
            double y = StdRandom.uniform();

            Point2D point = new Point2D(x, y);

            points[i] = point;
        }

        return points;
    }

    private static void draw(Point2D[] points) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        for (Point2D point : points) {
            StdDraw.point(point.x(), point.y());
        }
    }

    private static double shortestDistance(Point2D[] points) {
        if (points.length <= 1) return 0;
        double currentDistance;
        double shortestDistance = Double.POSITIVE_INFINITY;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                currentDistance = points[i].distanceTo(points[j]);
                if (currentDistance < shortestDistance) shortestDistance = currentDistance;
            }
        }
        return shortestDistance;
    }
}

/*
Input (command prompt) example:
5 (int value > 0, amount of points on square)
 */
