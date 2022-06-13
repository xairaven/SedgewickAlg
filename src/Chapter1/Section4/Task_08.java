package Chapter1.Section4;
import  edu.princeton.cs.algs4.In;
import  java.util.Arrays;

/**
 * Ex. 1.4.8 <br>
 * 13.06.2022
 * @author xairaven
 */
public class Task_08 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.8 --");

        if (args.length < 1) throw new IllegalArgumentException("you have to input at least 1 arg");

        In in = new In(args[0]);
        int[] values = in.readAllInts();

        System.out.println("Pairs = " + pairs(values));
    }

    private static int pairs(int[] values) {
        Arrays.sort(values);

        int count = 0;
        int currentFrequency = 1;

        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                currentFrequency++;
                if(i != values.length - 1) continue;
            }

            if (currentFrequency > 1) {
                count += (currentFrequency - 1) * currentFrequency / 2;
                currentFrequency = 1;
            }
        }
        return count;
    }
}
