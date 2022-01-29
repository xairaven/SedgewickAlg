package Chapter1.Section2;
import java.util.Arrays;
//29.01.2022
//Ex. 1.2.8
public class Task_08 {
    public static void main() {
        System.out.println("-- Task 1.2.8 --");
        int[] a = {0, 1, 2, 3, 4}; //Supposing that a[] and b[] are
        int[] b = {5, 6, 7, 8, 9}; //each integer arrays consisting of millions of integers :D
        System.out.printf("Before conversion\nArray A: %s\nArray B: %s\n\n", Arrays.toString(a), Arrays.toString(b));

        int[] t = a; a = b; b = t;
        System.out.printf("After conversion\nArray A: %s\nArray B: %s\n", Arrays.toString(a), Arrays.toString(b));

        System.out.println("Just swapping array links");
        System.out.print("\n\n");
    }
}
