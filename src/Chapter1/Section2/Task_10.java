package Chapter1.Section2;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

//29.01.2022
//Ex. 1.2.10
public class Task_10 {
    public static void main() {
        System.out.println("-- Task 1.2.10 --");
        VisualCounter visualCounter = new VisualCounter(6, 4);
        visualCounter.increment();
        visualCounter.decrement();
        visualCounter.decrement();
        visualCounter.increment();
        visualCounter.increment();
        visualCounter.increment();
        System.out.print("\n\n");
    }
}

class VisualCounter {
    Font font = new Font("Arial", Font.BOLD, 60);

    private final int N;
    private final int max;

    private int totalOperations;
    private int counter = 0;

    public VisualCounter (int N, int max) {
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
        if (totalOperations < N && counter < max){
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
