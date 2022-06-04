package Chapter1.Section1;

/**
 * Ex. 1.1.5 <br>
 * 11.01.2022
 * @author xairaven
 */
public class Task_05 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.5 --");

        System.out.printf("%-30s %b\n", "For x = 0.5, y = 1:", isBetween0And1(0.5, 1));
        System.out.printf("%-30s %b\n", "For x = 8,   y = 2.3:", isBetween0And1(8, 2.3));
        System.out.printf("%-30s %b\n", "For x = 0.2, y = 0.9:", isBetween0And1(0.2, 0.9));
    }

    private static boolean isBetween0And1 (double x, double y) {
        return ((x > 0 && x < 1) && (y > 0 && y < 1));
    }
}

/*
Result:
For x = 0.5, y = 1:            false
For x = 8,   y = 2.3:          false
For x = 0.2, y = 0.9:          true
*/
