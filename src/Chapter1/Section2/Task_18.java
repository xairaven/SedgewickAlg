package Chapter1.Section2;
import Chapter1.Section2.Structures.Accumulator;

/**
 * Ex. 1.2.18 <br>
 * 30.01.2022
 * Accumulator structure located in Chapter1.Section2.Structures
 * @author xairaven
 */
public class Task_18 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.18 --");
        Accumulator validation = new Accumulator();

        validation.addDataValue(2);
        validation.addDataValue(4);
        validation.addDataValue(5);

        System.out.println("Mean: " + validation.mean() + "\nExpected: 3.6666666666666665\n");
        System.out.println("Variance: " + validation.var() + "\nExpected:  2.333333333333333\n");
        System.out.println("Standard Deviation: " + validation.stddev() + "\nExpected: 1.5275252316519465");
    }
}
