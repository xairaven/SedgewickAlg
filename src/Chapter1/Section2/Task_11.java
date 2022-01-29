package Chapter1.Section2;
//29.01.2022
//Ex. 1.2.11
public class Task_11 {
    public static void main() {
        System.out.println("-- Task 1.2.11 --");
        SmartDate niceDate = new SmartDate(1, 1, 2003);
        System.out.println(niceDate.toString());
        //SmartDate badDate = new SmartDate(33, 4, 20);
        //Exception. Invalid date!
        System.out.print("\n\n");
    }
}

class SmartDate {
    private final int day;
    private final int month;
    private final int year;

    public SmartDate(int day, int month, int year) {
        if (!isDateValid(day, month, year)) {
            throw new RuntimeException("Invalid date!");
        }
        this.day = day;
        this.month = month;
        this.year = year;
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

    @Override
    public String toString() {
        return String.format("%d/%d/%d", day(), month(), year());
    }
}
