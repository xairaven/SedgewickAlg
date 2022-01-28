package Chapter1.Section1;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdStats;
import java.util.Arrays;
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
        double intervals = (r - l) / (double) N;
        In in = new In();
        String line = in.readLine();
        String[] strValues = line.split(" ");
        double[] values = new double[strValues.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(strValues[i]);
        }
        Arrays.sort(values);
        int[] histogram = new int[N];
        for(int i = 0; i < histogram.length + 1; i++) {
            for(int j = 0; j < values.length; j++) {
                if (values[j] > (l + intervals * i) && values[j] < (l + intervals * (i + 1)) && values[j] < r) {
                    histogram[i]++;
                }
            }
        }
        draw(histogram, l, r);
        System.out.print("\n\n");
    }

    private static void draw(int[] histogram, double left, double right) {
        StdDraw.setCanvasSize(500, 500);
        int maxCount = StdStats.max(histogram);
        double minX = left - 1;
        double maxX = right + 1;
        double minY = -2;
        double maxY = maxCount + 2;
        StdDraw.setXscale(minX, maxX);
        StdDraw.setYscale(minY, maxY);
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        double HISTOGRAM = (double) histogram.length/2;
        double interval = 0;
        double valueInterval = (right - left) / histogram.length;
        if(histogram.length % 2 == 0) {
            interval = 1;
        } else {
            interval = 1.5;
        }
        for (int i = 0; i < histogram.length; i++) {
            System.out.printf("%d\t", histogram[i]);
        }
        for(int x = 0; x < histogram.length; x++) {
            double minValue = left + (valueInterval * x);
            double maxValue = minValue + valueInterval;
            String intervalDescription = String.format("(%.2f - %.2f)", minValue, maxValue);
            StdDraw.text(left + (x + 0.5) * interval, -0.25, intervalDescription);
        }
        for (int i = 0; i < histogram.length; i++) {
            double x = left + (i + 0.5) * interval;
            double y = histogram[i] / 2.0;
            double halfWidth = 0.3;
            double halfHeight = histogram[i] / 2.0;
            StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
        }
    }
}
