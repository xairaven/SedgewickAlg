package Section1;
//12.01.2021
//Ex. 1.1.16
public class Task_16 {
    public static void main(int n) {
        System.out.println("-- Task 1.1.16 --");
        System.out.println(exR1(n));
        System.out.print("\n\n");
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n-2) + n;
    }
}
