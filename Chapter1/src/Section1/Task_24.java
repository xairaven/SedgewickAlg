package Section1;
//14.01.2022
//Ex. 1.1.24
public class Task_24 {
    public static void main(String[] args) {
        System.out.println("-- Task 1.1.24 --");
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
        System.out.print("\n\n");
    }

    public static int Euclid(int p, int q) {
        System.out.printf("p = %d    q = %d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }
}
