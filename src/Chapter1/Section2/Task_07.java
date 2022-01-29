package Chapter1.Section2;
//29.01.2022
//Ex. 1.2.7
public class Task_07 {
    public static void main(String s) {
        System.out.println("-- Task 1.2.7 --");
        System.out.println(mystery(s));
        System.out.print("\n\n");
    }

    private static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
}
