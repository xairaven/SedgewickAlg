package Chapter1.Section1;

/**
 * Ex. 1.1.9 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_09 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.9 --");
        System.out.println("Binary representation of numbers.");
        System.out.printf("%-5s %5s\n", "52:", integerToBinaryString(52));
        System.out.printf("%-5s %5s\n", "32:", integerToBinaryString(32));
        System.out.printf("%-5s %5s\n", "2:", integerToBinaryString(2));
    }

    private static String integerToBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }

        return s;
    }
}

/*
Result:
Binary representation of numbers.
52:   110100
32:   100000
2:       10
 */


