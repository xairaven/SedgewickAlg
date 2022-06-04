package Chapter1.Section1;

/**
 * Ex. 1.1.8 <br>
 * 12.01.2022
 * @author xairaven
 */
public class Task_08 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.1.8 --");

        System.out.print("A) ");
        System.out.println('b');

        System.out.print("B) ");
        System.out.println('b' + 'c');

        System.out.print("C) ");
        System.out.println((char) ('a' + 4));
    }
}

/*
Result:
A) b
B) 197
C) e

Explanation:
A) Converts char 'b' to String and prints it
B) Prints sum of char codes of 'b' (98) and 'c' (99)
C) Char code of 'a' is 97, 97+4 = 101, converts 101 to char -> 'e' because 'e' has code 101, prints "e"
 */
