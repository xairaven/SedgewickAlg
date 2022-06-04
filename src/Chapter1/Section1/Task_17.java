package Chapter1.Section1;

/**
 * Ex. 1.1.17 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_17 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.17 --");
        System.out.println("""
                public static String exR2(int n) {
                    String s = exR2(n-3) + n + exR2(n-2) + n;
                    if (n <= 0) return "";
                    return s;
                }
                                
                Answer:
                
                The base case will never be reached.
                
                A call to exR2(3) will result in calls to
                exR2(0), exR2(-3), exR3(-6),
                and so forth until a StackOverflowError occurs.""");
    }
}
