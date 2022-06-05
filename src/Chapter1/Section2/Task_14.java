package Chapter1.Section2;
import Chapter1.Section2.Structures.Transaction;
import edu.princeton.cs.algs4.Date;

/**
 * Ex. 1.2.14 <br>
 * 30.01.2022
 * Transaction structure located in Chapter1.Section2.Structures
 * @author xairaven
 */
public class Task_14 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.2.14 --");
        Transaction tr1 = new Transaction("xairaven", new Date(1, 30, 2022), 250);
        Transaction tr2 = new Transaction("xairaven", new Date(1, 30, 2022), 250);
        Transaction tr3 = new Transaction("xairaven", new Date(1, 31, 2022), 250);

        System.out.println(tr1 + "\n" + tr1 + "\n" + tr1.equals(tr1) + "\n");
        System.out.println(tr1 + "\n" + tr2 + "\n" + tr1.equals(tr2) + "\n");
        System.out.println(tr1 + "\n" + tr3 + "\n" + tr1.equals(tr3) + "\n");
    }
}

/*
Result example:
xairaven    1/30/2022   250,00
xairaven    1/30/2022   250,00
true

xairaven    1/30/2022   250,00
xairaven    1/30/2022   250,00
true

xairaven    1/30/2022   250,00
xairaven    1/31/2022   250,00
false
 */
