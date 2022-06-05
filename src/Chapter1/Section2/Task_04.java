package Chapter1.Section2;
import edu.princeton.cs.algs4.StdOut;

/**
 * Ex. 1.2.4 <br>
 * 28.01.2022
 * @author xairaven
 */
public class Task_04 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.4 --");
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}

/*
Code prints:
world
hello

Explanation:
String string1 = "hello"; -> string1 = new String("hello")
String string2 = string1; -> object string2 == object string1
string1 = "world"; -> string1 = new String("world")
string2 references to String object "hello"
 */
