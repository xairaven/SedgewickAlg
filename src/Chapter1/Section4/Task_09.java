package Chapter1.Section4;

/**
 * Ex. 1.4.9 <br>
 * 13.06.2022
 * @author xairaven
 */
public class Task_09 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.4.9 --");
        System.out.println("""
                T(16) = ?
                T(2) = T(1) * 2^b
                T(4) = T(2) * 2^b
                T(8) = T(4) * 2^b
                e.t.c
                                
                so, we have that
                T(16) = T(1) * 2^b * 2^b * 2^b * 2^b
                which is equal to:
                T(16) = T(1) * ((2^b)^lgN)
                                
                For a problem of size N:
                                
                T(N0) = T = T * ((2^b)^lg1) = T * 1^b
                T(2 * N0) = T * 2^b = T * ((2^b)^lg2) = T * 2^b
                T(4 * N0) = T * 2^b * 2^b = T * ((2^b)^lg4) = T * 4^b
                ... e.t.c
                                
                So, formula is:
                T(N) = T * (N / N0)^b
                """);
    }
}
