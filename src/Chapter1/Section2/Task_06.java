package Chapter1.Section2;

/**
 * Ex. 1.2.6 <br>
 * 29.01.2022
 * @author xairaven
 */
public class Task_06 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.6 --");
        String s = "abcdef";
        String t = "defigh";
        System.out.printf("String 1: %s\nString 2: %s\nCircular Rotation: %s\n\n", s, t, isCircularRotation(s, t));
        s = "abcdef";
        t = "defabc";
        System.out.printf("String 1: %s\nString 2: %s\nCircular Rotation: %s\n\n", s, t, isCircularRotation(s, t));
    }

    private static boolean isCircularRotation(String s, String t) {
        return (s + s).contains(t) && s.length() == t.length();
    }
}

/*
Result example:
String 1: abcdef
String 2: defigh
Circular Rotation: false

String 1: abcdef
String 2: defabc
Circular Rotation: true
 */
