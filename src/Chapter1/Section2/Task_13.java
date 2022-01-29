package Chapter1.Section2;
import edu.princeton.cs.algs4.Date;
//30.01.2022
//Ex. 1.2.13
public class Task_13 {
    public static void main() {
        System.out.println("-- Task 1.2.13 --");
        Date date = new Date(1, 30, 2022);
        Transaction transaction = new Transaction("xairaven", date, "$", 250);
        System.out.println(transaction);
        System.out.print("\n\n");
    }
}

class Transaction {
    private final String who;
    private final Date when;
    private final String currency;
    private final double amount;

    public Transaction(String who, Date when, String currency, double amount) {
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
}
