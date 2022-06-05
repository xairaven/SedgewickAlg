package Chapter1.Section2.Structures;
import java.awt.Font;
import edu.princeton.cs.algs4.StdDraw;

/**
 * For ex. 1.2.10 <br>
 * 29.01.2022
 * @author xairaven
 */
public class VisualCounter {
    Font font = new Font("Arial", Font.BOLD, 60);

    private final int N;
    private final int max;

    private int counter;
    private int totalOperations;

    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = Math.abs(max);
    }

    public void increment() {
        if (totalOperations < N && counter < max) {
            counter++;
            totalOperations++;
            plotDraw();
        }
    }

    public void decrement() {
        if (totalOperations < N && counter < max) {
            totalOperations++;
            counter--;
            plotDraw();
        }
    }

    private void plotDraw() {
        StdDraw.setCanvasSize(300, 300);
        StdDraw.setPenRadius(0.05);
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setFont(font);
        StdDraw.text(0, 0, String.valueOf(this.counter));
    }
}
