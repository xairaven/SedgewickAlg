package Chapter1.Section1;

/**
 * Ex. 1.1.16 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_16 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.16 --");
        System.out.println(exR1(6));
    }

    private static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}

/*
Result for 6:
311361142246
 */
