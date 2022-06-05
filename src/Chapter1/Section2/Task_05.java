package Chapter1.Section2;
import edu.princeton.cs.algs4.StdOut;

/**
 * Ex. 1.2.5 <br>
 * 29.01.2022
 * @author xairaven
 */
public class Task_05 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.5 --");
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
    }
}

/*
Code prints:
Hello World

String objects are immutable — string methods return a new String object with the appropriate value
(but they do not change the value of the object that was used to invoke them).

This code ignores the objects returned and just prints the original string.
To print "WORLD", use s = s.toUpperCase() and s = s.substring(6, 11).
 */
