package Chapter1.Section3;
import  edu.princeton.cs.algs4.StdIn;
import  java.util.ArrayDeque;

/**
 * Ex. 1.3.40 <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_40 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.40 --");
        ArrayDeque<String> words = new ArrayDeque<>();
        while(!StdIn.isEmpty()) {
            String word = StdIn.readString();
            words.remove(word);
            words.addFirst(word);
            System.out.println(words);
        }

        System.out.println("\nResult: \n" + words);
    }
}

/*
Result example:
a
[a]
b
[b, a]
c
[c, b, a]
d
[d, c, b, a]
a
[a, d, c, b]
c
[c, a, d, b]
e
[e, c, a, d, b]
r
[r, e, c, a, d, b]
^D

Result:
[r, e, c, a, d, b]
 */