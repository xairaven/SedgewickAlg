package Chapter1.Section1;
//14.01.2022
//Ex. 1.1.26
public class Task_26 {
    public static void main(int a, int b, int c, int t) {
        System.out.println("-- Task 1.1.26 --");
        System.out.printf("Before conversion\na = %d\tb = %d\tc = %d\tt= %d\n\n", a, b, c, t);
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        System.out.printf("After conversion\na = %d\tb = %d\tc = %d\tt= %d\n", a, b, c, t);
        System.out.print("\n\n");
    }
}
