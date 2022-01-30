package Chapter1.Section2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
//30.01.2022
//Ex. 1.2.19
public class Task_19 {
    public static void main() {
        System.out.println("-- Task 1.2.19 --");
        SmartDateWeekParse dateExample = new SmartDateWeekParse("01/30/2022");
        System.out.println(dateExample);
        edu.princeton.cs.algs4.Date date = new edu.princeton.cs.algs4.Date(1, 30, 2022);
        TransactionParse transactionExample = new TransactionParse("xairaven", date, "$", 250);
        TransactionParse transactionCopy = new TransactionParse(transactionExample);
        System.out.println(transactionCopy);
        System.out.print("\n\n");
    }
}

class SmartDateWeekParse {
    private final int day;
    private final int month;
    private final int year;

    public SmartDateWeekParse(int day, int month, int year) {
        if (!isDateValid(day, month, year)) {
            throw new RuntimeException("Invalid date!");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public SmartDateWeekParse(String date)
    {
        String[] fields = date.split("/");
        this.month = Integer.parseInt(fields[0]);
        this.day = Integer.parseInt(fields[1]);
        this.year = Integer.parseInt(fields[2]);
        if (!isDateValid(day, month, year)) {
            throw new RuntimeException("Invalid date!");
        }
    }

    public int day() {
        return day;
    }

    public int month() {
        return month;
    }

    public int year() {
        return year;
    }

    private boolean isDateValid(int day, int month, int year) {
        int[] monthDaysMax = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return !(day < 1 || month < 1 || month > 12 || year < 1 || day > monthDaysMax[month - 1]);
    }

    public String dayOfTheWeek() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
        Date myDate = null;
        try {
            myDate = sdf.parse(this.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sdf.applyPattern("EEEE");
        return sdf.format(myDate);
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day(), month(), year());
    }
}

class TransactionParse {
    private final String who;
    private final edu.princeton.cs.algs4.Date when;
    private final String currency;
    private final double amount;

    public TransactionParse(String who, edu.princeton.cs.algs4.Date when, String currency, double amount) {
        this.who = who;
        this.when = when;
        this.currency = currency;
        this.amount = amount;
    }

    public TransactionParse(TransactionParse a) {
        String[] values = a.toString().split(" ");
        who = values[0];
        amount = Double.parseDouble(values[2].replaceAll(",", "."));
        currency = values[3];
        when = new edu.princeton.cs.algs4.Date(values[5]);
    }

    public String who() {
        return who;
    }

    public edu.princeton.cs.algs4.Date when() {
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
        return String.format("%s spent %.1f %s on %s", who(), amount(), currency(), when());
    }
}