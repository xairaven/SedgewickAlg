package Chapter1.Section2;
import edu.princeton.cs.algs4.Date;
//30.01.2022
//Ex. 1.2.14
public class Task_14 {
    public static void main() {
        System.out.println("-- Task 1.2.14 --");
        Date date1 = new Date(1, 30, 2022);
        Date date2 = new Date(1, 31, 2022);
        TransactionEnchanced transaction1 = new TransactionEnchanced("xairaven", date1, "$", 250);
        TransactionEnchanced transaction2 = new TransactionEnchanced("xairaven", date1, "$", 250);
        TransactionEnchanced transaction3 = new TransactionEnchanced("xairaven", date2, "$", 250);
        System.out.printf("%s\n%s\n%s\n\n", transaction1, transaction1, transaction1.equals(transaction1)); //TRUE
        System.out.printf("%s\n%s\n%s\n\n", transaction1, transaction2, transaction1.equals(transaction2)); //TRUE
        System.out.printf("%s\n%s\n%s\n\n", transaction1, transaction3, transaction1.equals(transaction3)); //FALSE
        System.out.print("\n\n");
    }
}

class TransactionEnchanced {
    private final String who;
    private final Date when;
    private final String currency;
    private final double amount;

    public TransactionEnchanced(String who, Date when, String currency, double amount) {
        this.who = who;
        this.when = when;
        this.currency = currency;
        this.amount = amount;
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public String currency() {
        return currency;
    }

    public double amount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s spent %.1f%s on %s", who(), amount(), currency(), when());
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        TransactionEnchanced that = (TransactionEnchanced) x;
        if (!this.who.equals(that.who)) return false;
        if (this.when != that.when) return false;
        if (!this.currency.equals(that.currency)) return false;
        if (this.amount != that.amount) return false;
        return true;
    }
}
