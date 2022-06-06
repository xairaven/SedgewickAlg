package Chapter1.Section3;
import  Chapter1.Section3.Structures.FixedCapacityQueue;
import  Chapter1.Section3.Structures.ResizingArrayQueue;

/**
 * Ex. 1.3.14 <br>
 * 10.02.2022  <br>
 * FixedCapacityQueue & ResizingArrayQueue structures located in Chapter1.Section3.Structures
 * @author xairaven
 */
public class Task_14 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.14 --");

        System.out.println("Fixed-size array queue:");
        FixedCapacityQueue<String> fq = new FixedCapacityQueue<>(3);
        for (int i = 1; i < 4; i++) {
            fq.enqueue(String.valueOf(i));
        }
        System.out.println("Init (max) size - 3");
        System.out.println(fq);

        System.out.println();

        System.out.println("Resizing array queue:");
        ResizingArrayQueue<String> rq = new ResizingArrayQueue<>(3);
        for (int i = 1; i < 5; i++) {
            rq.enqueue(String.valueOf(i));
        }
        System.out.println("Init size - 3");
        System.out.println(rq);
    }
}
