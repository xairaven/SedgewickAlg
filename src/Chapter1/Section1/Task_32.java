package Chapter1.Section1;
import java.util.ArrayList;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdStats;

/**
 * Ex. 1.1.32 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_32 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.32 --");

        if (args.length != 3) throw new IllegalArgumentException("need 3 args in a command prompt");

        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        ArrayList<Double> arr = new ArrayList<>();
        while(!StdIn.isEmpty()) {
            arr.add(StdIn.readDouble());
        }

        histogram(N, l, r, arr);
    }

    private static void histogram(int N, double l, double r, ArrayList<Double> numbers) {
        final int CANVAS_WIDTH = 1024;
        final int CANVAS_HEIGHT = 512;

        int[] numbersInInterval = histogramStats(N, l, r, numbers);
        double intervalSize = (r - l) / N;

        int maxCount = StdStats.max(numbersInInterval);

        double[] x = {l - 1, r + 1};
        double[] y = {-2, maxCount + 2};

        StdDraw.setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        StdDraw.setXscale(x[0], x[1]);
        StdDraw.setYscale(y[0], y[1]);

        double midX = x[0] + (x[1] - x[0]) / 2;
        double midY = y[0] + (y[1] - y[0]) / 2;

        // Labels
        StdDraw.text(midX, y[1] - 0.5, "Numbers in intervals");
        StdDraw.text(x[0] + 0.25, midY, "Numbers", 90);
        StdDraw.text(midX, -1.2, "Intervals");

        // X labels
        for (int i = 0; i < N; i++) {
            double minValue = l + (intervalSize * i);
            double maxValue = minValue + intervalSize - 0.01;
            String intervalDescription = String.format("[%.2f - %.2f]", minValue, maxValue);
            StdDraw.text(l + (i + 0.5) * intervalSize, -0.25, intervalDescription);
        }

        // Y labels
        for (int i = 0; i < y[1]; i++) {
            StdDraw.text(x[0] + 0.7, i, String.valueOf(i));
        }

        StdDraw.setPenColor(StdDraw.BOOK_RED);
        for (int i = 0; i < N; i++) {
            double xNum = l + (i + 0.5) * intervalSize;
            double yNum = numbersInInterval[i] / 2.0;
            double halfWidth = intervalSize / 3.0;
            double halfHeight = numbersInInterval[i] / 2.0;

            StdDraw.filledRectangle(xNum, yNum, halfWidth, halfHeight);
        }
    }

    private static int[] histogramStats(int N, double l, double r, ArrayList<Double> numbers) {
        int[] numbersInInterval = new int[N];

        double wholeInterval = r - l;
        double intervalsSize = wholeInterval / N;

        Interval1D[] intervals = new Interval1D[N];

        double currentMin = l;
        double currentMax = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < intervals.length; i++) {
            currentMax = (currentMin - (Math.pow(10, -5))) + intervalsSize;
            intervals[i] = new Interval1D(currentMin, currentMax);
            currentMin = currentMax + (Math.pow(10, -5));
        }

        for (double number : numbers) {
            int index = 0;
            for (Interval1D interval : intervals) {
                if (interval.contains(number)) {
                    numbersInInterval[index]++;
                    break;
                } else index++;
            }
        }

        return numbersInInterval;
    }
}

/*
Input:
Input 3 values in command prompt.
int N and double l and r

For example: 10 2.5 9.6
Main -> Edit configurations -> Program Arguments -> Your input

And input any numbers to standard input
For example:
2
2.5
4.3
5.5
6.6
6.7
6.8
8.3
10
Ctrl+D
 */