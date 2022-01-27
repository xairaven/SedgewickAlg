package Chapter1.Section2;
import java.awt.geom.Point2D;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;
//27.01.2022
//Ex. 1.2.1
public class Task_01 {
    public static void main(String arg) {
        System.out.println("-- Task 1.2.1 --");
        int N = Integer.parseInt(arg);
        Point2D[] points = new Point2D[N];
        Draw(points);
        System.out.printf("The shortest distance = %.3f", shortestDistance(points));
        System.out.print("\n\n");
    }

    private static void Draw(Point2D[] points) {
        StdDraw.setCanvasSize(512, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        for (int i = 0; i < points.length; i++) {
            double pointX = StdRandom.uniform();
            double pointY = StdRandom.uniform();
            Point2D.Double point = new Point2D.Double(pointX, pointY);
            StdDraw.point(point.x, point.y);
            points[i] = point;
        }
    }

    private static double shortestDistance(Point2D[] points) {
        if (points.length <= 1) return 0;
        double currentDistance;
        double shortDistance = 1;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                currentDistance = points[i].distance(points[j]);
                if (currentDistance < shortDistance) shortDistance = currentDistance;
            }
        }
        return shortDistance;
    }
}
