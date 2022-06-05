package Chapter1.Section2;
import Chapter1.Section2.Structures.Transaction;
import Chapter1.Section2.Structures.SmartDate;
import edu.princeton.cs.algs4.Date;

/**
 * Ex. 1.2.19 <br>
 * 30.01.2022 <br>
 * SmartDate & Transaction structures located in Chapter1.Section2.Structures
 * @author xairaven
 */
public class Task_19 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.19 --");

        SmartDate dateExample = new SmartDate("01/30/2022");
        System.out.println(dateExample);

        Transaction transactionExample = new Transaction("xairaven",
                new Date(1, 30, 2022), 250);

        Transaction transactionCopy = new Transaction("xairaven    1/30/2022   250.00");
        System.out.println(transactionCopy);
    }
}

/*
Result example:
1/30/2022
xairaven    1/30/2022   250,00
 */