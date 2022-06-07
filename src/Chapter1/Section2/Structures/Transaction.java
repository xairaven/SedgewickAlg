package Chapter1.Section2.Structures;
import edu.princeton.cs.algs4.Date;

/**
 * For exs. 1.2.13, 1.2.14, 1.2.19 <br>
 * Ex. 1.2.14: {@link #equals(Object)} <br>
 * Ex. 1.2.19: {@link #Transaction(String)} <br>
 * 30.01.2022
 * @author xairaven
 */
public class Transaction implements Comparable<Transaction>{
    private final String who;
    private final Date when;
    private final double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    // Ex. 1.2.19
    public Transaction(String transaction) {
        String[] values = transaction.split("\\s+");
        who = values[0];
        when = new Date(values[1]);
        amount = Double.parseDouble(values[2]);
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%-10s %10s %8.2f", who, when, amount);
    }

    @Override
    public int compareTo(Transaction that) {
        return Double.compare(this.amount, that.amount);
    }

    // Ex. 1.2.14
    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Transaction that = (Transaction) other;
        return (this.amount == that.amount) && (this.who.equals(that.who)) && (this.when.equals(that.when));
    }
}
