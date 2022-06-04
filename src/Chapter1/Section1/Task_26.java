package Chapter1.Section1;

/**
 * Ex. 1.1.26 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_26 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.26 --");
        sort(1, 3, 2);
        sort(2, 3, 1);
    }

    private static void sort(int a, int b, int c) {
        int t = 0;
        System.out.printf("Before conversion\na = %d\tb = %d\tc = %d\n", a, b, c);
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        System.out.printf("After conversion\na = %d\tb = %d\tc = %d\n\n", a, b, c);
    }
}

/*
Result:
Before conversion
a = 1	b = 3	c = 2
After conversion
a = 1	b = 2	c = 3

Before conversion
a = 2	b = 3	c = 1
After conversion
a = 1	b = 2	c = 3
 */
