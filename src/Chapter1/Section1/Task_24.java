package Chapter1.Section1;

/**
 * Ex. 1.1.24 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_24 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.24 --");
        System.out.println("Euclid(105, 24)");
        System.out.printf("Result = %d\n\n", Euclid(105,24));
        if (args.length == 2) {
            int p = Integer.parseInt(args[0]);
            int q = Integer.parseInt(args[1]);
            System.out.printf("Euclid(%d, %d) (input from args)\n", p, q);
            System.out.printf("Result = %d\n\n", Euclid(p,q));
        }
        System.out.println("Euclid(1111111, 1234567)");
        System.out.printf("Result = %d\n\n", Euclid(1111111,1234567));
    }

    private static int Euclid(int p, int q) {
        System.out.printf("p = %d    q = %d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }
}

/*
Result:

Euclid(105, 24)
p = 105    q = 24
p = 24    q = 9
p = 9    q = 6
p = 6    q = 3
p = 3    q = 0
Result = 3

Euclid(1111111, 1234567)
p = 1111111    q = 1234567
p = 1234567    q = 1111111
p = 1111111    q = 123456
p = 123456    q = 7
p = 7    q = 4
p = 4    q = 3
p = 3    q = 1
p = 1    q = 0
Result = 1
 */