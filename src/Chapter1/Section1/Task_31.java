package Chapter1.Section1;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
//14.01.2022
//Ex. 1.1.31
public class Task_31 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.31 --");
        if(args.length < 2) {
            System.out.println("Input 2 values in command prompt.\nint N - number of dots.\ndouble p - chance of line");
            System.out.println("For example: 10 0.5\n(10 dots, 50% chance of drawing lines)\n");
            System.out.println("Main -> Edit configurations -> Program Arguments -> Your input");
            System.exit(0);
        }
        System.out.println("*canvas on screen*");
        int n = Integer.parseInt(args[0]); //10
        double p = Double.parseDouble(args[1]); //1
        draw(n, p);
        System.out.print("\n\n");
    }

    private static void draw(int N, double p) {
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setScale(-1.5, 1.5);
        StdDraw.setPenRadius(0.05);
        double[][] coords = new double[N][2];
        int x = 0; int y = 1;
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
                    StdDraw.line(coords[i][x], coords[i][y], coords[j][x], coords[j][y]);
                }
            }
        }
    }
}
