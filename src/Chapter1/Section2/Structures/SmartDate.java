package Chapter1.Section2.Structures;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * For exs. 1.2.11, 1.2.12, 1.2.19 <br>
 * 29.01.2022
 * @author xairaven
 */
public class SmartDate {
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int month, int day, int year) {
        if (!isDateValid(day, month, year)) throw new IllegalArgumentException("invalid date!");
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Ex. 1.2.19
    public SmartDate(String smartDate) {
        String[] values = smartDate.split("/");
        this.month = Integer.parseInt(values[0]);
        this.day = Integer.parseInt(values[1]);
        this.year = Integer.parseInt(values[2]);

        if (!isDateValid(day, month, year)) throw new IllegalArgumentException("invalid date!");
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    // Ex. 1.2.12
    public String dayOfTheWeek() {
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Date date;
        Calendar calendar = Calendar.getInstance();

        try {
            date = new SimpleDateFormat("MM/dd/yyyy").parse(this.toString());
            calendar.setTime(date);
        } catch (ParseException ignored) {}

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return week[dayOfWeek - 1];
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    private boolean isDateValid(int day, int month, int year) {
        int[] monthDaysMax = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return !(day < 1 || month < 1 || month > 12 || year < 1 || day > monthDaysMax[month - 1]);
    }
}
