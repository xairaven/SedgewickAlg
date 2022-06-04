package Chapter1.Section1;
import edu.princeton.cs.algs4.StdOut;

/**
 * Ex. 1.1.7 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_07 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.7 --");

        System.out.print("A) ");
        A();

        System.out.print("B) ");
        B();

        System.out.print("C) Error. Cannot resolve symbol 'N' (typo in a book (?))");
        C();
    }

    private static void A() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }

    private static void B() {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }

    private static void C() {
        /*
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < N; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
         */
    }
}

/*
Result:
A) 3.00009
B) 499500
C) Error. Cannot resolve symbol 'N' (typo in a book (?))
*/