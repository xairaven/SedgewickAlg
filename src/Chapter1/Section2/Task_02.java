package Chapter1.Section2;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Interval1D;

/**
 * Ex. 1.2.2 <br>
 * 27.01.2022
 * @author xairaven
 */
public class Task_02 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.2 --");
        if (args.length != 1 || Integer.parseInt(args[0]) < 2)
            throw new IllegalArgumentException("must input int value that greater than 1");

        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];

        In in = new In();
        for(int i = 0; i < N; i++) {
            System.out.printf("Interval %d:\n", i + 1);

            double[] cords = {in.readDouble(), in.readDouble()};

            if (cords[0] > cords[1]) {
                double temp = cords[0];
                cords[0] = cords[1];
                cords[1] = temp;
            }

            intervals[i] = new Interval1D(cords[0], cords[1]);
        }

        System.out.print("\n");

        intersections(N, intervals);
    }

    private static void intersections(int N, Interval1D[] intervals) {
        boolean intersects = false;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(intervals[i].intersects(intervals[j])) {
                    intersects = true;
                    System.out.printf("\nInterval %d intersects Interval %d\n", i + 1, j + 1);
                    System.out.printf("Interval %d: %.2f - %.2f\n", i + 1, intervals[i].min(), intervals[i].max());
                    System.out.printf("Interval %d: %.2f - %.2f\n", j + 1, intervals[j].min(), intervals[j].max());
                }
            }
        }
        if (!intersects) System.out.println("Intervals don't intersect");
    }
}

/*
Input (command prompt) example:
6 (any int value > 1)

Input (standard) example:
Interval 1:
5
7
Interval 2:
4
3
Interval 3:
7
10
Interval 4:
23
45
Interval 5:
1
3
Interval 6:
5
9

Result example:
Interval 1 intersects Interval 3
Interval 1: 5,00 - 7,00
Interval 3: 7,00 - 10,00

Interval 1 intersects Interval 6
Interval 1: 5,00 - 7,00
Interval 6: 5,00 - 9,00

Interval 2 intersects Interval 5
Interval 2: 3,00 - 4,00
Interval 5: 1,00 - 3,00

Interval 3 intersects Interval 6
Interval 3: 7,00 - 10,00
Interval 6: 5,00 - 9,00
 */
