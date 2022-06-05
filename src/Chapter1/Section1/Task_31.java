package Chapter1.Section1;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Ex. 1.1.31 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_31 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.31 --");

        if(args.length != 2) throw new IllegalArgumentException("need 2 args in a command prompt");

        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        System.out.println("*canvas on screen*");
        draw(n, p);
    }

    private static void draw(int N, double p) {
        final int x = 0;
        final int y = 1;

        StdDraw.setCanvasSize(500, 500);
        StdDraw.setScale(-1.5, 1.5);
        StdDraw.setPenRadius(0.05);
        double[][] coords = new double[N][2];

        for (int i = 0; i < N; i++) {
            coords[i][0] = Math.cos(2 * Math.PI * i / N);
            coords[i][1] = Math.sin(2 * Math.PI * i / N);
            StdDraw.point(coords[i][x], coords[i][y]);
        }

        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.GRAY);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(coords[i][x], coords[i][y],
                                 coords[j][x], coords[j][y]);
                }
            }
        }
    }
}

/*
Input:
Input 2 values in a command prompt.
int N - number of dots.
double p - chance of line

For example: 10 0.5
(10 dots, 50% chance of drawing lines)

Main -> Edit configurations -> Program Arguments -> Your input
 */
