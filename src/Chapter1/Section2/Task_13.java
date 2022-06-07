package Chapter1.Section2;
import  Chapter1.Section2.Structures.Transaction;
import  edu.princeton.cs.algs4.Date;

/**
 * Ex. 1.2.13 <br>
 * {@link Transaction} structure located in Chapter1.Section2.Structures <br>
 * 30.01.2022
 * @author xairaven
 */
public class Task_13 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.13 --");
        Transaction transaction = new Transaction("xairaven", new Date(1, 30, 2022),  250);
        System.out.println(transaction);
    }
}

