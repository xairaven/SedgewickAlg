package Chapter1.Section2;
import Chapter1.Section2.Structures.VisualCounter;

/**
 * Ex. 1.2.10 <br>
 * 29.01.2022
 * VisualCounter structure located in Chapter1.Section2.Structures
 * @author xairaven
 */
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.10 --");
        VisualCounter visualCounter = new VisualCounter(10, 5);
        visualCounter.increment();
        visualCounter.decrement();
        visualCounter.decrement();
        visualCounter.increment();
        visualCounter.increment();
        visualCounter.increment();
    }
}
