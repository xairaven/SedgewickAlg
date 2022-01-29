package Chapter1.Section2;
//29.01.2022
//Ex. 1.2.6
public class Task_06 {
    public static void main() {
        System.out.println("-- Task 1.2.6 --");
        String s = "abcdef";
        String t = "defigh";
        System.out.printf("String 1: %s\nString 2: %s\nCircular Rotation: %s\n\n", s, t, isCircularRotation(s, t));
        s = "abcdef";
        t = "defabc";
        System.out.printf("String 1: %s\nString 2: %s\nCircular Rotation: %s\n\n", s, t, isCircularRotation(s, t));
        System.out.print("\n\n");
    }

    private static boolean isCircularRotation(String s, String t) {
        return (s + s).contains(t) && s.length() == t.length();
    }
}
