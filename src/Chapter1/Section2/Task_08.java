package Chapter1.Section2;
import java.util.Arrays;

/**
 * Ex. 1.2.8 <br>
 * 29.01.2022
 * @author xairaven
 */
public class Task_08 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.8 --");
        int[] a = {0, 1, 2, 3, 4}; //Supposing that a[] and b[] are
        int[] b = {5, 6, 7, 8, 9}; //each integer arrays consisting of millions of integers :D
        System.out.printf("Before conversion\nArray A: %s\nArray B: %s\n\n", Arrays.toString(a), Arrays.toString(b));

        int[] t = a; a = b; b = t;
        System.out.printf("After conversion\nArray A: %s\nArray B: %s\n", Arrays.toString(a), Arrays.toString(b));
    }
}

/*
The code swaps a[] and b[] references.
It could hardly be more efficient because it does so by copying references,
so that it is not necessary to copy millions of elements.
 */
