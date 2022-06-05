package Chapter1.Section2;

/**
 * Ex. 1.2.7 <br>
 * 29.01.2022
 * @author xairaven
 */
public class Task_07 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.7 --");
        System.out.println(mystery("xairaven"));
    }

    private static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
}

/*
Mystery method returns reversed string.
Example:
mystery("xairaven") returns "nevariax"
 */