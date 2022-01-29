package Chapter1.Section2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//30.01.2022
//Ex. 1.2.12
public class Task_12 {
    public static void main()  {
        System.out.println("-- Task 1.2.12 --");
        SmartDateWeek niceDate = new SmartDateWeek(30, 1, 2022);
        System.out.println(niceDate.dayOfTheWeek());
        System.out.print("\n\n");
    }
}

class SmartDateWeek {
    private final int day;
    private final int month;
    private final int year;

    public SmartDateWeek(int day, int month, int year) {
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
