package Chapter1.Section1;

/**
 * Ex. 1.1.25 <br>
 * 14.01.2022
 * @author xairaven
 */
public class Task_25 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.25 --");
        System.out.println("""
                For all number є N && a <= N and b <= N,
                the Euclidean algorithm computes the greatest common divisor of a and b.
                Let's prove it.
                
                I. Step 1 - Base of induction
                The induction base is, for example, non-negative integers 20 and 5.
                From the implementation of the Euclid method, we conclude that Euclid(p, q) == Euclid(q, p%q)
                
                Is Euclid(20, 5) equals to Euclid(5, 20%5)?
                Yes, it's equal.
                
                II. Step 2 - {common divisors of a and b} == {common divisors of b and b % a}.
                We only need to prove this assertion. We can assume that it is true from step one.
                
                III. Step 3 - Proving
                int r = p % q;
                return Euclid(q, r);
                
                equals
                
                Euclid(a, b) == Euclid(b, a%b)
                
                PROVED.
                
                Link:
                https://math.stackexchange.com/questions/1274515/prove-that-euclids-algorithm-computes-the-gcd-of-any-pair-of-nonnegative-intege
                """);
    }
}
