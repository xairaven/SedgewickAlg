package Chapter1.Section4;

/**
 * Ex. 1.4.1 <br>
 * 11.06.2022
 * @author xairaven
 */
public class Task_01 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.1 --");
        System.out.println("""
                Counting argument:
                When choosing the first element there are N possibilities.
                When choosing the second element there are N - 1 possibilities.
                When choosing the third element there are N - 2 possibilities.
                                
                This is a total of N(N - 1)(N - 2). If the order of items mattered, this would be the result.
                However, the order of items does not matter. For 3 items there is a total of 3! possible orderings.
                3! = 6
                                
                So, the number of triples that can be chosen from N items is equal to:
                N(N - 1)(N - 2) / 6
                                
                By induction:
                Let's define the number of different triples that can be chosen from N elements as P(N).
                Let's assume that P(N) = N(N - 1)(N - 2) / 6 and consider the base cases.
                                
                N = 1       P(N) = 1(1 - 1)(1 - 2) / 6 = 0
                N = 2       P(N) = 2(2 - 1)(2 - 2) / 6 = 0
                N = 3       P(N) = 3(3 - 1)(3 - 2) / 6 = 1
                                
                And we can see that P(N) holds for those.
                                
                Now if we assume that:
                                
                P(N) = N(N - 1)(N - 2) / 6
                                
                and we prove that:
                                
                P(N + 1) = (N + 1)N(N - 1) / 6 [*]
                                
                then P(N) holds for any arbitrary N.
                                
                P(N + 1) = P(N) + (number of new triples that contain the newly inserted N + 1)
                                
                There are exactly "N choose K" new triples that contain N + 1, so:
                                
                P(N + 1) = P(N) + N! / 2!(N - 2)!
                         = P(N) + N(N - 1) / 2
                         = N(N - 1)(N - 2) / 6 + N(N - 1) / 2
                         = N(N - 1)(N - 2) / 6 + 3N(N - 1) / 6
                         = N(N - 1)(N - 2 + 3) / 6
                         = N(N - 1)(N + 1) / 6
                     
                And [*] is proven.
                """);
    }
}
