package Chapter1.Section1;

/**
 * Ex. 1.1.18 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_18 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.18 --");
        System.out.printf("(+) mystery(2, 25) = %d\n", mystery(2, 25));
        System.out.printf("(+) mystery(3, 11) = %d\n", mystery(3, 11));
        System.out.println("(+) mystery computes a * b\n");

        System.out.printf("(*) mystery(2, 25) = %d\n", anotherMystery(2, 25));
        System.out.printf("(*) mystery(3, 11) = %d\n", anotherMystery(3, 11));
        System.out.println("(*) mystery computes a ^ b\n");
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    public static int anotherMystery(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return anotherMystery(a*a, b/2);
        return anotherMystery(a*a, b/2) + a;
    }
}

/*
Result:
(+) mystery(2, 25) = 50
(+) mystery(3, 11) = 33
(+) mystery computes a * b

(*) mystery(2, 25) = 65795
(*) mystery(3, 11) = 6574
(*) mystery computes a ^ b
 */
