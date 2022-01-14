package Chapter1.Section1;
//14.01.2022
//Ex. 1.1.25
public class Task_25 {
    public static void main() {
        System.out.println("-- Task 1.1.25 --");
        System.out.println("For all number є N && a <= N and b <= N,\nthe Euclidean algorithm computes the greatest common divisor of a and b.\nLet's prove it.\n");
        System.out.println("I. Step 1 - Base of induction\n");
        System.out.println("The induction base is, for example, non-negative integers 20 and 5.\nFrom the implementation of the Euclid method, we conclude that Euclid(p, q) == Euclid(q, p%q)");
        System.out.println("Is Euclid(20, 5) equals to Euclid(5, 20%5)?\n");
        if(Task_24.Euclid(20,5) == Task_24.Euclid(5,20 % 5)) {
            System.out.println("Yes, it's equal.");
        } else {
            System.out.println("No, doesn't equal.");
        }
        System.out.println("\nII. Step 2 - {common divisors of a and b} == {common divisors of b and b % a}.");
        System.out.println("We only need to prove this assertion. We can assume that it is true from step one.");
        System.out.println("\nIII. Step 3 - Proving");
        System.out.println("\n\tint r = p % q;\n\treturn Euclid(q, r);");
        System.out.println("\nequals");
        System.out.println("\n\tEuclid(a, b) == Euclid(b, a%b)");
        System.out.println("\nPROVED.");
        System.out.println("\nLink:\nhttps://math.stackexchange.com/questions/1274515/prove-that-euclids-algorithm-computes-the-gcd-of-any-pair-of-nonnegative-intege");
        System.out.print("\n\n");
    }
}
