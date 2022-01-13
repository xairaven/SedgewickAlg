package Section1;
//12.01.2021
//Ex. 1.1.18
public class Task_18 {
    public static void main() {
        System.out.println("-- Task 1.1.18 --");
        System.out.printf("(+) mystery(2, 25) = %d\n", mysteryPlus(2, 25));
        System.out.printf("(+) mystery(3, 11) = %d\n", mysteryPlus(3, 11));
        System.out.printf("(*) mystery(2, 25) = %d\n", mysteryMultiplication(2, 25));
        System.out.printf("(*) mystery(3, 11) = %d\n", mysteryMultiplication(3, 11));
        System.out.print("\n\n");
    }

    public static int mysteryPlus(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mysteryPlus(a + a, b / 2);
        return mysteryPlus(a + a, b / 2) + a;
    }

    public static int mysteryMultiplication(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteryMultiplication(a * a, b / 2);
        return mysteryMultiplication(a * a, b / 2) * a;
    }
}
